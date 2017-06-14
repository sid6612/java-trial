import java.io.*;
import java.util.Scanner;
import java.util.*;

public class LibraryManagement 
{

	static ArrayList<Book> books =  new ArrayList<Book>();
	static ArrayList<Book> authors =  new ArrayList<Book>();
	static ArrayList<Member> members =  new ArrayList<Member>();

	public static Book findBookById(int idToFind) 
	{
		for (int i = 0; i < books.size(); i++) 
		{
			Book book = books.get(i);
			if(book.id == idToFind)
			{
				return book;
			}
		}
		return null;
	}

	public static Book findAuthorById(int idToFind) 
	{
		for (int k = 0; k < authors.size(); k++) 
		{
			Book author = authors.get(k);
			if(author.id == idToFind)
			{
				return author;
			}
		}
		return null;
	}

	public static Member findMemberById(int idToFind) 
	{
		for (int j = 0; j < members.size(); j++)
		{
			Member member = members.get(j);
			if(member.id == idToFind)
			{
				return member;
			}
		}
		return null;
	}

	public static ArrayList<Integer> getBooksIdByMembersId(int memberId )
	{
		ArrayList<Integer> bookIds = new ArrayList<Integer>();

		for (int l = 0; l < books.size(); l++)
		{	
			Book book = books.get(l);
			if (book.member_id != null && book.member_id == memberId)
			{
				bookIds.add(book.id);
			}	
		}

		return bookIds;
	}

	public static boolean isBookavAilable (int bookId)
	{
		for (int m = 0; m < books.size(); m++)
		{
			Book currentBook = books.get(m);
			
			if (bookId == currentBook.id)
			{
				if (currentBook.member_id == null)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}
		return false;
	}

	public static void createBooks()
	{
		books.add(new Book(1," 2 States"));
		books.add(new Book(2," The Half Girlfriend"));
		books.add(new Book(3," Stardust"));
		books.add(new Book(4," Beowulf"));
		books.add(new Book(5," Ulysses"));
		books.add(new Book(6," The Bell Jar"));
		books.add(new Book(7," Persuasion"));
		books.add(new Book(8," The Aeneid"));
		books.add(new Book(9," Candide"));
		books.add(new Book(10," The Republic"));
	}

	public static void createAuthors() 
	{
		authors.add(new Book(1,"1. Chaten Bhagat"));
		authors.add(new Book(2,"2. Chaten Bhagat"));
		authors.add(new Book(3,"3. Siddharth"));
		authors.add(new Book(4,"4. Harshal"));
		authors.add(new Book(5,"5. Harsh"));
		authors.add(new Book(6,"6. Nimesh"));
		authors.add(new Book(7,"7. Lalit"));
		authors.add(new Book(8,"8. Arpan"));
		authors.add(new Book(9,"9. Bhavin"));
		authors.add(new Book(10,"10. Bhavesh"));
	}

	public static void createMembers() 
	{
		members.add(new Member(1, "Siddharth"));
		members.add(new Member(2, "Harshal"));
		members.add(new Member(3, "Harsh"));
		members.add(new Member(4, "Nimesh"));
		members.add(new Member(5, "Arpan"));
	}

	public static void viewAllBooks()
	{
		System.out.println("\n");
		System.out.println("Showing all books: ");
		System.out.println("| ID     | Book Name                    | Taken    | Taken By      |");
		for (int i = 0; i < books.size(); i++) 
		{
			int totalSpaceForId = 8;
			String displayId = " " + books.get(i).id; // " 10"
			int spacesToAddId = totalSpaceForId - displayId.length();

			for(int n = 0; n < spacesToAddId; n++)
			{
				displayId = displayId + " ";
			}

			int totalSpaceforBookName = 30;
			String displayBookName = " " + books.get(i).name;
			int spacesToAddBookName = totalSpaceforBookName - displayBookName.length();

			for(int n = 0; n < spacesToAddBookName; n++)
			{
				displayBookName = displayBookName + " ";
			}

			int totalSpaceForTaken = 10;
			String displayTaken = " " + books.get(i).taken; 
			int spacesToAddTaken = totalSpaceForTaken - displayTaken.length();

			for(int n = 0; n < spacesToAddTaken; n++)
			{
				displayTaken = displayTaken + " ";
			}

			int totalSpaceForTakenBy = 15;
			String displayTakenBy = " " + books.get(i).name; 
			int spacesToAddTakenBy = totalSpaceForTakenBy - displayTakenBy.length();

			for(int n = 0; n < spacesToAddTakenBy; n++)
			{
				displayTakenBy = displayTakenBy + " ";
			}

			String takenOrNot;
			String takenBy;

			if(books.get(i).taken() == true) 
			{
				takenOrNot = "Yes";
				
				Integer memberId = books.get(i).member_id;
				Member member = findMemberById(memberId);
				takenBy = member.name;
			}
			else
			{
				takenOrNot = "No";
				takenBy = "-";  
			} 

			System.out.println("|" + displayId + "|" + displayBookName + "|" + takenOrNot + "|" + takenBy + "|");
		}
	}

		public static void viewAllAuthors()
	{
		for (int k = 0; k < books.size(); k++) 
		{
	        System.out.println(authors.get(k).name + " ");
	    }
	}

	public static void checkBookAvailability()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n");
		System.out.print("Enter book id to check availability: ");
		Integer bookId = sc.nextInt();

		if (isBookavAilable(bookId))
		{
			System.out.println("Book is available.");
		} 
		else
		{
			System.out.println("Book is not available.");	
		}

		//System.out.print("Enter book id to return: ");
		//Integer memberId = sc.nextInt();
	}

