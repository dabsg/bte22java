package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.sql.Time;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Boll extends JComponent {

	int r = 30;
	Color c = Color.blue;
	int g = 1;
	int vx = 2;
	int vy = 1;
	int x = 30;
	int y = 30;
	Timer t;
	

	public Boll() {
		this.setPreferredSize(new Dimension(300, 300));

		t = new Timer(30, e -> {

			update();
		});
		
		t.start();
	}

	public void update() {
		vy=vy+g;
		y=y+vy;
		x++;
		r++;
		
		
		if(y+r*2>300) {
			
			vy=vy*-1;
			y=y-10;
		}
		
		
		this.repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
	
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(c);
		g.fillOval(x, y, r * 2, r * 2);

	}

	public static void main(String[] args) {

		JFrame w = new JFrame();
		w.setLayout(new FlowLayout());
		w.setVisible(true);

		w.setContentPane(new Boll());
		w.pack();

	}

}
