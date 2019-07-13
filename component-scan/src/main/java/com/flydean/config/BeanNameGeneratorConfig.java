package com.flydean.config;

import com.flydean.beans.MyNameGenerator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.flydean", nameGenerator = MyNameGenerator.class)
public class BeanNameGeneratorConfig {
}
