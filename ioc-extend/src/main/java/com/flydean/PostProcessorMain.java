package com.flydean;

import com.flydean.beans.BeanA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostProcessorMain {

    public static void main(final String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-post-processor.xml");
        BeanA beanA = (BeanA) ctx.getBean("beanA");
        System.out.println(beanA);
    }

}
