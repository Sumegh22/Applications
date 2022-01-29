package com.readersworld.app;

public class Books {

	private int book_id;
	private String book_name;
	private String author_name;
	private String book_has_been_given_to;
	private String his_number;
	private String actual_owner_of_book;
	private String owner_phone_number;
	
	public Books () { 		
						}
	
	public Books(int book_id,String book_name, String author_name, String book_has_been_given_to, 
			String his_number, String actual_owner_of_book) {
		 super();
		this.book_id =book_id;
		this.book_name =book_name;
		this.author_name = author_name;
		this.book_has_been_given_to=book_has_been_given_to;
		this.his_number=his_number;
		this.actual_owner_of_book=actual_owner_of_book;
		
		
	} 
	
	public Books(String book_name, String author_name, String book_has_been_given_to, String his_number,
			String actual_owner_of_book, String owner_phone_number) {
		super();
		this.book_name = book_name;
		this.author_name = author_name;
		this.book_has_been_given_to = book_has_been_given_to;
		this.his_number = his_number;
		this.actual_owner_of_book = actual_owner_of_book;
		this.owner_phone_number = owner_phone_number;
	}

	
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public String getBook_has_been_given_to() {
		return book_has_been_given_to;
	}
	public void setBook_has_been_given_to(String book_has_been_given_to) {
		this.book_has_been_given_to = book_has_been_given_to;
	}
	public String getHis_number() {
		return his_number;
	}
	public void setHis_number(String his_number) {
		this.his_number = his_number;
	}
	public String getActual_owner_of_book() {
		return actual_owner_of_book;
	}
	public void setActual_owner_of_book(String actual_owner_of_book) {
		this.actual_owner_of_book = actual_owner_of_book;
	}
	public String getOwner_phone_number() {
		return owner_phone_number;
	}
	public void setOwner_phone_number(String owner_phone_number) {
		this.owner_phone_number = owner_phone_number;
	}

	@Override
	public String toString() {
		return "Books [book_id=" + book_id + ", book_name=" + book_name + ", author_name=" + author_name
				+ ", book_has_been_given_to=" + book_has_been_given_to + ", his_number=" + his_number
				+ ", actual_owner_of_book=" + actual_owner_of_book + ", owner_phone_number=" + owner_phone_number + "]";
	}
	
	
	
	
}
