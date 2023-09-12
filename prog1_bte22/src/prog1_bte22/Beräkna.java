package prog1_bte22;

import javax.swing.JOptionPane;

public class Beräkna {

	public static void main(String[] args) {

		String ageString = JOptionPane.showInputDialog("ange ålder");

		int age = Integer.parseInt(ageString);

		
		String lengthString = JOptionPane.showInputDialog("ange längd");

		int length = Integer.parseInt(lengthString);

		

		 int svar = age*length;

		 System.out.println(svar);

	}
}
