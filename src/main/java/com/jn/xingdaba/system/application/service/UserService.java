package com.jn.xingdaba.system.application.service;

import com.jn.xingdaba.system.application.api.LoginRequestData;

import javax.validation.constraints.NotNull;

public interface UserService {
    String login(@NotNull LoginRequestData requestData);
}
