import java.io.*;
import java.util.Scanner;

public class LibraryManagement 
{

	static Book[] books = new Book[10];
	static Member[] members = new Member[5];

	public static Member findMemberById(int idToFind) 
	{
		for (int j = 0; j < members.length; j++)
		{
			Member member = members[j];
			if(member.id == idToFind)
			{
				return member;
			}
		}
		return members[idToFind];
	}

	public static Book findBookById(int idToFind) 
	{
		for (int i = 0; i < books.length; i++) 
		{
			Book book = books[i];
			if(book.id == idToFind)
			{
				return book;
			}
		}
		return books[idToFind];

	}

	public static void createBooks() 
	{
		books[0] = new Book(1,"1. 2 States");
		books[1] = new Book(2,"2. The Half Girlfriend");
		books[2] = new Book(3,"3. Stardust");
		books[3] = new Book(4,"4. Beowulf");
		books[4] = new Book(5,"5. Ulysses");
		books[5] = new Book(6,"6. The Bell Jar");
		books[6] = new Book(7,"7. Persuasion");
		books[7] = new Book(8,"8. The Aeneid");
		books[8] = new Book(9,"9. Candide");
		books[9] = new Book(10,"10. The Republic");

		//System.out.println("Book 1: " + books[0].name);
	}

	public static void createMembers() 
	{
		members[0] = new Member(1, "Siddharth");
		members[1] = new Member(2, "Harshal");
		members[2] = new Member(3, "Harsh");
		members[3] = new Member(4, "Nimesh");
		members[4] = new Member(5, "Arpan");
	}

	public static void viewAllBooks()
	{
		System.out.println("\n");
		System.out.println("Showing all books: ");

		for (int i = 0; i < books.length; i++) 
		{
	        System.out.println(books[i].name + " ");
	    }
	}

	public static void viewAllMembers() 
	{
		System.out.println("\n");
		System.out.println("Showing all members: ");
		System.out.println("| ID     | NAME                     |");

		for (int j = 0; j < members.length; j++) 
		{
			System.out.println("| " + members[j].id + "      | " + members[j].name + "                     ");
		}
	}

	public static void issueBookToMember() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n");
		System.out.print("Enter member ID: ");
		int memberId = sc.nextInt();

		Member selectedMember = findMemberById(memberId);

		System.out.println("\n");
		System.out.print("Enter book ID: ");
		int bookId = sc.nextInt();

		Book selectedBook = findBookById(bookId);
	}

	public static void main (String args[])
	{

		// Create Books & Members
		createBooks();
		createMembers();

		while(true){
			System.out.println("\n");
			System.out.println("------");
			System.out.println("Welcome to world's best library. Choose an option.");
			System.out.println("------");
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

			else if(selectedOption == 1) 
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
			else 
			{
				System.out.println("Invalid Option....");
			}
		}
	}
}