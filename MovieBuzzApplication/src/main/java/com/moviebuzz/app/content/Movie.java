package com.moviebuzz.app.content;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	private Long movie_id;
	private String movie_name;
	private String movie_category;
	private String description;
	private String cast;
	private String link_to_stream;
	
	
	

	public Movie() {
		super();
	}


	public Movie(long movie_id, String movie_name, String movie_category, String description, String cast, String link_to_stream) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.movie_category =movie_category;
		this.description = description;
		this.cast = cast;
		this.link_to_stream = link_to_stream;
	}
	
	
	public Long getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(Long movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getMovie_category() {
		return movie_category;
	}

	public void setMovie_category(String movie_name) {
		this.movie_category = movie_name;
	}
	
		
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getLink_to_stream() {
		return link_to_stream;
	}

	public void setLink_to_stream(String link_to_stream) {
		this.link_to_stream = link_to_stream;
	}

	@Override
	public String toString() {
		return "Movies [movie_id=" + movie_id + ", movie_name=" + movie_name +", movie_category="+ movie_category +", description=" + description
				+ ", cast=" + cast + ", link_to_stream=" + link_to_stream + "]";
	}

	
	
	
	
}
