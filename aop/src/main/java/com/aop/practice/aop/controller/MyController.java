package com.aop.practice.aop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aop.practice.aop.exception.CustomException;

@RestController
public class MyController {
    @GetMapping("/test")
    public ResponseEntity<?> test() {
        throw new CustomException("Custom exception thrown----------------------");
    }
}
