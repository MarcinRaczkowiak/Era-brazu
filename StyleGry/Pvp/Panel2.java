package Pvp;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import PanelWalki.SterowanieWalka;
import Postac.Postac;
import ZarzadzaniePostacia.LewelUp;

public class Panel2 extends JPanel implements ActionListener {

	public static final int HEIGHT = 410;
	public static final int WIDTH = 410;

	private JFrame pvp;
	private Postac postac2;
	private Postac postac1;

	private JLabel postac1Imie;
	private JLabel postac2Imie;
	private JLabel postac1Wygrane;
	private JLabel postac2Wygrane;
	private JLabel ktoWygral;
	private JLabel ktoWygral2;

	private JButton wybierzPlec2;
	private JButton dalej;

	public Panel2(Pvp pvp, Postac postac1, Postac postac2) {
		this.pvp = pvp;
		this.postac1 = postac1;
		this.postac2 = postac2;

		setLayout(null);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));

		postac1Imie = new JLabel(postac1.getImie());
		postac2Imie = new JLabel(postac2.getImie());
		postac1Wygrane = new JLabel("wygrane "
				+ String.valueOf(pvp.getWygraneGracz1()));
		postac2Wygrane = new JLabel("wygrane "
				+ String.valueOf(pvp.getWygraneGracz2()));
		ktoWygral = new JLabel("AWARJA PROGRAMU");
		ktoWygral2 = new JLabel("AWARJA PROGRAMU");

		dalej = new Dalej();
		dalej.setBounds(150, 350, 100, 20);
		dalej.setEnabled(false);
		dalej.setActionCommand("bb");
		dalej.addActionListener(this);
		add(dalej);

		wybierzPlec2 = new WybierzPlec2();
		wybierzPlec2.setBounds(150, 320, 100, 20);
		wybierzPlec2.setActionCommand("dalej");
		wybierzPlec2.addActionListener(this);
		add(wybierzPlec2);

		postac1Wygrane.setBounds(150, 20, 130, 20);
		add(postac1Wygrane);

		postac1Imie.setBounds(20, 20, 130, 20);
		add(postac1Imie);

		postac2Wygrane.setBounds(150, 100, 130, 20);
		add(postac2Wygrane);

		postac2Imie.setBounds(20, 100, 130, 20);
		add(postac2Imie);

		ktoWygral.setBounds(50, 200, 350, 20);
		add(ktoWygral);
		ktoWygral2.setBounds(100, 220, 300, 20);

		add(ktoWygral2);
	}

	public void setPostac1Wygrane() {
		postac1Wygrane.setText("wygrane "
				+ String.valueOf(((Pvp) pvp).getWygraneGracz1()));
	}

	public void setPostac2Wygrane() {
		postac2Wygrane.setText("wygrane "
				+ String.valueOf(((Pvp) pvp).getWygraneGracz2()));
	}

	public void setktoWygral(String tekst, String tekst2) {
		ktoWygral.setText(tekst);
		ktoWygral2.setText(tekst2);
	}

	class Dalej extends JButton implements ActionListener {

		Dalej() {
			super("Walczcie");

			addActionListener(this);
		}

		public void actionPerformed(ActionEvent e) {

			dalej.setEnabled(false);

			wybierzPlec2.setEnabled(true);

			String a = "2"; // tymczasowe rozwiązanie są ważniejszerzeczy do
							// zrobienia
			new SterowanieWalka(pvp, postac1, postac2, a);

		}
	}

	class WybierzPlec2 extends JButton implements ActionListener {

		WybierzPlec2() {
			super("LewelUP");

			addActionListener(this);
		}

		public void actionPerformed(ActionEvent e) {

			dalej.setEnabled(true);

			wybierzPlec2.setEnabled(false);

			if (((Pvp) pvp).KotWygrywa() == 1) {
				new LewelUp(pvp, postac2);
			} else {
				new LewelUp(pvp, postac1);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		// if ("dalej".equals(e.getActionCommand())) {
		// dalej.setEnabled(true);
		//
		// wybierzPlec2.setEnabled(false);
		// } else {
		// dalej.setEnabled(true);
		//
		// wybierzPlec2.setEnabled(false);
		// }

	}

}
