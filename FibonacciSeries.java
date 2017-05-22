import java.io.*;
import java.util.Scanner;

public class FibonacciSeries 
{

	public static int fibo(int n){
	              		
		if (n == 0) 
        {
            System.out.println("0");
            return 0;
        } 
        else if (n == 1) 
        {
        	System.out.println("1");
            return 1;
        } 

	    int a = 0, b = 1;

	    System.out.println("0");
	    System.out.println("1");

		for (int i = 0; i < (n-1); i++)
		{
			int c = a + b;
			a = b;
			b = c;
			
			System.out.println(c);

			// System.out.println("i = " + i);
			// System.out.println("a = " + a);
			// System.out.println("b = " + b);
			// System.out.println("c = " + c + "\n \n");
		}
		return b;
    }

	public static int fibo_rec(int n) 
	{
       if (n < 1) 
       {
           return 0;
       } 
       else if (n == 1) 
       {
           return 1;
       } 
       else 
       {
           return fibo_rec(n - 1) + ( fibo_rec(n - 2));
       }
    }

   public static void main(String[] args) 
   {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a positive integer or -ve number to exit: ");
       int n = scanner.nextInt();
       System.out.print("nth Fibonacci number is (rec): " + Integer.toString(fibo_rec(n)));
       System.out.print("\n");
       System.out.print("nth Fibonacci number is (non rec): " + Integer.toString(fibo(n)));
    }
}