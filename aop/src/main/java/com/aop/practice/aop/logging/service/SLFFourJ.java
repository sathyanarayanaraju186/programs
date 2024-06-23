package com.aop.practice.aop.logging.service;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SLFFourJ {
    @PostConstruct
    public void log() {
        // Generally we use "log" as the logger object name by default,
        // but we can use any name we want to use by using lombok.config file to set the default logger name
        // lombok.log.fieldName=logger
        logger.trace("TRACE: Very detailed logs, rarely used in production.");
        logger.debug("DEBUG: Detailed logs useful for debugging.");
        logger.info("INFO: General application flow logs, useful in production.");
        logger.warn("WARN: Potential issues that do not stop the application.");
        logger.error("ERROR: Serious issues that might need immediate attention.");
    }
}
