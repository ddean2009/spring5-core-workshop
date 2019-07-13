package com.flydean.config;

import com.flydean.beans.MyScopeResolver;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.flydean", scopeResolver = MyScopeResolver.class)
public class BeanScopeResolverConfig {
}
