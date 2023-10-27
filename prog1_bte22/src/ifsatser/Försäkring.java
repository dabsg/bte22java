package ifsatser;

import javax.swing.JOptionPane;

public class Försäkring {
	public static void main(String[] args) {

		String sÅlder = JOptionPane.showInputDialog("ange bilens ålder");

		int ålder = Integer.parseInt(sÅlder);
		
		
		if (ålder >=10) {
			
			// trafikförsäkring
		}else if (ålder >=6 && ålder<=9) {
			//skaffa en halvförsäkring
		}else {
		// skaffa helförsäkring	
		}
		
		}

	}
}
