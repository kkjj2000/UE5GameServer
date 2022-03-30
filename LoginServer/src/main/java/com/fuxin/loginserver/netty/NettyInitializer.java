package com.fuxin.loginserver.netty;

import com.fuxin.common.proto.BasicProto;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import org.springframework.stereotype.Component;


@Component
public class NettyInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel socketChannel) {
        ChannelPipeline pipeline = socketChannel.pipeline();
        pipeline.addLast("encoder", new ProtobufEncoder());
        pipeline.addLast("decoder", new ProtobufDecoder(BasicProto.BaseReq.getDefaultInstance()));
        pipeline.addLast(new NettyHandler());
    }
}