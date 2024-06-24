package com.aop.practice.aop.exception;

import lombok.NoArgsConstructor;

/**
 * Custom exception class This class extends RuntimeException This class is used to throw custom exception This class is
 * used in GlobalExceptionHandler class to handle custom exception. Exception message is passed as argument to the
 * constructor of this class, which is then passed to the super class constructor. And then this exception is thrown in
 * the code.
 */
@NoArgsConstructor
public class CustomException extends RuntimeException {
    public CustomException(final String message) {
        super(message);
    }
}
