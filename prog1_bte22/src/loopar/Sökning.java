package loopar;

import javax.swing.JOptionPane;

public class Sökning {
public static void main(String[] args) {
	
	int [] k = {23,452,54,653,23,452,113,54,78,9,43,2323,232,23,23,23,23,454,656,5};
	
	String talString=JOptionPane.showInputDialog("ange talet du söker");
	
	int tal=Integer.parseInt(talString);
	int förekomst=0;
	String positions="sökta talet finns på följande position(er)";
	
	for (int i = 0; i < k.length; i++) {
		
		if(k[i]==tal) {
			
			förekomst++;
			positions=positions+" "+i;
			//break;
		}
		
	}
	
	System.out.println("talet finns med " +förekomst+"ggr"+positions);
	
	
	
}
}
