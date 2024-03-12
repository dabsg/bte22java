package loopar;

public class Gånger {

	public static void main(String[] args) {

		for(int k=1;k<10;k++) {	
			for (int i = 0; i < 10; i++) {
				System.out.println(i + "*"+k+"=" + i * k);
			}
			System.out.println();
		}

	
	}

}
