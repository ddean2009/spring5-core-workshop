package com.flydean.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 * @version BeanB,  2019-08-04 23:28
 */
@Component
public class BeanB {

    private static Logger log= LoggerFactory.getLogger(BeanB.class);

    public BeanB(){
        log.info("init BeanB");
    }
}
