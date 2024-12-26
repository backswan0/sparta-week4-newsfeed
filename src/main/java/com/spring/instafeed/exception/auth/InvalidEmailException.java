package com.spring.instafeed.exception.auth;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class InvalidEmailException extends RuntimeException {

    private final HttpStatus status;

    public InvalidEmailException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }
}
