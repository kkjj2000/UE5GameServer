package com.fuxin.loginserver.service;

import com.fuxin.common.proto.UserProto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public UserProto.LoginResponse login(UserProto.LoginRequest loginRequest) {
        UserProto.UserInfo userInfo = UserProto.UserInfo.newBuilder()
                .setUserId(UUID.randomUUID().toString())
                .setToken(UUID.randomUUID().toString())
                .setUsername("E9C50")
                .setLevel(500)
                .setStatus(1)
                .build();

        return UserProto.LoginResponse.newBuilder()
                .setLobbyHost("192.168.50.10")
                .setLobbyPort(10085)
                .setUser(userInfo)
                .build();
    }

    @Override
    public UserProto.UserInfo getUserInfo(String userId) {
        return null;
    }
}
