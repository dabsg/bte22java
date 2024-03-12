package metoder;

public class Text {

	public static void main(String[] args) {

		System.out.println(längd("hejjkjkjkjkjkj", "hehjkjk"));
		
		
		System.out.println(slumpaOrd(3));
		

	}

	public static String slumpaOrd(int i) {
		
		String ord="";
		
		for (int j = 0; j < i; j++) {
			
			int slump=(int) ( Math.random() *25 +65 );
			
			char tecken= (char) slump; 
			
			ord=ord+tecken;
			
		}
		
		return ord;
	}

	public static String längd(String string, String string2) {

		int l1 = string.length();
		int l2 = string2.length();

		if (l1 == l2) {

			return "lika";
		}

		if (l1 > l2) {

			return string;
		} else {

			return string2;

		}

	}

	
	
	
	
	
	
	
}
