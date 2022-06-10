package com.fuxin.loginserver.service;

import com.fuxin.common.proto.UserProto;

public interface LoginService {
    UserProto.LoginResponse login(UserProto.LoginRequest loginRequest);

    UserProto.UserInfo getUserInfo(String userId);
}
