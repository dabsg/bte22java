package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Pacman extends JComponent {

	//variabler
	
	int pacx=100;
	int pacy=100;
	
	
	int [] x = new int[3];
	int [] y = {150,175,125};
	Timer t;
	int mouth=0;
	
	/// konstruktor
	public Pacman() {
	
		x[0]= 150;
		x[1]=100;
		x[2]=100;
		
		t= new Timer(1000, e->{
			
		
			if(mouth==0) {
				
				y[1]=160;
				y[2]=140;	
				mouth=1;
			}else if(mouth==1) {
				y[1]=150;
				y[2]=150;	
				mouth=2;
				
			}else if(mouth==2) {
				
				y[1]=160;
				y[2]=140;	
				mouth=3;	
			}else if (mouth==3) {
				y[1]=175;
				y[2]=125;	
				mouth=0;	
				
				
			}
			
			
			
		
		repaint();	
			
		});
		t.start();
		
		this.setPreferredSize(new Dimension(400,400));
		
	}
	
	
	//metoder
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(pacx, pacy, 100, 100);
		g.setColor(this.getBackground());
		g.fillPolygon(x, y, 3);
	}
	
	
//main
	
	public static void main(String[] args) {
		
	JFrame f= new JFrame();
	f.setLayout(new FlowLayout());
	f.setSize(new Dimension(400,400));
	f.setVisible(true);
	f.add(new Pacman());
	f.pack();
	
	
		
		
	}
	
}
