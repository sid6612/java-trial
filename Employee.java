import java.io.*;
import java.util.Scanner;

public class Employee
{
   String name;
   int age;
   String designation;
   double salary;

   public Employee(String name) {
      this.name = name;
   }

   public void empAge(int empAge) {
      age = empAge;
   }

   public void empDesignation(String empDesig) {
      designation = empDesig;
   }

   public void empSalary(double empSalary) {
      salary = empSalary;
   }

	public void printEmployee() {
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Designation:" + designation );
      System.out.println("Salary:" + salary);
   }

   public static void main(String[] args)
   {
	    Scanner scanner = new Scanner(System.in);
       System.out.println("\n");
	    
       System.out.print("Enter first employee's name: ");

	    String firstEmployeeName = scanner.next();

	    Employee empOne = new Employee(firstEmployeeName);

	    empOne.empAge(26);
	    empOne.empDesignation("Senior Software Engineer");
	    empOne.empSalary(1000);
	    empOne.printEmployee();

	    System.out.println("\n");

	    System.out.print("Enter second employee's name: ");

	    String secondEmployeeName = scanner.next();

	    Employee empTwo = new Employee(secondEmployeeName);
	    
	    empTwo.empAge(21);
	    empTwo.empDesignation("Software Engineer");
	    empTwo.empSalary(500);
	    empTwo.printEmployee();
   }
}