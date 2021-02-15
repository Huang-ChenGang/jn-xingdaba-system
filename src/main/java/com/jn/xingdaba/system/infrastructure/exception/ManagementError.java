package com.jn.xingdaba.system.infrastructure.exception;

import com.jn.core.exception.JNError;

public interface ManagementError extends JNError {
    default int getServiceCode() {
        return 2;
    }
}
