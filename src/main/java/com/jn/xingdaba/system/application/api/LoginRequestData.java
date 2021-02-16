package com.jn.xingdaba.system.application.api;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Data
@Validated
public final class LoginRequestData {
    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
