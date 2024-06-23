package com.aop.practice.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class InstrumentAspect {
    @Around("@annotation(com.aop.practice.aop.aspect.Instrument)")
    public Object instrumentMethod(final ProceedingJoinPoint joinPoint) throws Throwable {
        InstrumentAspect.logger.info("Before method execution");
        System.out.println("before method executionthod execution");
        final Object result = joinPoint.proceed();
        InstrumentAspect.logger.info("After method execution");
        return result;
    }
}
