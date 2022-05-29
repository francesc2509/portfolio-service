package com.francesc2509.portofolioservice.api.exception;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
public class HttpException<T> {

    private final HttpStatus httpStatus;
    private final T data;
}
