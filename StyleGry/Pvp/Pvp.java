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
	private int wygraneGracz1 = 0, wygraneGracz2 = 0, iloscWalk;

	public Pvp(Postac postac1) {
		this.postac1 = postac1;

		JOptionPane.showMessageDialog(null, "Stwórz kolejn¹ postaæ",
				"Pilna wiadomoœæ", JOptionPane.INFORMATION_MESSAGE);

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

	public void WygraneGracz1() {
		wygraneGracz1++;

		if (iloscWalk > wygraneGracz1) {
			((Panel2) panel2).setPostac1Wygrane();

			String tekst = "Wygra³ gracz1: " + postac1.getImie();
			String tekst2 = "Dlatego s³abszy gracz: " + postac2.getImie()
					+ " dostaje lewel :)";
			((Panel2) panel2).setktoWygral(tekst, tekst2);
		} else {
			zwyciesca = 1;
			panel3(postac1, postac1);
		}
	}

	public void WygraneGracz2() {
		wygraneGracz2++;

		if (iloscWalk > wygraneGracz2) {
			System.out.println(iloscWalk + " " + wygraneGracz2);
			((Panel2) panel2).setPostac2Wygrane();

			String tekst = "Wygra³ gracz2: " + postac2.getImie();
			String tekst2 = "Dlatego s³abszy gracz: " + postac1.getImie()
					+ " dostaje lewel :)";
			((Panel2) panel2).setktoWygral(tekst, tekst2);
		} else {
			zwyciesca = 2;
			panel3(postac1, postac1);
		}
	}

	public int getWygraneGracz1() {
		return wygraneGracz1;
	}

	public int getWygraneGracz2() {
		return wygraneGracz2;
	}

	public void setIloscWalk(int iloscWalk) {
		this.iloscWalk = iloscWalk;
	}

	public int getIloscWalk() {
		return iloscWalk;
	}

}
