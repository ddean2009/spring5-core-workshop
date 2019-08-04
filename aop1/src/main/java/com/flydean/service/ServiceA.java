package com.flydean.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 * @version ServiceA,  2019-08-02 06:46
 */
@Slf4j
@Component("serviceA")
public class ServiceA {

    public void testA(){
        log.info("inside ServiceA: testA");
    }
}
