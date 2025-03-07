package com.spring.instafeed.exception.invalid;

import com.spring.instafeed.exception.common.BaseException;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class InvalidEmailException extends RuntimeException implements BaseException {

    private final int code;

    private final HttpStatus status;

    public InvalidEmailException(HttpStatus status, String message) {
        super(message);
        this.code = status.value();
        this.status = status;
    }
}
