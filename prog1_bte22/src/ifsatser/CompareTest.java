package ifsatser;

public class CompareTest {

	public static void main(String[] args) {
	
		
		String name1= "Ö";
		String name2= "Anna";
		
		
		int svar=name1.compareToIgnoreCase(name2);
		
		System.out.println("svaret blir" +svar);
		
		if(svar <0) {
			
			System.out.println("variabel 1 kommer före");
			
		}else if(svar==0) {
			
			System.out.println("variabel 2 kommer först");
		}else {
			
			System.out.println("test");
		}
		
		String i ="5";
		String k = "5";
		
		
		if(i.equals(k)) {
			
			
		}
		
		
		
		
		
	}
	
}
