package com.jn.xingdaba.system.application.controller;

import com.jn.core.api.ServerResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public ServerResponse<String> success() {
        log.info("jn-xingdaba-system test success");
        return ServerResponse.success("test success");
    }
}
