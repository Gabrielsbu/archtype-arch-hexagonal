package com.example.demo.adapters.inbound.exception;

import com.example.demo.application.core.exceptions.GlobalException;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RequiredArgsConstructor
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(GlobalException.class)
    public ResponseEntity<Object> handleException(GlobalException ex, WebRequest request) {

        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus(ex.getStatus());
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setDateTime(LocalDateTime.now());
        errorResponse.setAdditionalData(ex.getAdditionalData());

        return handleExceptionInternal(ex, errorResponse, new HttpHeaders(), ex.getHttpStatus(), request);
    }
}
