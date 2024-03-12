package metoder;

import java.util.Arrays;

public class CallByReference {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 56, 8 };

		test(arr);
		System.out.println(Arrays.toString(arr));
		findMaxInArr(arr);
	}

	public static void test(int[] a) {

		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 10);
		}

	}

	public static void findMaxInArr(int[] a) {

		int max=-10000000; 
		
		for (int i = 0; i < a.length; i++) {
			
			if(max< a[i]) {
				
				max=a[i];
			}
			
		}
		System.out.println(max);
		
	}

}
