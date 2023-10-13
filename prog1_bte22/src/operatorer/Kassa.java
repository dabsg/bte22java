package operatorer;

import java.util.Scanner;

public class Kassa {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ange varans pris");
		
		int pris = input.nextInt();
		
		System.out.println("ange belopp som kunden ger");
		
		int belopp= input.nextInt();
		
		
		int tillbaka= belopp-pris;
		
		
		int tusen = tillbaka/1000;
		
		int rest = tillbaka%1000;
		
		
		int femhundra= rest/500;
		
			rest= rest%500; 
		
		int tvåhundra= rest/200;
		
		
		
		
		System.out.println(rest);
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
