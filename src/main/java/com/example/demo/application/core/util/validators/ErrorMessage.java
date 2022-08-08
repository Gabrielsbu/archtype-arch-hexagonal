package com.example.demo.application.core.util.validators;

public class ErrorMessage {

    private ErrorMessage() {
        throw new IllegalStateException("Utility class");
    }

    public static String requiredField(String field) {
        return field + ": This field cannot be empty.";
    }

}
