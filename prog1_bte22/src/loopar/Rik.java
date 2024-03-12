package loopar;

public class Rik {
	public static void main(String[] args) {

		
		int summa=0;
		int lön=1;
		int dagar=0;
		
		
		
		while(summa<1000000000) {
			
			summa =summa+lön;
			lön=lön*2;
			dagar+=1;
			System.out.println("dagar:"+dagar+" summa:"+summa+"lön:"+lön);
			
		}
		
		//System.out.println("dagar:"+dagar+" summa:"+summa);
		
		
		
	}
}
