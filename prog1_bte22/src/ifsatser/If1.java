package ifsatser;

import javax.swing.JOptionPane;

public class If1 {

	public static void main(String[] args) {
		
		
		String  sÅlder=JOptionPane.showInputDialog("ange din ålder");
		
		int ålder=Integer.parseInt(sÅlder);
		
		if(ålder >= 65) {
			
		JOptionPane.showMessageDialog(null, "priset blir 10");
			
		}else {
		
			JOptionPane.showMessageDialog(null, "priset blir 20");
			
		}

		
		
		
		
		
		
		
		
		
	}
}
	

