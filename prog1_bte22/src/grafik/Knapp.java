package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Knapp extends JFrame implements ActionListener  {

	int state = 0;
	
	// variabler
	JButton b1 = new JButton("skicka uppgifter");
	JLabel infoText =new JLabel("hej");
	
	// konstruktor
	public Knapp(int w, int h) {
		
		this.setVisible(true);
		this.setSize(new Dimension(w,h));
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.add(b1);
		this.add(infoText);
		this.setLayout(new FlowLayout());
		b1.addActionListener(this);
	}
	
	// metoder
	
	
	public static void main(String[] args) {
		
		//new Knapp(200,200); // skapar ett objekt av klassen.
		new Knapp(300,300);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()== b1) {
			
			if(state==0) {
				
				infoText.setText("hej då ");
				state = 1;
			}else if(state ==1) {
				
				infoText.setText("hej");
				state=0;
			}
			
			
		}
		
	}
	
}
