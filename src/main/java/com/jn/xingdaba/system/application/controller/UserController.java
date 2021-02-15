package com.jn.xingdaba.system.application.controller;

import com.jn.core.api.ServerResponse;
import com.jn.xingdaba.system.application.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ServerResponse<String> login(String username, String password) {
        return ServerResponse.success(userService.login(username, password));
    }
}
