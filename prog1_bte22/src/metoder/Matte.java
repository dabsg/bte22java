package metoder;

public class Matte {

	public static void main(String[] args) {

		Matte.printPi();

		int svar = Matte.sum(5, 5);
		System.out.println(svar);
		
		
		
	}

	public static void printPi() {

		System.out.println("3.14");

	}

	public static int sum(int a, int b) {

		int summa = a + b;

		return summa;
	}
	
	public static int sum(int a, int b, int c) {

		int summa = a + b+c;

		return summa;
	}
	
	
	
	
	
	
}
