package com.flydean.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;

@Slf4j
public class SampleInitializingBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
    log.info("inside afterPropertiesSet");
    }
}
