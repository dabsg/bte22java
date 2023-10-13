package operatorer;

public class Tidsomvandling {

	
	public static void main(String[] args) {
		
		
		int sekunderTot= 3666;
		
		int timmar= sekunderTot/3600;
		
		
		int restTimmar= sekunderTot-(timmar*3600);
		
		int minuter = restTimmar/ 60; 
		
		int sekunder = restTimmar%60;
		
		
		
		System.out.println( sekunderTot +" är "+timmar+"h "+minuter+"m "+sekunder+"s");
		
		
	}
	
	
}
