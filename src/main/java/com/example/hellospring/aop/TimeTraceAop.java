package com.example.hellospring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component // AOP 클래스에 @Component를 붙이거나 Config에 Bean을 직접 등록해서 쓸 수 있따
public class TimeTraceAop {

    @Around("execution(* com.example.hellospring..*(..))"/* 여기는 pointcut 표현식 작성부 */) // 여기가 어드바이스구나
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("START = " + joinPoint.toString());
        try {
            return joinPoint.proceed();
        } finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - start;
            System.out.println("END = " + joinPoint.toString() + " " + timeMs + "ms");
        }
    }
}
