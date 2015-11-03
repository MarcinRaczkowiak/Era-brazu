package Pvp;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Postac.Postac;

public class Panel3 extends JPanel {

	public static final int HEIGHT = 410;
	public static final int WIDTH = 410;

	private JFrame pvp;
	private Postac postac2;
	private Postac postac1;
	private JLabel wygrany;

	public Panel3(Pvp pvp, Postac postac1, Postac postac2) {
		this.pvp = pvp;
		this.postac1 = postac1;
		this.postac2 = postac2;

		setVisible(true);
		setLayout(null);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));

		if (Pvp.KotWygrywa() == 1) {
			wygrany = new JLabel("Wygra³ " + postac1.getImie());
		} else {
			wygrany = new JLabel("Wygra³ " + postac2.getImie());
		}
		wygrany.setBounds(150, 90, 180, 20);
		add(wygrany);

	}

}
