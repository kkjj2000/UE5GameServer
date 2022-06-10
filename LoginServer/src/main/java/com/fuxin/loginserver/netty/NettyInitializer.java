package com.fuxin.loginserver.netty;

import com.fuxin.common.proto.BasicProto;
import com.fuxin.loginserver.service.LoginService;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class NettyInitializer extends ChannelInitializer<SocketChannel> {

    private final LoginService loginService;

    @Autowired
    public NettyInitializer(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    protected void initChannel(SocketChannel socketChannel) {
        ChannelPipeline pipeline = socketChannel.pipeline();
        pipeline.addLast("encoder", new ProtobufEncoder());
        pipeline.addLast("decoder", new ProtobufDecoder(BasicProto.BaseReq.getDefaultInstance()));
        pipeline.addLast(new NettyHandler(loginService));
    }
}