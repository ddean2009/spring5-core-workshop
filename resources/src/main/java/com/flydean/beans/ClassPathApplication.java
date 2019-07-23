package com.flydean.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wayne
 * @version ClassPathApplication,  2019-07-18 07:10
 */
public class ClassPathApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                new String[] {"beanA.xml"}, BeanA.class);
    }
}
