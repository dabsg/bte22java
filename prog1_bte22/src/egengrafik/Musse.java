package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JWindow;

public class Musse extends JComponent {

	public Musse() {
	
		
		this.setPreferredSize(new Dimension(300,300));
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.fillOval(20, 20, 20, 20);
		g.setColor(Color.GREEN);
		g.fillOval(100, 20, 20, 20);
	}
	
	
	
	
	public static void main(String[] args) {
		
		JFrame w=new JFrame();
		 w.setLayout(new FlowLayout());
		 w.setVisible(true);
		 w.setSize(new Dimension(300,300));
		w.setContentPane(new Musse());
		w.pack();
		
		
	}
}
