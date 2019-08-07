package com.flydean.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * @author wayne
 * @version Account,  2019-08-04 21:10
 */
@Configurable(autowire= Autowire.BY_NAME, preConstruction = true)
public class Account {

    private static Logger log= LoggerFactory.getLogger(Account.class);

    private String name;

    @Autowired
    private BeanA beanA;

    public  Account(){
        log.info("init Account");
    }

    public Object getBeanA() {
        return beanA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
