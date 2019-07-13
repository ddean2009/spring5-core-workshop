package com.flydean.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("beanA")
public class BeanA {

    public BeanA(){

    }

    public BeanA(String name){

    }
}
