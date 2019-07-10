package com.flydean.beans;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigBean {

    @Bean
    @Primary
    public BeanA firstBeanA() { return new BeanA(); }

    @Bean
    public BeanA secondBeanA() {  return new BeanA();}

    @Bean
    @Qualifier("main")
    public BeanC beanC() {  return new BeanC();}

    @Bean
    public StringStore stringStore() {
        return new StringStore();
    }

    @Bean
    public IntegerStore integerStore() {
        return new IntegerStore();
    }

}
