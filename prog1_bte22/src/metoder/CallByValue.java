package metoder;

public class CallByValue {

	
	public static void main(String[] args) {
	
		int i =5;
		changeValue(i);
		System.out.println(i);
		
	}

	private static void changeValue(int i ) {
		
		i=20;
	}
	
	
	
	
	
}
