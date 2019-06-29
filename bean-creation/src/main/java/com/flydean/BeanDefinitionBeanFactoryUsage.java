package com.flydean;

import com.flydean.daos.DaoC;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDefinitionBeanFactoryUsage {

    public static void main(String[] args) {
        // create and configure beans
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //从ApplicationContext 中获取 DefaultListableBeanFactory
        DefaultListableBeanFactory beanFactory=(DefaultListableBeanFactory)context.getBeanFactory();

        BeanDefinition beanDefinition=beanFactory.getBeanDefinition("daoA");

        System.out.println(beanDefinition.getBeanClassName());

        DaoC daoC=new DaoC();
        //将daoC注册到spring容器中
        beanFactory.registerSingleton("daoC", daoC);

        //也可以注册beanDefinition
//        beanFactory.registerBeanDefinition();

        //从Spring容器中获取到刚刚手动注册的bean
        System.out.println(context.getBean("daoC"));



    }
}
