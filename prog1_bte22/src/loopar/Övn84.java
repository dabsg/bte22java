package loopar;

import java.util.Arrays;

public class Övn84 {

	public static void main(String[] args) {

		// int[] k= {23,45,67,23,1,67,78,80};

		int[] i = new int[10];

		for (int j = 0; j < i.length; j++) {

			i[j] = (int) (4 * j + (6 * Math.sin(j) * Math.PI) * -1);

		}

		System.out.println(Arrays.toString(i));

		int minstaTalet = Integer.MAX_VALUE;

		for (int r = 0; r < 10; r++) {
			if (i[r] < minstaTalet) {

				minstaTalet = i[r];
			}

		}
		
		System.out.println(minstaTalet);

	}

}
