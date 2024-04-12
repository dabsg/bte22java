package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PlusMinus {

	int number = 0;
	
	JFrame f = new JFrame();
	JButton plus= new JButton("+");
	JButton minus = new JButton("-");
	JLabel numberHolder = new JLabel(""+number);
	public PlusMinus() {
		
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.setSize(new Dimension(400,400));
		f.add(plus);
		f.add(minus);
		f.add(numberHolder);
		
		plus.addActionListener(e->{
			number++;
			numberHolder.setText(""+number);
		});
		
		minus.addActionListener(e->{
			number--;
			numberHolder.setText(""+number);
		});
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		new PlusMinus();
	}
	
}
