package com.flydean.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 * @version NotVeryUsefulAspect,  2019-08-01 23:12
 */

@Aspect
@Component
public class NotVeryUsefulAspect {

    @Pointcut("execution(* transfer(..))")// the pointcut expression
    private void anyOldTransfer() {}// the pointcut signature

    @Pointcut("bean(serviceA)")
    private void beanServiceA() {}

    @Pointcut("execution(public * *(..))")
    private void anyPublicOperation() {}

    @Pointcut("within(com.flydean.service.*)")
    private void inTrading() {}

    @Pointcut("anyPublicOperation() && inTrading()")
    private void tradingOperation() {}



}
