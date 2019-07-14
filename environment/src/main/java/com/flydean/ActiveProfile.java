package com.flydean;

import com.flydean.config.AppConfig;
import com.flydean.config.JndiDataConfig;
import com.flydean.config.StandaloneDataConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ActiveProfile {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("development");
        ctx.register(AppConfig.class, StandaloneDataConfig.class, JndiDataConfig.class);
        ctx.refresh();
    }
}
