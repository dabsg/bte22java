package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Buttontest {

	// varaiabler
	JFrame f = new JFrame();
	JRadioButton c = new JRadioButton("c");
	JRadioButton cSharp = new JRadioButton("csharp");
	JRadioButton java = new JRadioButton("java");
	ButtonGroup bg = new ButtonGroup();
	JCheckBox plc = new JCheckBox("c");
	JCheckBox plcsharp = new JCheckBox("csharp");
	JCheckBox pljava = new JCheckBox("java");
	JButton b = new JButton("done");
	JLabel l = new JLabel("");

	// konstruktor
	public Buttontest() {

		f.setSize(new Dimension(400, 400));
		f.setLayout(new FlowLayout());
		f.setVisible(true);

		bg.add(c);
		bg.add(cSharp);
		bg.add(java);

		f.add(c);
		f.add(cSharp);
		f.add(java);

		f.add(plc);
		f.add(plcsharp);
		f.add(pljava);

		f.add(l);

		f.add(b);

		b.addActionListener(e -> {

			String s= "";
			
			if (c.isSelected()) {

				s=s+ "du har valt C";
				

			}
			if (cSharp.isSelected()) {

				s=s+"du har valt Csharp";
			}
			if (java.isSelected()) {

				s=s+"du har valt java";
			}

			if(plc.isSelected()) {
				
				s=s+"du känner till C";			
			}
			
			l.setText(s);
		});

	}

	// metoder

	// main
	public static void main(String[] args) {

		Buttontest bb = new Buttontest();
	}

}
