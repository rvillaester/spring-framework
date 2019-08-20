package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LoggingAspect {

    @Before("within(com.aop.target.*)")
    public void logBefore(JoinPoint joinPoint){
        System.out.println(String.format("Before Method: %s", joinPoint.getSignature().getName()));
        System.out.println(String.format("Args are: %s", Arrays.toString(joinPoint.getArgs())));
    }

    @After("within(com.aop.target.*)")
    public void logAfter(JoinPoint joinPoint){
        System.out.println(String.format("After Method: %s", joinPoint.getSignature().getName()));
    }

    @AfterReturning(pointcut = "within(com.aop.target.*)", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result){
        System.out.println(String.format("After Returning Method: %s", joinPoint.getSignature().getName()));
        System.out.println(String.format("Result: %s", result));
    }

}
