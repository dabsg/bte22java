package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bildväxlare {

	JFrame f=new JFrame("bildväxlare");
	JLabel l= new JLabel(new ImageIcon("test.jpg"));
	
	public Bildväxlare() {
		
		f.setLayout(new FlowLayout());
		f.setSize(new Dimension(400,400));
		f.setVisible(true);
		f.add(l);
		
	}
	public static void main(String[] args) {
		
		new Bildväxlare();
	}
	
}
