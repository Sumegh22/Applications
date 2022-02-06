package com.moviebuzz.app.service;

import java.util.List;

import com.moviebuzz.app.content.Movie;

public interface MovieService {
	
	public List<Movie> getMovies();

	public Movie getMoviebyId(Long movie_id);

	public Movie addMovie(Movie movie);

	public Movie updateMovie(Movie movie);

	public void deleteMovie(long movie_id);
}

