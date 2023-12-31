package com.jn.xingdaba.system.infrastructure.exception;

public enum JwtError implements ManagementError {

    PARSE_JWT_ERROR(1100, "解析JWT异常"),
    TOKEN_EXPIRED(1110, "Token过期"),
    CREATE_JWT_ERROR(1120, "创建JWT异常")
    ;

    private final int errorCode;
    private final String errorMessage;

    JwtError(int errorCode, String errorMessage) {
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
