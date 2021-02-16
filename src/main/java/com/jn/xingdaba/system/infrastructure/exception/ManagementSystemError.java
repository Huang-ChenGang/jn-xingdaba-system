package com.jn.xingdaba.system.infrastructure.exception;

public enum  ManagementSystemError implements ManagementError {
    BAD_REQUEST(400, "请求参数错误"),
    MANAGEMENT_SYSTEM_ERROR(500, "后台管理服务系统异常")
    ;

    private final int errorCode;
    private final String errorMessage;

    ManagementSystemError(int errorCode, String errorMessage) {
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
