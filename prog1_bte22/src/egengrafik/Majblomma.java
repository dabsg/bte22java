package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Majblomma extends JComponent {

	public Majblomma() {
		// TODO Auto-generated constructor stub
		setPreferredSize(new Dimension(400, 400));
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(new Color(106,13,173));
		g.fillOval(100,100, 50,50);

		g.setColor(Color.BLUE);
		g.fillOval(140,100, 25,25);
		g.setColor(Color.cyan);
		g.fillOval(137,113, 25,25);
		
		g.setColor(Color.BLUE);
		g.fillOval(135,120, 25,25);
		g.setColor(Color.cyan);
		g.fillOval(130,125, 25,25);
	}

	public static void main(String[] args) {

		Majblomma m = new Majblomma();
		JFrame f = new JFrame();
		f.setVisible(true);
		f.add(m);
		f.pack();

	}

}
