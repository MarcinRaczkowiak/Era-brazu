package Pvp;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Postac.Postac;
import TworeniePostaci.TworzeniePostaci;

public class Pvp extends JFrame {
	private JPanel panel1, panel2, panel3;
	private Postac postac1, postac2;
	public static int zwyciesca = 0;

	public Pvp(Postac postac1) {
		this.postac1 = postac1;

		JOptionPane.showMessageDialog(null, "Stw�rz kolejn� posta�",
				"Pilna wiadomo��", JOptionPane.INFORMATION_MESSAGE);

		String rodzajGry = "Gracz2";
		new TworzeniePostaci(this, rodzajGry);
		setVisible(false);

		setTitle("Era Brazu");

		setSize(410, 410);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(450, 170, 410, 410);

		panel1 = new Panel1(this, postac1, postac2);

		setLayout(new FlowLayout());
		add(panel1);

	}

	public void bochater2(Postac bochater) {
		((Panel1) panel1).bochater2(bochater);
	}

	public void bochater1(Postac bochater) {
		((Panel1) panel1).bochater1(bochater);
	}

	public void panel2(Postac postac1, Postac postac2) {
		this.postac1 = postac1;
		this.postac2 = postac2;
		remove(panel1);
		panel2 = new Panel2(this, postac1, postac2);
		add(panel2);
		panel2.setVisible(true);

		repaint();

	}

	public void panel3(Postac postac1, Postac postac2) {
		this.postac1 = postac1;
		this.postac2 = postac2;
		remove(panel2);
		panel3 = new Panel3(this, postac1, postac2);
		add(panel3);
		panel3.setVisible(true);

		repaint();

	}

	public void panel3of1(Postac postac1, Postac postac2) {
		this.postac1 = postac1;
		this.postac2 = postac2;
		remove(panel1);
		panel3 = new Panel3(this, postac1, postac2);
		add(panel3);
		panel3.setVisible(true);

		repaint();

	}

	public void WynikWalki(int zwyciesca1) {
		zwyciesca = zwyciesca1;
	}

	public static int KotWygrywa() {
		return zwyciesca;
	}

}
