package com.flydean.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FactoryMethodComponent {

    @Bean
    @Qualifier("public")
    public BeanA publicInstance() {
        return new BeanA();
    }

    public void doWork() {
        // Component method implementation omitted
    }
}
