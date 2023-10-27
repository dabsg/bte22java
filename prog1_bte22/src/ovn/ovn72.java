package ovn;

import java.util.Scanner;

public class ovn72 {
 public static void main(String[] args) {
	

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("ange mäng bränsle kvar");
		
		int b = input .nextInt();
	 
		if(b>10) {
			
			System.out.println("kör vidare");
			
		}else {
			
			int tankaMängd=50-b;
			int pris= 25*tankaMängd;
			
			System.out.println(" du behöver tanka"+tankaMängd+"liter som kostar"+pris);
		}
	 
		System.exit(0);
}
}
