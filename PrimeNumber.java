package Assingnments;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int a = 13;
		boolean b = false;
		for(int i=2; i<= a/2;i++) {
			if(a % i ==0) {
				b = true;
				break;
				
				
			}
		}
		
		if(b==true) {
			System.out.println(a + " -Is Not A Prime No");
		}
		else {
			System.out.println(a + " -Is a Prime No");
		}
	}

}
