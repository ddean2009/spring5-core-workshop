package com.flydean.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author wayne
 * @version SystemArchitecture,  2019-08-02 07:02
 */
@Aspect
public class SystemArchitecture {

    /**
     * A join point is in the service layer if the method is defined
     * in a type in the com.flydean.service package or any sub-package
     * under that.
     */
    @Pointcut("within(com.flydean.service..*)")
    public void inServiceLayer() {}

    /**
     * A business service is the execution of any method defined on a service
     * interface. This definition assumes that interfaces are placed in the
     * "service" package, and that implementation types are in sub-packages.
     *
     * If you group service interfaces by functional area (for example,
     * in packages com.flydean.service and com.flydean.def.service) then
     * the pointcut expression "execution(* com.flydean..service.*.*(..))"
     * could be used instead.
     *
     * Alternatively, you can write the expression using the 'bean'
     * PCD, like so "bean(*Service)". (This assumes that you have
     * named your Spring service beans in a consistent fashion.)
     */
    @Pointcut("execution(* com.flydean..service.*.*(..))")
    public void businessService() {}

}
