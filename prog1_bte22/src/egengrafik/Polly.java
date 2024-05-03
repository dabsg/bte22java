package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Polly extends JComponent {

	//variabler
	
	int [] x = new int[4];
	int [] y = {30,70,80,60};
	
	
	
	/// konstruktor
	public Polly() {
	
		x[0]= 30;
		x[1]=100;
		x[2]=70;
		x[3]=49;
		
		this.setPreferredSize(new Dimension(400,400));
		
	}
	
	
	//metoder
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.setColor(new Color(255,0, 0));
		
		g.drawPolygon(x, y, 4);
	}
	
	
//main
	
	public static void main(String[] args) {
		
	JFrame f= new JFrame();
	f.setLayout(new FlowLayout());
	f.setSize(new Dimension(400,400));
	f.setVisible(true);
	f.add(new Polly());
	f.pack();
	
	
		
		
	}
	
}
