package service;

import domain.Movie;

public interface IMovieService {

    public void listMovies();
    public void addMovie(Movie movie);
    public void findMovie(Movie movie);

}
