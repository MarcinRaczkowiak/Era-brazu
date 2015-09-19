package Pvp;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Postac.Postac;

public class Pvp extends JFrame {
	private JPanel panel1, panel2, panel3;

	public Pvp(Postac postac) {
		setTitle("Era Brazu");
		setVisible(true);
		setSize(410, 410);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		panel1 = new Panel1(this, postac);
		panel2 = new Panel2(this);
		panel3 = new Panel3(this);
		setLayout(new FlowLayout());
		add(panel1);

	}

	public void bochater2(Postac bochater) {
		((Panel1) panel1).bochater2(bochater);
	}

	public void bochater1(Postac bochater) {
		((Panel1) panel1).bochater1(bochater);
	}

}
