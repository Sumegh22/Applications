package com.moviebuzz.app.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.moviebuzz.app.content.Movie;

public interface MovieBuzzAppDao extends JpaRepository<Movie, Long> {

	
	
}
