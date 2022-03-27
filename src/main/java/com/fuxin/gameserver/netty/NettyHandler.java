package com.fuxin.gameserver.netty;

import io.netty.channel.Channel;
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
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        // 由于我们配置的是 字节数组 编解码器，所以这里取到的用户发来的数据是 byte数组
        byte[] data = (byte[]) msg;
        log.info("收到消息: " + new String(data));
        for (Channel client : clients) {
            if (!client.equals(ctx.channel())) {
                client.writeAndFlush(data);
            }
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