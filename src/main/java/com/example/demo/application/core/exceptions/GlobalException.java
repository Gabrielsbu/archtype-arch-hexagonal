package com.example.demo.application.core.exceptions;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.http.HttpStatus;

public class GlobalException extends Exception {
    private String status;
    private String message;
    private LocalDateTime dateTime;
    private List<String> additionalData;
    private HttpStatus httpStatus;


    public GlobalException(){

    }

    public GlobalException(String status, String message, LocalDateTime dateTime,
        List<String> additionalData, HttpStatus httpStatus) {
        super(message);
        this.status = status;
        this.message = message;
        this.dateTime = dateTime;
        this.additionalData = additionalData;
        this.httpStatus = httpStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public List<String> getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(
        List<String> additionalData) {
        this.additionalData = additionalData;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
