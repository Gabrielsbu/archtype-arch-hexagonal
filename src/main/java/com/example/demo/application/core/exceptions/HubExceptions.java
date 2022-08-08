package com.example.demo.application.core.exceptions;

import java.time.LocalDateTime;
import java.util.ArrayList;
import org.springframework.http.HttpStatus;

public class HubExceptions {

  private HubExceptions(){
    throw new IllegalStateException("Exception class");
  }

  public static void genericError() throws GlobalException {
    throw new GlobalException(
        "HUB900",
        "An unmapped gateway error occurred.",
        LocalDateTime.now(),
        new ArrayList<>(),
        HttpStatus.BAD_REQUEST);

  }
}
