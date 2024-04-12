package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Scanner;

import javax.sql.rowset.serial.SerialJavaObject;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LängstOrd {

	JButton knapp1;
	JFrame f= new JFrame();
	JLabel svar= new JLabel();
	JTextField ord1=new JTextField(10);
	JTextField ord2= new JTextField(20);
	
	public LängstOrd(String t) {
		

		knapp1=new JButton(t);
		
		f.setVisible(true);
		f.setSize(new Dimension(300,300));
		f.setLayout(new FlowLayout());
		f.add(ord1);
		f.add(ord2);
		f.add(knapp1);
		f.add(svar);
		
		knapp1.addActionListener(e -> {
			
			String längstaOrdet=longestWord(ord1.getText() ,ord2.getText());
			svar.setText(längstaOrdet);
		});
	}
	
	public static String longestWord(String o1 , String o2) {
		
		if(o1.length()<o2.length()) {
			
			return o2;
			
		}else {
			
			return o1;
		}
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("ange knappens text");
				String knapptext=sc.nextLine();
		new LängstOrd(knapptext);
		
	}
	
}
