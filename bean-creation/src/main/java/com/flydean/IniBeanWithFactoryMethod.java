package com.flydean;


import com.flydean.services.ClientService;
import com.flydean.services.ServiceA;
import com.flydean.services.ServiceB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IniBeanWithFactoryMethod {

    public static void main(String[] args) {

        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beanFactory.xml");

        ClientService clientService=(ClientService) applicationContext.getBean("clientService");

        ServiceA serviceA=(ServiceA) applicationContext.getBean("serviceA");

        ServiceB serviceB=(ServiceB) applicationContext.getBean("serviceB");

        System.out.println(clientService);

        System.out.println(serviceA);

        System.out.println(serviceB);
    }
}
