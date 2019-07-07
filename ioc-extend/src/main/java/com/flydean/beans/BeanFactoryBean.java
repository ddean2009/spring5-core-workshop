package com.flydean.beans;

import org.springframework.beans.factory.FactoryBean;

import javax.annotation.Resource;

public class BeanFactoryBean implements FactoryBean {

    @Resource
    private BeanA beanA;

    @Override
    public Object getObject() throws Exception {
        return beanA;
    }

    @Override
    public Class<?> getObjectType() {
        return BeanA.class;
    }
}
