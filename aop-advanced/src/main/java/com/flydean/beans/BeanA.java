package com.flydean.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 * @version BeanA,  2019-08-04 23:28
 */
@Component
public class BeanA {

    private static Logger log= LoggerFactory.getLogger(BeanA.class);

    public BeanA(){
        log.info("init BeanA");
    }
}
