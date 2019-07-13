package com.flydean.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@ComponentScan(basePackages = "com.flydean", scopedProxy = ScopedProxyMode.INTERFACES)
public class ScopedProxyConfig {
}
