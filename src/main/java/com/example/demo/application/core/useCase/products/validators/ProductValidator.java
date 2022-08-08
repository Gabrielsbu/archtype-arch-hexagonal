package com.example.demo.application.core.useCase.products.validators;

import com.example.demo.application.core.domain.Product;
import com.example.demo.application.core.exceptions.GlobalException;
import com.example.demo.application.core.util.validators.ErrorMessage;
import com.example.demo.application.core.util.validators.Validation;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.http.HttpStatus;

public class ProductValidator {

  private ProductValidator() {
    throw new IllegalStateException("Validator class");
  }

  public static void productValidatorError(Product product) throws GlobalException {
      String status = "LOS701";
      String message = "There was an error processing your request, please check the data sent.";
      LocalDateTime localDateTime = LocalDateTime.now();
      List<String> additionalData = new ArrayList<>();


      if (Validation.stringIsEmpty(product.getId())) {
          additionalData.add(ErrorMessage.requiredField("product.id"));
      }
      if (Validation.stringIsEmpty(product.getName())) {
          additionalData.add(ErrorMessage.requiredField("product.name"));
      }

      if(!additionalData.isEmpty())
          throw new GlobalException(status, message, localDateTime, additionalData, HttpStatus.BAD_REQUEST);
  }

  public static void exceptionDefault(String status, String exception, HttpStatus httpStatus) throws GlobalException {
      throw new GlobalException(
              status,
              "There was an error processing your request, please check the data sent.",
              LocalDateTime.now(), Collections.singletonList(exception), httpStatus);
  }
}
