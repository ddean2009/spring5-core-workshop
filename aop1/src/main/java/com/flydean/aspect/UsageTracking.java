package com.flydean.aspect;

import com.flydean.beans.DefaultUsageTracked;
import com.flydean.beans.UsageTracked;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 * @version UsageTracking,  2019-08-02 22:39
 */
@Aspect
@Component
public class UsageTracking {

    @DeclareParents(value="com.flydean.service.*+", defaultImpl= DefaultUsageTracked.class)
    public static UsageTracked mixin;

    @Before("com.flydean.aspect.SystemArchitecture.businessService() && this(usageTracked)")
    public void recordUsage(UsageTracked usageTracked) {
        usageTracked.incrementUseCount();
    }

}
