package com.aop.practice.aop.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * GlobalExceptionHandler class This class is used to handle custom exception. This class is annotated with
 *
 * @ControllerAdvice annotation. This class has a method annotated with @ExceptionHandler annotation which takes
 *         CustomException as argument. This method returns ResponseEntity<Error> object. This method returns internal
 *         server error status and Error object with a message and errorCode.
 */
@NoArgsConstructor
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * handleException method This method takes CustomException as argument. This method returns ResponseEntity<Error>
     *
     * @param customException
     *         CustomException object
     *
     * @return ResponseEntity<Error> object
     */
    @ExceptionHandler(value = {CustomException.class})
    public ResponseEntity<Error> handleException(CustomException customException) {
        return ResponseEntity.internalServerError()
                             .body(
                                     Error.builder()
                                          .message(customException.getMessage())
                                          .errorCode(500)
                                          .build());
    }

    /**
     * Error class This class is used to create an error object. This class has two fields message and errorCode. This
     * class is used to create an error object in the handleException method of GlobalExceptionHandler class.
     */
    @Data
    @NoArgsConstructor
    @SuperBuilder
    public static class Error {
        private String message;
        private Integer errorCode;
    }
}
