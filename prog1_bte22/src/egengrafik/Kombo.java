package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kombo extends JComponent{

	// variabler
	private int x=200;
	private int y =200;
	
	public Kombo() {
		// TODO Auto-generated constructor stub
		
		this.setPreferredSize(new Dimension(500,500));
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(new Color(255, 0, 0));
		g.fillArc(x, y, 100, 100, 210, 300);
		g.drawString("hej", x, y);
		
	}
	public void moveRight() {
		
		if(x<500) {
		x=x+10;
		repaint();
		}else {
			
			x=200;
		}
	}
	
	
	
}
