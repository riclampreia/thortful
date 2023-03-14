package com.thortful.apichallenge.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@ResponseStatus(value = INTERNAL_SERVER_ERROR)
public class ThortfulException extends RuntimeException {

    public ThortfulException(String message) {
        super(message);
    }
}
