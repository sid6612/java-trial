import java.io.*;
import java.util.Scanner;

public class ApplicationForm
{
	public static void fiboRec(int n)
   {
      System.out.println("Number: " +  Integer.toString(n));
   }

	/*public void strValue(String fname){
		first name = fName;
		
	}

	/*public void intValue(int age){
		age = age;
		
	}

	/*public void chaValue(char sEx){
		sex = sEx;
	}

	public void print(){
		System.out.println("First Name: " + first name );
		System.out.println("Age: " + age );
		System.out.println("Sex: " + sex );
	}*/

   public static void main(String[] args)
   {

      String firstName;
      int age;
      char sex;
      

      Scanner scanner = new Scanner(System.in);
      System.out.println("APPLICATION FORM");
      
      System.out.println("\n");

      System.out.println("First Name: ");
      firstName = scanner.nextLine();
      
      
      System.out.println("Age: ");
      age = scanner.nextInt();
      

      System.out.println("Sex: ");
      sex = scanner.next().charAt(0);


      System.out.println("Input name was: " + firstName);

      fiboRec(age);
   }

}
