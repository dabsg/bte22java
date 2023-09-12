package prog1_bte22;

import java.util.Scanner;

public class ScannerTest {
public static void main(String[] args) {
	
	/*
	hej
	bnb
	jhh
	*/
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("ange namn "); // skriver ut "ange namn"
	
	String namn=input.nextLine();    // läser in text 
	
	
	System.out.println("hur gammal är du");  // skriver hur gammal är du 
	
	int ålder=input.nextInt(); // läser in ett heltals nummer

	
	System.out.println("hej "+namn+" \njag ser att du är "+ålder+" år gammal");
	
}
}
