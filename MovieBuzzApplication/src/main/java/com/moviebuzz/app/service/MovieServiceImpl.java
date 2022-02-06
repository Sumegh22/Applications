package com.moviebuzz.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviebuzz.app.Dao.MovieBuzzAppDao;
import com.moviebuzz.app.content.Movie;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired 
	private MovieBuzzAppDao movieDao;
	

	public MovieServiceImpl() {
	
	}
	
	
	
	@Override
	public List<Movie> getMovies() {
		
//		return list;		
		return movieDao.findAll();
	
	}

	@Override
	public Movie getMoviebyId(Long movie_id) {

		return movieDao.getById(movie_id);
	}

	
	
	
	@Override
	public Movie addMovie(Movie movie) {
		
		movieDao.save(movie);
		return movie;
		
	}
	
	

	public Movie updateMovie(Movie movie) {
		
		movieDao.save(movie);
		return movie;
		
		
	}
	
	

	@Override
	public void deleteMovie(long id) {

		movieDao.delete(movieDao.getById(id));
		
	}

	

}
