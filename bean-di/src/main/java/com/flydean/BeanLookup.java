package com.flydean;

import com.flydean.beans.CommandManagerB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLookup {

    public static void main(String[] args) {


        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("bean-lookup.xml");

        CommandManagerB commandManagerB=(CommandManagerB) applicationContext.getBean("commandManager");

        System.out.println(commandManagerB.createCommand());


    }
}
