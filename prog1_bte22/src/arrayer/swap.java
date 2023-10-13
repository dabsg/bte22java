package arrayer;

import java.util.Arrays;

public class swap {

	public static void main(String[] args) {
		
		
		int [] i = new int[3] ;
		
		i[0]= 4;
		i[1]= 6;
		i[2]= 8;
		
		
		int temp= i[0];
		
		i[0]=i[2];
		i[2]=temp; 
		
		System.out.println(Arrays.toString(i));
		
	}
	
	
	
	
}
