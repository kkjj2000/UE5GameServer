package com.fuxin.loginserver.netty;

import com.fuxin.common.proto.BasicProto;
import com.fuxin.common.proto.UserProto;
import com.google.protobuf.InvalidProtocolBufferException;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NettyHandler extends ChannelInboundHandlerAdapter {
    public static final ChannelGroup clients = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws InvalidProtocolBufferException {
        BasicProto.BaseReq baseReq = (BasicProto.BaseReq) msg;
        log.info("收到消息: " + baseReq.toString());
        if (baseReq.getOrder() == 1) {
            UserProto.LoginRequest loginRequest = UserProto.LoginRequest.parseFrom(baseReq.getBody());
            log.info("请求登录：" + loginRequest.toString());
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
}