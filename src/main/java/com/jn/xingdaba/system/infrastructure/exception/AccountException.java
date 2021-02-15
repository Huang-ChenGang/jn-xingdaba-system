package com.jn.xingdaba.system.infrastructure.exception;

import com.jn.core.exception.JNError;
import com.jn.core.exception.JNException;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AccountException extends JNException {
    public AccountException(@NotNull JNError error) {
        super(error);
    }

    public AccountException(@NotNull JNError error, Throwable cause) {
        super(error, cause);
    }

    public AccountException(@NotNull JNError error, @NotBlank String message) {
        super(error, message);
    }
}
