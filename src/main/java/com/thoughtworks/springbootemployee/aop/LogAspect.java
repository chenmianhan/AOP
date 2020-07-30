package com.thoughtworks.springbootemployee.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogAspect {
    private Logger logger= LoggerFactory.getLogger(getClass());

    @Pointcut("execution(public * com.thoughtworks.springbootemployee.controller.*.*(..))")
    private void log(){}
    @Before("log()")
    public void logBefore(JoinPoint joinPoint){
        logger.info("Before the method done:method="+joinPoint.getSignature());

    }
    @After("log()")
    public void logAfter(JoinPoint joinPoint){
        logger.info("After  the method done");

    }
    @AfterThrowing("log()")
    public void logThrowException(JoinPoint joinPoint){
        logger.info("After Throwing exception throw");
    }
    @AfterReturning("log()")
    public  void logAfterReturning(){
        logger.info("After Returning");
    }
    @Around("log()")
    public Object logAroundTheMethod(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info("Around Method");
        return joinPoint.proceed();
    }


}
