package com.refactorizando.hexagonalarchitecture.infrastructure.exception.spring;

import com.refactorizando.hexagonalarchitecture.application.exception.AppException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class SpringExceptionHandler {

    @ExceptionHandler(AppException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public AppException appException() {
        return new AppException();
    }
}