	public static void viewAllMembers() 
	{
		System.out.println("\n");
		System.out.println("Showing all members: ");
		System.out.println("| ID  | Name                    | Pending Book  |");

		for (int j = 0; j < members.size(); j++) 
		{
			Member member = members.get(j);

			int totalSpaceForMId = 5;
			String displayMId = " " + members.get(j).id;
			int spacesToAddMId = totalSpaceForMId - displayMId.length();

			// Loop n times to add spaces to displayMid
			for(int n = 0; n < spacesToAddMId; n++)
			{
				displayMId = displayMId + " ";
			}


			int totalSpaceForMName = 25;
			String displayMName = " " + members.get(j).name;
			int spacesToAddForMName = totalSpaceForMName - displayMName.length();

			for(int n = 0; n < spacesToAddForMName; n++)
			{
				displayMName = displayMName + " ";
			}

			String displayPendingBooks = "";
			ArrayList<Integer> bookIds = getBooksIdByMembersId(member.id);
			Iterator itr = bookIds.iterator();  
			while(itr.hasNext())
			{  
			 	Integer bookId = (Integer)itr.next();
				displayPendingBooks = displayPendingBooks + bookId + ",";
			} 

			int totalSpaceForPendingBooks = 15;
			int spacesToAddForPendingBooks = totalSpaceForPendingBooks - displayPendingBooks.length();

			for(int n = 0; n < spacesToAddForPendingBooks; n++)
			{
				displayPendingBooks = displayPendingBooks + " ";
			}

			// Loop n times to add spaces displayMName

			System.out.println("|" + displayMId + "|" + displayMName + "|" + displayPendingBooks + "|");
		}
	}

	public static void issueBookToMember() 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n");
		System.out.print("Enter member ID: ");
		int memberId = sc.nextInt();

		Member selectedMember = findMemberById(memberId);

		if (selectedMember != null)
		{
			System.out.println("Selected member is: " + selectedMember.name);			
		}
		else
		{
		 	System.out.println("Invalid member id.");
		 	return;
		}

		System.out.println("\n");
		System.out.print("Enter book ID to assign: ");
		int bookId = sc.nextInt();

		Book selectedBook = findBookById(bookId);

		if(selectedBook == null)
		{
			System.out.println("Invalid book id.");
		} else
		{
			if(selectedBook.isAvailable())
			{
				// Book is available.
				selectedBook.assign(selectedMember);
			} else
			{
				System.out.println("Book is not available.");
			}
		}
	}

	public static void  returnBook()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n");
		System.out.print("Enter book ID to return: ");
		int bookId = sc.nextInt();

		Book selectedBook = findBookById(bookId);

		if (selectedBook == null)
		{
			System.out.println("Invalid book id.");
		} 
		else 
		{
			if (selectedBook.member_id == null)
			{
				System.out.println("This book is not issued to anyone.");
			}
			else
			{
				selectedBook.member_id = null;
				System.out.println("Thank you for returning the book - " + selectedBook.name);
			}			
		}
	}

	public static void addBook()
	{
		String bookName;
		String authorName;
		int bookId = getIdForNewBook();

		Scanner sc = new Scanner(System.in);
		System.out.print("\n");
		System.out.print("Enter name of the new book: ");
		bookName = sc.nextLine();
		System.out.println("\n");
		System.out.print("Enter author name: ");
		authorName = sc.nextLine();

		books.add(new Book(bookId, bookName));

		System.out.println("\n");
		System.out.print("A new book entry created. Book Id  assigned is" + bookId + ".");
	}

	public static int getIdForNewBook()
	{
		int maxNumber = 0;

		for (int n = 0; n < books.size(); n++)
		{
			Book book = books.get(n);
			if (book.id > maxNumber)
			{
				maxNumber = book.id;
			}
		}

		return maxNumber + 1;
	}

	public static void main (String args[])
	{

		// Create Books & Members
		createBooks();
		createMembers();

		while(true){
			System.out.println("\n");
			System.out.println("--------------------------------------------------");
			System.out.println("Welcome to world's best library. Choose an option.");
			System.out.println("--------------------------------------------------");
			System.out.println("1. View all books.");
			System.out.println("2. View all members.");
			System.out.println("3. Issue book to a member.");
			System.out.println("4. Check book availability.");
			System.out.println("5. Accept book returned by a member. ");
			System.out.println("6. Add book. ");
			System.out.println("Enter -1 to exit");
			
			Scanner sc = new Scanner(System.in);

			System.out.println("\n");
			System.out.print("Select option from above : ");
			int selectedOption = sc.nextInt();

			if(selectedOption == -1) {
				System.out.println("Thank you for using our system.");
				break;
			}

			else if (selectedOption == 1) 
			{
				viewAllBooks();
			}
			else if (selectedOption == 2) 
			{
				viewAllMembers();
			}
			else if (selectedOption == 3) 
			{
				issueBookToMember();
			}
			else if (selectedOption == 4)
			{
				checkBookAvailability();
			}
		    else if (selectedOption == 5) 
			{
				returnBook();	
			}
			else if (selectedOption == 6)
			{
				addBook();
			}
			else 
			{
				System.out.println("Invalid Option....");
			}
		}
	}
}