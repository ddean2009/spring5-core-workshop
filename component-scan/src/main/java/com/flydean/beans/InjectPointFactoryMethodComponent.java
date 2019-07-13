package com.flydean.beans;

import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class InjectPointFactoryMethodComponent {

    @Bean
    @Scope("prototype")
    public BeanA prototypeInstance(InjectionPoint injectionPoint) {
        return new BeanA("prototypeInstance for " + injectionPoint.getMember());
    }
}
