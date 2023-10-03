package uppgifter;

import java.util.Scanner;

public class Upp26 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ange dit hela namn med mellanslag");
		
		String namn=input.nextLine();
		
		int posMellan=namn.indexOf(' ');
		
		System.out.println(posMellan);
		
		String surNamn=namn.substring(0, posMellan);
		
		String lastnamn=namn.substring(posMellan+1);
		
		
		System.out.println("förnamn: " +surNamn+ "\nefternamn "+lastnamn);
		
		
		
		
		
		
		
	}
}
