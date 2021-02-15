package com.jn.xingdaba.system.infrastructure.exception;

public enum AccountError implements ManagementError {

    LOGIN_ERROR(1530, "用户名或密码错误")
    ;

    private final int errorCode;
    private final String errorMessage;

    AccountError(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    @Override
    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }
}
