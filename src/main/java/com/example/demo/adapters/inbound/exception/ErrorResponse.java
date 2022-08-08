package com.example.demo.adapters.inbound.exception;

import java.time.LocalDateTime;
import java.util.List;

public class ErrorResponse {
    private String status;
    private String message;
    private LocalDateTime dateTime;
    private List<String> additionalData;

    public ErrorResponse(){

    }

    public ErrorResponse(String status, LocalDateTime dateTime, String message,
        List<String> additionalData) {
        this.status = status;
        this.dateTime = dateTime;
        this.message = message;
        this.additionalData = additionalData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(
        List<String> additionalData) {
        this.additionalData = additionalData;
    }


}
