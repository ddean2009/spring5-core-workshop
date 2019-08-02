package com.flydean.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 * @version SampleAdvice,  2019-08-02 07:20
 */

@Aspect
@Component
public class SampleAdvice {

    @Before("com.flydean.aspect.SystemArchitecture.businessService()")
    public void doAccessCheck() {
        // ...
    }


    @Before("execution(* com.flydean.service.*.*(..))")
    public void doServiceCheck() {
        // ...
    }

    @AfterReturning("com.flydean.aspect.SystemArchitecture.businessService()")
    public void doBusinessCheck() {
        // ...
    }

    @AfterReturning(
            pointcut="com.flydean.aspect.SystemArchitecture.businessService()",
            returning="retVal")
    public void doAccessCheck(Object retVal) {
        // ...
    }


    @AfterThrowing("com.flydean.aspect.SystemArchitecture.businessService()")
    public void doRecoveryActions() {
        // ...
    }


    @AfterThrowing(
            pointcut="com.flydean.aspect.SystemArchitecture.businessService()",
            throwing="ex")
    public void doRecoveryActions(Exception ex) {
        // ...
    }

    @After("com.flydean.aspect.SystemArchitecture.businessService()")
    public void doReleaseLock() {
        // ...
    }

    @Around("com.flydean.aspect.SystemArchitecture.businessService()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        // start stopwatch
        Object retVal = pjp.proceed();
        // stop stopwatch
        return retVal;
    }
}
