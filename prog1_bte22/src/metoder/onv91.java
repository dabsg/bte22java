package metoder;

public class onv91 {

	public static void main(String[] args) {
		
		
		double svar=cirkelArea(10);
		System.out.println(svar);

		 svar=cylinderVolym(10, 10);
		System.out.println(svar);
	}

	public static double cirkelArea(int r) {
		
		double area=Math.PI*Math.pow(r, 2);
		
		return area;
	}
	public static double cylinderVolym(double r, double h) {
		
		double volym = Math.PI*Math.pow(r, 2)*h;
		return volym;
	}
	
	
	
	
}
