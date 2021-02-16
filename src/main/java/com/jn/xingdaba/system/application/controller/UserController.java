package com.jn.xingdaba.system.application.controller;

import com.jn.core.api.ServerResponse;
import com.jn.xingdaba.system.application.api.LoginRequestData;
import com.jn.xingdaba.system.application.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@Slf4j
@Validated
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ServerResponse<String> login(@RequestBody @NotNull LoginRequestData requestData) {
        return ServerResponse.success(userService.login(requestData));
    }
}
