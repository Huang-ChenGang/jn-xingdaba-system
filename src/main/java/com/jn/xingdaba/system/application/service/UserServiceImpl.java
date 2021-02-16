package com.jn.xingdaba.system.application.service;

import com.jn.xingdaba.system.application.api.LoginRequestData;
import com.jn.xingdaba.system.infrastructure.JwtTokenCreator;
import com.jn.xingdaba.system.infrastructure.config.JwtAudienceConfig;
import com.jn.xingdaba.system.infrastructure.exception.AccountException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

import static com.jn.xingdaba.system.infrastructure.exception.AccountError.LOGIN_ERROR;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    private final JwtTokenCreator jwtTokenCreator;
    private final JwtAudienceConfig jwtAudienceConfig;

    public UserServiceImpl(JwtTokenCreator jwtTokenCreator, JwtAudienceConfig jwtAudienceConfig) {
        this.jwtTokenCreator = jwtTokenCreator;
        this.jwtAudienceConfig = jwtAudienceConfig;
    }

    @Override
    public String login(@NotNull LoginRequestData requestData) {
        log.info("login request data: {}", requestData);

        if (!"admin".equals(requestData.getUsername()) || !"1Qaz@Wsx".equals(requestData.getPassword())) {
            throw new AccountException(LOGIN_ERROR);
        }

        return jwtTokenCreator.createJWT("admin", "admin",  "admin", jwtAudienceConfig);
    }
}
