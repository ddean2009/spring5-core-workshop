package com.flydean;

import org.springframework.beans.factory.config.Scope;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.SimpleThreadScope;

public class CustomerScope {

    public static void main(String[] args) {

        GenericApplicationContext context = new GenericApplicationContext();

        Scope threadScope = new SimpleThreadScope();
        //代码注入
        context.getBeanFactory().registerScope("thread",threadScope);
    }
}
