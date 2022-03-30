package com.fuxin.lobbyserver.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Slf4j
@Component
public class NettyServer {
    @Resource
    private NettyInitializer nettyInitializer;

    @Getter
    private ServerBootstrap serverBootstrap;

    @Value("${netty.port}")
    private int port;
    @Value("${netty.bossThread}")
    private int bossThread;

    public void start() {
        this.init();
        this.serverBootstrap.bind(this.port);
        log.info("Netty started on port: {} (TCP) with boss thread {}", this.port, this.bossThread);
    }

    private void init() {
        NioEventLoopGroup bossGroup = new NioEventLoopGroup(this.bossThread);
        NioEventLoopGroup workerGroup = new NioEventLoopGroup();
        this.serverBootstrap = new ServerBootstrap();
        this.serverBootstrap
                .group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(this.nettyInitializer);
    }
}