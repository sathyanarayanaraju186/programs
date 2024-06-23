package com.aop.practice.aop.aspect;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AopTest {

    @Instrument
    public void test1() {
        logger.info("Inside test method");
    }

    @Instrument
    public void test2() {
        logger.info("Inside test2 method");
    }
}
