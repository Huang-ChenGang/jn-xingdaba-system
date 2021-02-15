package com.jn.xingdaba.system.infrastructure.handler;

import com.jn.core.api.ServerResponse;
import com.jn.core.exception.JNException;
import com.jn.xingdaba.system.infrastructure.exception.JwtException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static com.jn.xingdaba.system.infrastructure.exception.JwtError.MANAGEMENT_SYSTEM_ERROR;

@Slf4j
@RestControllerAdvice
public class ManagementExceptionHandler extends ResponseEntityExceptionHandler {

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler({
            JwtException.class
    })
    public ServerResponse<Void> handleLogicError(JNException exception) {
        log.error("universal logic error", exception);
        return ServerResponse.error(exception.getJNError());
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({
            IllegalStateException.class,
            IllegalArgumentException.class
    })
    public ServerResponse<Void> handleSystemError(RuntimeException exception) {
        log.error("universal system error", exception);
        return ServerResponse.error(MANAGEMENT_SYSTEM_ERROR);
    }
}
