package com.flydean.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Map;
import java.util.Optional;

public class AutowiredBean {

    private BeanA beanA;

    private BeanB beanB;

    @Autowired
    private BeanC beanC;

    @Autowired
    private BeanC[] beanCList;

    private Map<String,BeanA> mapA;


    @Autowired
    private ApplicationContext context;


    @Autowired
    public AutowiredBean(BeanA beanA){
        this.beanA=beanA;
    }

    @Autowired
    public void setBeanB(BeanB beanB){
        this.beanB=beanB;
    }

    @Autowired
    public void configAB(BeanA beanA , BeanB beanB){
        this.beanA=beanA;
        this.beanB=beanB;

    }

    @Autowired
    public void configMapA(Map<String,BeanA> mapA){
    this.mapA=mapA;
    }

    @Autowired(required = false)
    public void setBeanC(BeanC beanC){
    }

    @Autowired
    public void setMovieFinder(Optional<BeanC> beanC) {
    }

    @Autowired
    public void setMovieFinderC(@Nullable BeanC beanC) {
    }
}
