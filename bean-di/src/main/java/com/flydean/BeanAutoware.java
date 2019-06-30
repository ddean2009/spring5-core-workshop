package com.flydean;

import com.flydean.beans.SimpleMovieLister;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAutoware {

    public static void main(String[] args) {


        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("bean-autoware.xml");

        SimpleMovieLister simpleMovieLister=(SimpleMovieLister) applicationContext.getBean("simpleMovieLister");

        System.out.println(simpleMovieLister.getMovieFinder());


    }
}
