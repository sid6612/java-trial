public class Test{

	public static void main (String arge[]){
		int a = 20;
		int b = 10;

		System.out.println("a == b = " +(a == b) );
		System.out.println("a != b = " + (a != b));
		System.out.println("a < b = " + (a < b));
		System.out.println("a > b = " + (a > b));
		System.out.println("a <= b = " + (a <= b));
		System.out.println("a >= b = " + (a >= b));

		int c,d;
		c = 5;
		d = (c == 4) ? 100 : 200;
		System.out.println("Your value is " + d);

		d = (c == 5) ? 100 : 200;
		System.out.println("Your value is " + d);
	}
}