package com.flydean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.Environment;

public class PropertySourceApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new GenericApplicationContext();
        Environment env = ctx.getEnvironment();
        boolean containsMyProperty = env.containsProperty("my-property");
        System.out.println("Does my environment contain the 'my-property' property? " + containsMyProperty);

    }
}
