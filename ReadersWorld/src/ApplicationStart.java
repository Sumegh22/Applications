import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.readersworld.app.Books;
import com.readersworld.app.BooksDao;

public class ApplicationStart {

	public static void main(String[] args) throws IllegalArgumentException, IOException {

		System.out.println("Welcome to the Readers World Application !..\n ");
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader (System.in));
		
		while(true) {
			System.out.println("Press 1 to display all books in Collection !..");
			System.out.println("Press 2 to Add a book into the Collection!.. ");
			System.out.println("Press 3 to Delete a book from Collection!.. ");
			System.out.println("Press 4 to update a record in Collection !..");
			System.out.println("Press 5 to exit from application !.. ");
			
			int userInput = Integer.parseInt(buffer.readLine());
			
			if (userInput ==1)
			{
				
				BooksDao.showAllBooksfromCollection();
				
				
			} else if (userInput ==2) {
				
				System.out.println("Enter the book name");
				String bookname= buffer.readLine();
				
				System.out.println("Enter Author Name");
				String bookAuthorname= buffer.readLine();
				
				System.out.println("Enter name of the person to whom you have lent book\n+"
						+ "(Please leave blank or '-' if not given to anyone)");
				String givenToName=buffer.readLine();
				
				System.out.println("Enter contact number of the peson to whom you have lent book\n+"
						+ "(Please leave blank or '-' if not given to anyone, or leave a message to hint about contact details)");
				String givenToNum=buffer.readLine();

				System.out.println("Enter the book owner's name");
				String ownerName=buffer.readLine();
				
				System.out.println("Enter the book owner's phone number");
				String ownerNumber=buffer.readLine();
				
				
				Books novel = new Books(bookname,bookAuthorname,givenToName,givenToNum,ownerName,ownerNumber);
				
				boolean addResponse = BooksDao.addBooktoDB(novel);
							if (addResponse) {	System.out.println("Book added to DB");
								System.out.println(novel);}
				
							else {System.out.println("Something went wrong, try again !..");}
				
				System.out.println("-----------------------------------------------------------------------\n");
				
				
			} else if (userInput ==3) {
				System.out.println("Enter the book_id to delete the book from collection");
				int bookId= Integer.parseInt(buffer.readLine());
				boolean deleteResponse = BooksDao.deleteBookfromDB(bookId);				
							if(deleteResponse) {
								System.out.println("Book record successfully !..");	
							
							} else {System.out.println("Something went wrong, please check the Book Id");}		
				
				
				
			} else if (userInput==4) {
				System.out.println("Enter the book_id to update the book data in collection");
				int bookId= Integer.parseInt(buffer.readLine());				
				boolean updateResponse = BooksDao.updateBookfromDB(bookId);				
				if(updateResponse) {
					System.out.println("Book record updated successfully !..\n");	
					
				
				} else {System.out.println("Something went wrong, please check the Book Id");}
				
				
			}else if (userInput ==5) {
				
				break;
			}
			
			else 
				System.out.println("Something went wrong !.. please try again..");
			
		}
		
			
			System.out.println("Thank you for using Readers World");
			
		}
		
	}


