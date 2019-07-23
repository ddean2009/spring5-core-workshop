package com.flydean;

import com.flydean.beans.PersonForm;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wayne
 * @version ValidatorApp,  2019-07-21 10:54
 */
public class ValidatorApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean-validator.xml");
        PersonForm personForm=(PersonForm) applicationContext.getBean("personForm");
        System.out.println(personForm);

    }
}

