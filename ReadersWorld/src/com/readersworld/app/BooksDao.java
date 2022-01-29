package com.readersworld.app;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BooksDao {
	
	public static void showAllBooksfromCollection() {
		
		try {
			Connection con = ConnectionProvider.createConnection();
			
			//Show all query
			String q="Select * from collection;";			
			 Statement stmt= con.createStatement();		
			ResultSet set = stmt.executeQuery(q);
				while(set.next()) {
					int id = set.getInt(1);
					String book_name = set.getString(2);
					String author_name = set.getString(3);
					String givenToName = set.getString(4);
					String user_number = set.getString(5);
					String owner_name = set.getString(6);
					String owner_number = set.getString(7);

					System.out.println("book_id: "+id+",");
					System.out.println("book_name: "+book_name+",");
					System.out.println("author_name: "+author_name+",");
					System.out.println("book_is_with: "+givenToName+",");
					System.out.println("user_phone "+user_number+",");
					System.out.println("book_owner: "+owner_name+",");
					System.out.println("owner_phone: "+owner_number);
					System.out.println(" ");									
									}
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			 
			
			
		}
			catch (Exception e) {
				e.printStackTrace();
		} 
		
	}
	
	
	public static boolean addBooktoDB(Books novel) {
		
		boolean f = false;
		try {
		Connection con = ConnectionProvider.createConnection();

		
		//insert query
		String q="insert into collection(book_name,author_name,book_is_with,"
				+ "user_phone,book_owner,owner_phone) values (?,?,?,?,?,?)";
		
		PreparedStatement pstmt= con.prepareStatement(q);
		
		pstmt.setString(1,novel.getBook_name());
		pstmt.setString(2,novel.getAuthor_name());
		pstmt.setString(3,novel.getBook_has_been_given_to());
		pstmt.setString(4,novel.getHis_number());
		pstmt.setString(5,novel.getActual_owner_of_book());
		pstmt.setString(6,novel.getOwner_phone_number());
		//execute query			
		pstmt.executeUpdate();
		f=true;
	}
		catch (Exception e) {
			e.printStackTrace();
	} 
		
	return f;	
	}

	public static boolean deleteBookfromDB(int bookId) {
		boolean f = false;
		
		try {
		Connection con = ConnectionProvider.createConnection();

		
		//delete query
		String q="delete from collection where book_id =?";
		
		PreparedStatement pstmt= con.prepareStatement(q);		
		pstmt.setInt(1,bookId);
	
		//execute query			
		pstmt.executeUpdate();
		f=true;
	}
		catch (Exception e) {
			e.printStackTrace();
	} 
		
	return f;	
	}


	public static boolean updateBookfromDB(int bookId) {
		boolean f = false;
		try {
			
			
		Connection con = ConnectionProvider.createConnection();

		
		//update query
		String q="update collection set book_name=?, set author_name=?,set book_is_with=?,"
				+ "set user_phone=?,set book_owner=?,set owner_phone=? where book_id =?";

		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("update the book name");
		String bookname= buffer.readLine();
		
		System.out.println("update new Author Name");
		String bookAuthorname= buffer.readLine();
		
		System.out.println("update name of the person to whom you have lent book\n+"
				+ "(Please leave blank or '-' if not given to anyone)");
		String givenToName=buffer.readLine();
		
		System.out.println("update contact number of the peson to whom you have lent book\n+"
				+ "(Please leave blank or '-' if not given to anyone, or leave a message to hint about contact details)");
		String givenToNum=buffer.readLine();

		System.out.println("update the book owner's name");
		String ownerName=buffer.readLine();
		
		System.out.println("update the book owner's phone number");
		String ownerNumber=buffer.readLine();
		
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setInt(7, bookId);
		pstmt.setString(1, bookname);
		pstmt.setString(2, bookAuthorname);
		pstmt.setString(3, givenToName);
		pstmt.setString(4, givenToNum);
		pstmt.setString(5, ownerName);
		pstmt.setString(6, ownerNumber);
		pstmt.executeUpdate();
		
		f=true;
	}
		catch (Exception e) {
			e.printStackTrace();
	} 
		
	return f;
	}



	
	
}
