package com.career.saop.service;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Aspect
@Slf4j
public class ConvertAspect {

    @Around("@annotation(com.career.saop.service.ConvertToUpper)")
    public Object convertToUpper(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.info("Before calling method : {}",proceedingJoinPoint.getSignature().getName());
        Object obj = proceedingJoinPoint.proceed();
        if(obj instanceof List ){
            List<String> list = new ArrayList<>((List<String>)obj);
            list.replaceAll(String::toUpperCase);
            log.info("After calling method : {}", proceedingJoinPoint.getSignature().getName());
            return list;

        }

        return obj;
    }
}
