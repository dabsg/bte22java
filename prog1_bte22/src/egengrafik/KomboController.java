package egengrafik;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KomboController {
	public static void main(String[] args) {
		
		Kombo k=new Kombo();
		JPanel p = new JPanel();
		JButton b= new JButton("->");
		JFrame f= new JFrame("hej");
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		
		p.add(k);
		p.add(b);
		
		f.add(p);
		
		f.pack();
		
		b.addActionListener(e->{
			
		
			k.moveRight();
			
		});
		
		
	}
}
