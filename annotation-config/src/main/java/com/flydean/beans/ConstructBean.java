package com.flydean.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ConstructBean   {

    @PostConstruct
    public void populateMovieCache() {
        // populates the movie cache upon initialization...
    }

    @PreDestroy
    public void clearMovieCache() {
        // clears the movie cache upon destruction...
    }
}
