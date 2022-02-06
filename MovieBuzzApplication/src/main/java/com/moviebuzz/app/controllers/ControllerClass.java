package com.moviebuzz.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.moviebuzz.app.content.Movie;
import com.moviebuzz.app.service.MovieService;

@RestController
public class ControllerClass {
	
	//Home screen message
	@GetMapping("/home")
	public String home() {		
		return "Welcome to Movie Buzz application";
	}
	
	
	
	@Autowired
	private MovieService movie_service;
	
	
	
	@GetMapping("/movies")
	public List<Movie> getMovies(){		
		
		return this.movie_service.getMovies();
	}
	
	
	
	@GetMapping("/movies/{movie_id}")
	public Movie getMoviebyId(@PathVariable String movie_id){
		return this.movie_service.getMoviebyId(Long.parseLong(movie_id));
	}
	
	
	
	@PostMapping("/movies")
	public Movie addMovie(@RequestBody Movie movie){
		return this.movie_service.addMovie(movie);				
	}
	
	
	
	@PutMapping("/movies")
	public Movie updateMovie(@RequestBody Movie movie){
	return this.movie_service.updateMovie(movie);
	}

	
	
	@DeleteMapping("/movies/{movie_id}")
	public ResponseEntity<HttpStatus> deleteMovie(@PathVariable String movie_id){
		try {
			this.movie_service.deleteMovie(Long.parseLong(movie_id));
			return new ResponseEntity<> (HttpStatus.OK); }
		catch(Exception e)
		{ 	e.printStackTrace();
			return new ResponseEntity<> (HttpStatus.INTERNAL_SERVER_ERROR); }
		
		
	}
	
}
