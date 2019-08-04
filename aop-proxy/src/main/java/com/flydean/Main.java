package com.flydean;

import com.flydean.beans.Pojo;
import com.flydean.beans.SimplePojo;

/**
 * @author wayne
 * @version Main,  2019-08-04 09:38
 */
public class Main {

    public static void main(String[] args) {
        Pojo pojo = new SimplePojo();
        // this is a direct method call on the 'pojo' reference
        pojo.foo();
    }
}