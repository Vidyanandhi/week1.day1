package Assingnments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int sum;
		int range = 8;
		
		System.out.println("First no:-" + a);
		for(int i = 0;i <= range; i++) {
			System.out.print("," + b);
			sum = a + b;
			a = b;
			b = sum;
			
			
		}

	}

}
