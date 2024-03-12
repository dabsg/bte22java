package loopar;

import java.util.Scanner;

public class Wordmirror {

	public static void main(String[] args) {
		
		
		Scanner hej=new Scanner(System.in);
		System.out.println("ange ett ord som du vill vända på");
		String ord=hej.nextLine();
		
		int size=ord.length();
		
		for(int i =size-1;i>=0;i--) {
			
		System.out.println( ord.charAt(i));
			
		}
		
		
		
		
	}
	
	
}
