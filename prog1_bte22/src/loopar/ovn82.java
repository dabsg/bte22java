package loopar;

import java.util.Scanner;

public class ovn82 {
	public static void main(String[] args) {

		Scanner hej=new Scanner(System.in);
		System.out.println("ange min");
		int min=hej.nextInt();
		System.out.println("ange max");
		int max=hej.nextInt();
		System.out.println("ange längd");
		int längd=hej.nextInt();
		
		for (int i = min; i < max; i=i+längd) {
			
			System.out.println(i);
			
		}
	}
}
