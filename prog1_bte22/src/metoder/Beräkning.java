package metoder;

public class Beräkning {

	
	
	public static void main(String[] args) {
		double sek=100;
		double nok=sekNok(sek);
		System.out.println("växelkursen ger "+ nok + "nok vid växling av "+sek+"sek");
	}
	
	public static double sekNok(double sek) {
		
		double nok= 1.02*sek;
		
		return nok;
	}
	
	
	
}
