package loopar;

public class Binärsökning {
	public static void main(String[] args) {

		int t[] = {2,5,7,8,9,34,45,67,89,100};
		int s = 2;
		int start = 0;
		int slut = t.length - 1;

		int mitt = (slut + start) / 2;
		System.out.println(mitt);
	

while (t[mitt] != s ) {   // start< =slut
			
			
			if (t[mitt] < s) {
				// slutet av arrayen
				start = mitt+1;
			} else {
				// början av arrayen
				slut = mitt-1;
			}
			mitt = (slut + start) / 2;
			System.out.println(mitt);
		}

		System.out.println("talet finns på pos" + mitt);
	
	
	
	}
}
