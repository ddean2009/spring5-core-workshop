package com.flydean;

import com.flydean.beans.ExampleBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BeanDIUsage {

    public static void main(String[] args) {

        ApplicationContext applicationContext= new FileSystemXmlApplicationContext("resources/bean-di.xml");

        ExampleBean exampleBean=(ExampleBean)applicationContext.getBean("exampleBeanC");

        System.out.println(exampleBean);

    }


}
