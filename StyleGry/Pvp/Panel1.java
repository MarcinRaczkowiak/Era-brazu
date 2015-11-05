package Pvp;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import PanelWalki.SterowanieWalka;
import Postac.Postac;
import TworeniePostaci.TworzeniePostaci;

public class Panel1 extends JPanel {

	public static final int HEIGHT = 410;
	public static final int WIDTH = 410;
	private JButton ZmienGracza1;
	private JButton ZmienGracza2;
	private JButton walczButton;

	private JLabel bochaterLable;
	private JLabel podajImie = new JLabel("Imie postaci:");
	private JLabel wybierzPlec = new JLabel("Imie przeciwnika:");
	private JLabel przeciwnik = new JLabel("Przeciwnik");
	private JLabel iloscWalkLabel = new JLabel("D³ugoœæ Walki");
	private JComboBox<String> iloscWalk = new JComboBox<String>();

	private JPanel Panel1;

	private JFrame pvp;
	private Postac postac2;
	private Postac postac1;

	public Panel1(Pvp pvp, Postac postac1, Postac postac2) {
		this.pvp = pvp;
		this.postac1 = postac1;
		this.postac2 = postac2;

		setVisible(true);
		setLayout(null);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));

		ZmienGracza2 = new ZmienGracza2();
		ZmienGracza1 = new ZmienGracza1();
		walczButton = new WalczButton();
		bochaterLable = new JLabel(postac1.getImie());

		bochaterLable.setBounds(240, 40, 130, 20);
		add(bochaterLable);
		podajImie.setBounds(80, 40, 130, 20);
		add(podajImie);
		wybierzPlec.setBounds(80, 80, 130, 20);
		add(wybierzPlec);
		przeciwnik.setBounds(240, 80, 130, 20);
		add(przeciwnik);

		Panel1 = this;

		ZmienGracza2.setBounds(10, 120, 200, 20);
		ZmienGracza1.setBounds(10, 10, 200, 20);
		iloscWalkLabel.setBounds(10, 200, 100, 20);
		walczButton.setBounds(150, 290, 150, 20);
		iloscWalk.setBounds(185, 200, 130, 20);

		iloscWalk.addItem("1");
		iloscWalk.addItem("2");
		iloscWalk.addItem("5");
		iloscWalk.addItem("10");
		iloscWalk.addItem("15");
		iloscWalk.addItem("25");
		iloscWalk.addItem("50");
		iloscWalk.addItem("100");
		iloscWalk.addItem("175");

		add(iloscWalk);
		add(iloscWalkLabel);
		add(ZmienGracza2);
		add(ZmienGracza1);

		add(walczButton);

	}

	public void bochater2(Postac bochater) {
		postac2 = bochater;
		przeciwnik.setText(postac2.getImie());
	}

	public void bochater1(Postac bochater) {
		postac1 = bochater;
		bochaterLable.setText(postac1.getImie());
	}

	class ZmienGracza2 extends JButton implements ActionListener {

		ZmienGracza2() {
			super("Zmieñ gracza2 ");
			addActionListener(this);
		}

		public void actionPerformed(ActionEvent e) {
			String rodzajGry = "Gracz2";
			new TworzeniePostaci(pvp, rodzajGry);
			pvp.setVisible(false);

		}
	}

	class ZmienGracza1 extends JButton implements ActionListener {

		ZmienGracza1() {
			super("Zmieñ gracza1 ");
			addActionListener(this);
		}

		public void actionPerformed(ActionEvent e) {
			String rodzajGry = "Gracz1";
			new TworzeniePostaci(pvp, rodzajGry);
			pvp.setVisible(false);

		}
	}

	class WalczButton extends JButton implements ActionListener {

		WalczButton() {

			super("Rozpocznij walkê");
			addActionListener(this);
		}

		public void actionPerformed(ActionEvent e) {

			String color = iloscWalk.getSelectedItem().toString();
			((Pvp) pvp).setIloscWalk(Integer.parseInt(color));
			new SterowanieWalka(pvp, postac1, postac2, color);
			if (Integer.parseInt(color) != 1) {
				((Pvp) pvp).panel2(postac1, postac2);
			} else {
				((Pvp) pvp).panel3of1(postac1, postac2);
			}
		}
	}
}
