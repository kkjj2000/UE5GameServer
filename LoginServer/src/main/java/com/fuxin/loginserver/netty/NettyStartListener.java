package com.fuxin.loginserver.netty;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class NettyStartListener implements ApplicationRunner {
    @Resource
    private NettyServer nettyServer;

    @Override
    public void run(ApplicationArguments args) {
        this.nettyServer.start();
    }
}