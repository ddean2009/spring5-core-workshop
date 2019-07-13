package com.flydean.beans;

import org.springframework.lang.Nullable;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import java.util.Optional;

public class SimpleMovieProviderLister {
    private Provider<MovieFinder> movieFinderProvider;

    private MovieFinder movieFinder;

    @Inject
    public void setMovieFinder(Provider<MovieFinder> movieFinder) {
        this.movieFinderProvider = movieFinder;
    }


    @Inject
    public void setMovieFinderNamed(@Named("main") MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    @Inject
    public void setMovieFinder(Optional<MovieFinder> movieFinder) {
    }

    @Inject
    public void setMovieFinder(@Nullable MovieFinder movieFinder) {
    }

    public void listMovies() {
        this.movieFinderProvider.get().findMovies();
    }
}
