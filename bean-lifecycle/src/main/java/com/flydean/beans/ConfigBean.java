package com.flydean.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {


    @Bean(initMethod = "init",destroyMethod = "destroy")
    public ExampleBean getExampleBean(){
        return new ExampleBean();
    }
}
