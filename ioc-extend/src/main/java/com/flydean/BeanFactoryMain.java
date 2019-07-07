package com.flydean;

import com.flydean.beans.BeanA;
import com.flydean.beans.BeanFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryMain {

    public static void main(final String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-factory.xml");
        BeanFactoryBean beanFactoryBean = (BeanFactoryBean) ctx.getBean("&beanFactoryBean");
        System.out.println(beanFactoryBean.getObject());
        System.out.println(beanFactoryBean.getObjectType());

        BeanA beanA=(BeanA)ctx.getBean("beanFactoryBean");
        System.out.println(beanA);
    }

}
