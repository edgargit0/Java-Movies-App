package service;

import java.util.ArrayList;
import java.util.List;

import domain.Movie;

public class MovieServiceImpl implements IMovieService{

    private final List<Movie> movieList;

    public MovieServiceImpl(){
        this.movieList=new ArrayList<>();
    }


    @Override
    public void listMovies() {
        System.out.println("Movies List: ");
        movieList.forEach(System.out::println);
    }

    @Override
    public void addMovie(Movie movie) {
        movieList.add(movie);
        System.out.println("Movie has been added: " + movie);

    }

    @Override
    public void findMovie(Movie movie) {
        var index = movieList.indexOf(movie);
        if (index==-1) {
            System.out.println("Movie was not found: " + movie);
        } else {
            System.out.println("Movie has been found in index: " + index);
        }

    }

}
