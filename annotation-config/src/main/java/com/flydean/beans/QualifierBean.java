package com.flydean.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class QualifierBean {

    @Autowired
    @Qualifier("main")
    private BeanA beanA;

    @Autowired
    public void setBeanA(@Qualifier("main") BeanA beanA){

    }
}
