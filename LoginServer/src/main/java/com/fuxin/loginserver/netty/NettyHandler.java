package com.fuxin.loginserver.netty;

import com.fuxin.common.proto.BasicProto;
import com.fuxin.common.proto.UserProto;
import com.fuxin.loginserver.service.LoginService;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Slf4j
public class NettyHandler extends ChannelInboundHandlerAdapter {
    public static final ChannelGroup clients = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    private final LoginService loginService;

    NettyHandler(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws InvalidProtocolBufferException {
        BasicProto.BaseReq baseReq = (BasicProto.BaseReq) msg;
        log.info("收到消息: " + baseReq.toString());

        if (baseReq.getOrder().equals(BasicProto.DataOrderType.ORDER_LOGIN)) {
            UserProto.LoginRequest request = UserProto.LoginRequest.parseFrom(baseReq.getBody());
            log.info("【ORDER_LOGIN】请求：" + request);
            UserProto.LoginResponse loginResponse = loginService.login(request);

            if (!ObjectUtils.isEmpty(loginResponse)) {
                ByteString resBody = loginResponse.toByteString();
                receiveMessage(BasicProto.ResStatus.STATUS_SUCCESS, "Code:200", resBody, ctx);
            } else {
                receiveMessage(BasicProto.ResStatus.STATUS_ERROR, "Code:500", ByteString.EMPTY, ctx);
            }
            log.info("【ORDER_LOGIN】结果：" + loginResponse);
        }
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) {
        log.info("新的客户端链接：" + ctx.channel().id().asShortText());
        clients.add(ctx.channel());
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) {
        log.info("客户端断开链接：" + ctx.channel().id().asShortText());
        clients.remove(ctx.channel());
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        log.info("客户端发生错误：" + ctx.channel().id().asShortText() + "  " + cause.getMessage());
        ctx.channel().close();
        clients.remove(ctx.channel());
    }

    private void receiveMessage(BasicProto.ResStatus status, String msg, ByteString body, ChannelHandlerContext ctx) {
        BasicProto.BaseRes baseRes = BasicProto.BaseRes.newBuilder().setStatus(status).setMsg(msg).setBody(body).build();
        ByteBuf response = Unpooled.copiedBuffer(baseRes.toByteArray());
        ctx.writeAndFlush(response);
    }
}