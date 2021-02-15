package com.jn.xingdaba.system.infrastructure.exception;

public enum JwtError implements ManagementError {

    MANAGEMENT_SYSTEM_ERROR(500, "后台管理服务系统异常"),
    PARSE_JWT_ERROR(1500, "解析JWT异常"),
    TOKEN_EXPIRED(1510, "Token过期"),
    CREATE_JWT_ERROR(1520, "创建JWT异常")
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
