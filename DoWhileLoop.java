public class DoWhileLoop{

	public static void main (String args[]){
		int a = 80;
		do{
			System.out.println("Value of A : " + a);
			a++;
			/*if (a == 100){
				break;
			}*/
			if (a == 120){
				continue;
			}
		}while( a < 150 );
	}
}