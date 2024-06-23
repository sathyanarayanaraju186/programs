package com.aop.practice.aop.aspect;
// https://chatgpt.com/share/7f7ed024-766b-43ab-b91f-1b967909cb9d

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Instrument {
}
