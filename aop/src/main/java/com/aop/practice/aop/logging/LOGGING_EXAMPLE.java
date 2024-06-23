package com.aop.practice.aop.logging;

import jakarta.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

//https://chatgpt.com/share/dd24033e-472a-4b8c-8379-73521fc5e791
@Service
public class LOGGING_EXAMPLE {
    private static final Logger logger = LoggerFactory.getLogger(LOGGING_EXAMPLE.class);

//    @PostConstruct
    public void init() {
        // log levels in order of increasing severity: TRACE < DEBUG < INFO < WARN < ERROR
        // By default, the log level is set to INFO in the application.properties file.
        // We can change the log level to DEBUG or TRACE for more detailed logs.
        // We can also set the log level for specific packages or classes.
        // For example, we can set the log level for the com.aop.practice.aop package to DEBUG.
        // logging.level.com.aop.practice.aop=DEBUG
        logger.trace("TRACE: Very detailed logs, rarely used in production.");
        logger.debug("DEBUG: Detailed logs useful for debugging.");
        logger.info("INFO: General application flow logs, useful in production.");
        logger.warn("WARN: Potential issues that do not stop the application.");
        logger.error("ERROR: Serious issues that might need immediate attention.");
    }
}
