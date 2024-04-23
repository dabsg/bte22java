package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Bildväxlare {

	int vilkenbild=1;
	JFrame f=new JFrame("bildväxlare");
	JLabel l= new JLabel("hej", new ImageIcon("test1.jpg"),SwingConstants.CENTER );
	JButton knapp= new JButton("switch image");
	
	public Bildväxlare() {
		
		f.setLayout(new FlowLayout());
		f.setSize(new Dimension(400,400));
		f.setVisible(true);
		f.add(l);
		f.add(knapp);
		
		
		knapp.addActionListener(e->{

			if (vilkenbild==1) {
				
				l.setIcon(new ImageIcon("test2.jpg"));
				vilkenbild=2;
			}else if (vilkenbild==2) {
				l.setIcon(new ImageIcon("test1.jpg"));
				vilkenbild=1;
			
			}
		});
		
		
		
	}
	public static void main(String[] args) {
		
		new Bildväxlare();
	}
	
}
