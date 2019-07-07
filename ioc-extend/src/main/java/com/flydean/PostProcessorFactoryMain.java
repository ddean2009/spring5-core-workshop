package com.flydean;

import com.flydean.beans.BeanOverride;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostProcessorFactoryMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean-override.xml");
        BeanOverride beanOverride=(BeanOverride) applicationContext.getBean("beanOverride");
        System.out.println(beanOverride.getName());
    }



}
