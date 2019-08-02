package com.flydean;

import com.flydean.beans.UsageTracked;
import com.flydean.service.ServiceA;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wayne
 * @version AspectJAnnotationApp,  2019-08-01 23:23
 */
public class AspectJAnnotationApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("aspectJ-annotation.xml");

        ServiceA serviceA=(ServiceA)classPathXmlApplicationContext.getBean("serviceA");
        UsageTracked usageTracked=(UsageTracked)serviceA;
        usageTracked.incrementUseCount();

    }
}
