package com.career.saop.service;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class TimeItAspect {

        @Around("execution(* com.career.saop.service.MathService.*(..))")
        public Object logTimeIt(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
            long startTime = System.currentTimeMillis();
            Object obj = proceedingJoinPoint.proceed();
            long endTime = System.currentTimeMillis();
            log.info("Time taken to execute {} is {} ms",proceedingJoinPoint.getSignature().getName(),(endTime-startTime));
            return obj;
        }

}
