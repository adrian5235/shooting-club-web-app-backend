package com.shootingclub.legendposition;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class LegendPositionNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(LegendPositionNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String legendPositionNotFoundHandler(LegendPositionNotFoundException ex) {
        return ex.getMessage();
    }
}
