package com.flydean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean-component-scan.xml");
        applicationContext.refresh();
        System.out.println(applicationContext.getBean("beanA"));
    }
}
