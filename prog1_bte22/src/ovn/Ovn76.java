package ovn;

import java.util.Scanner;

public class Ovn76 {

	public static void main(String[] args) {
		
		double rabatt=1;
		Scanner input = new Scanner(System.in);
		System.out.println("ange antalet skivor");
		int antal = input.nextInt();

		if (antal > 10 && antal <= 50) {

			rabatt= 0.95;

		}
		else if (antal > 50 && antal <= 100) {

			rabatt= 0.9;

		}
		else if (antal > 100) {

			rabatt= 0.85;

		} 

		
		double pris = antal * 9.9 * rabatt;
		System.out.println("pris:" + pris);
		
		
		
	}
}
