package com.flydean.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author wayne
 * @version SimpleMovieLister,  2019-07-21 17:34
 */
public class SimpleMovieLister {

    private Demo movieFinder;
    private String defaultLocale;

    @Autowired
    public void configure(Demo movieFinder,
                          @Value("#{ systemProperties['user.region'] }") String defaultLocale) {
        this.movieFinder = movieFinder;
        this.defaultLocale = defaultLocale;
    }

    // ...
}