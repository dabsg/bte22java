package metoder;

public class Ord {

	static String []ord = {"hej","hur","varför","flaggstångsputsmedel","elefant","gnida","tillbehör"};
	
	
	
	public static void main(String[] args) {
		
		System.out.println(Ord.arrMeningSlump(ord));
		
	}
	
	public static String arrMeningSlump(String[] ord) {
		
		String mening="";
	
		
		for (int i = 0; i < 5; i++) {
			
			mening=mening+" "+ord [(int)(Math.random()*ord.length)  ] ;
			
		}
		
		return mening;
	}
	
	
}
