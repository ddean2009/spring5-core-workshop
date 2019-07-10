package com.flydean.beans;

import org.springframework.beans.factory.annotation.Required;

public class RequiredBean {

    private BeanA  beanA;

    @Required
    public void setBeanA(BeanA beanA){
        this.beanA=beanA;

    }
}
