public class ForLoop{

	public static void main (String argsp[]){
		int [] numbers = {31, 28, 30, 31, 30};

		for (int x : numbers){
			System.out.print( x );
			System.out.print(",");
		}
		System.out.print("\n");
		String [] names = {"January", "Febuary", "March", "April", "May"};

		for (String name : names){
			System.out.print(name);
			System.out.print(",");
		}
	}
}