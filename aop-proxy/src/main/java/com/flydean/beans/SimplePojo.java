package com.flydean.beans;

/**
 * @author wayne
 * @version SimplePojo,  2019-08-04 09:36
 */
public class SimplePojo implements Pojo {

    public void foo() {
        // this next method invocation is a direct call on the 'this' reference
        this.bar();
    }

    public void bar() {
        // some logic...
    }
}