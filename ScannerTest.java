import java.util.Scanner;
class ScannerTest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter your Roll No: ");
		int rollno=sc.nextInt();
		System.out.println("Enter your Name: ");
		String name=sc.next();
		System.out.println("Enter your Fee: ");
		double fee=sc.nextDouble();
		System.out.println("Rollno: " +rollno+ "name: " +name+ "fee: " +fee);
		sc.close();
	}
}