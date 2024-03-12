package metoder;

public class Stars {

	public static void main(String[] args) {

		String s=printStars(4, 4);
		System.out.println(s);
	}

	public static String printStars(int kol, int rad) {

		String pattern = "";

		for (int i = 0; i < rad; i++) {
			for (int j = 0; j < kol; j++) {
				pattern = pattern + "*";
			}
			pattern = pattern + "\n";
		}

		return pattern;

	}
}
