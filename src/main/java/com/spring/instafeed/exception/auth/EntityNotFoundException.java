package com.spring.instafeed.exception.auth;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class EntityNotFoundException extends RuntimeException {

  private final HttpStatus status;

    public EntityNotFoundException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }
}
