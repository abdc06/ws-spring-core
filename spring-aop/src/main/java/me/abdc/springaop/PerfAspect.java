package me.abdc.springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {
    
    @Around("@annotation(PerfLogging)")
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        Object proceed = pjp.proceed();
        System.out.println(System.currentTimeMillis() - begin);
        return proceed;
    }

    @Before("bean(simpleEventService)")
    public void before() {
        System.out.println("before");
    }

    @After("execution(* me.abdc..*.EventService.*(..))")
    public void after() {
        System.out.println("after");
    }

}
