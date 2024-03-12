package ifsatser;

import java.util.Scanner;

public class Bankomat {

	public static void main(String[] args) {
		
		int saldo=100000000;
		int val=1;
		
		Scanner input = new Scanner(System.in);
		
		while(val>=1 && val<=3) {
		
		System.out.println("1:uttag \n2:saldo \n3:insättning");
		
		 val = input.nextInt();
		
		
		switch (val) {
		case 1:
			System.out.println("uttag");
			break;
		case 2:
			System.out.println("saldo"+saldo);
			break;
		case 3:
			System.out.println("insättning");
			break;
		
		default:
			System.out.println("fel inmatning");
			break;
		}
		}
		}

}
