package com.refactorizando.hexagonalarchitecture.application.exception;

public class AppException extends Exception{
    private String mensaje;

    public AppException(){}

    public AppException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return mensaje;
    }
}
