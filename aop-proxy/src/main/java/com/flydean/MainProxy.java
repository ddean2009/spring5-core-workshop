package com.flydean;

import com.flydean.beans.Pojo;
import com.flydean.beans.SimplePojo;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author wayne
 * @version MainProxy,  2019-08-04 09:42
 */
public class MainProxy {

    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory(new SimplePojo());
        factory.addInterface(Pojo.class);
//        factory.addAdvice(new RetryAdvice());

        Pojo pojo = (Pojo) factory.getProxy();
        // this is a method call on the proxy!
        pojo.foo();
    }
}
