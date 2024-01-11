package com.example.dontstarvetogetherapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidNameException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidNameException(String e) {
        super(e);
    }
}
