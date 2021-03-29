package com.project.kuhniia.config.security;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class JwtAuthenticationException extends RuntimeException {

    private String message;
    private HttpStatus httpStatus;

    public JwtAuthenticationException(String message) {
        this.message = message;
    }

    public JwtAuthenticationException(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
