package egengrafik.bollar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Gameloop extends JComponent {

	Boll [] bollar = new Boll [100000]; 
	Timer t;
	
	public Gameloop() {
		
	 for (int i = 0; i < bollar.length; i++) {
		 
		 bollar[i]	= new Boll((int)(Math.random()*10)+1,
				 				new Color((int)(Math.random()*255),
				 						(int)(Math.random()*255),
				 						(int)(Math.random()*255)),
				 				(int)(Math.random()*10)-5,
				 				(int)(Math.random()*10)-5,
				 				(int)(Math.random()*400),
				 				(int)(Math.random()*400));
			
	}
		
	 
	 this.setPreferredSize(new Dimension(400,400));
	 
	 t=new Timer(40,e->{
		
		 for (Boll boll : bollar) {
			 boll.move();
		}
		 
		
		 repaint();
	 });
	 
	 t.start();
	 
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		for (Boll boll : bollar) {
			
		g.setColor(boll.c);
		g.fillOval(boll.x, boll.y, boll.r*2, boll.r*2);
		}
	
	}
	
	public static void main(String[] args) {
		
		JFrame f= new JFrame("bollar som flyger");
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.add(new Gameloop());
		f.pack();
		
		
	}
	
	
}
