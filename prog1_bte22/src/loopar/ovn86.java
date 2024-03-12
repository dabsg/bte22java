package loopar;

public class ovn86 {

	
	
	public static void main(String[] args) {
		
		
		int befolkning=1000000;
		int dagar=0;
		while(befolkning<2000000) {
			
			befolkning =(int) (befolkning *1.05);
			dagar++;
			
		}
		
		System.out.println(dagar);
		
	}
}
