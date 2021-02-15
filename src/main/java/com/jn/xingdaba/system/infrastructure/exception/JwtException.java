package com.jn.xingdaba.system.infrastructure.exception;

import com.jn.core.exception.JNError;
import com.jn.core.exception.JNException;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class JwtException extends JNException {
    public JwtException(@NotNull JNError error) {
        super(error);
    }

    public JwtException(@NotNull JNError error, Throwable cause) {
        super(error, cause);
    }

    public JwtException(@NotNull JNError error, @NotBlank String message) {
        super(error, message);
    }
}
