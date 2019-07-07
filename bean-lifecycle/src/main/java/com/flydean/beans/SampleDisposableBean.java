package com.flydean.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;

@Slf4j
public class SampleDisposableBean implements DisposableBean {


    @Override
    public void destroy() throws Exception {
        log.info("destroy");
    }
}
