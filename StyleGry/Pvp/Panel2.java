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

public class Panel2 extends JPanel {

	public static final int HEIGHT = 410;
	public static final int WIDTH = 410;

	private JFrame pvp;
	private Postac postac2;
	private Postac postac1;

	private JLabel postac1Imie;
	private JLabel postac2Imie;
	private JLabel postac1Wygrane;
	private JLabel postac2Wygrane;
	private JLabel podajImie2;
	private JLabel wybierzPlec2;

	private JButton dalej;

	private int wygraneGracz1 = 0, wygraneGracz2 = 0;

	public Panel2(Pvp pvp, Postac postac1, Postac postac2) {
		this.pvp = pvp;
		this.postac1 = postac1;
		this.postac2 = postac2;

		setLayout(null);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));

		postac1Imie = new JLabel(postac1.getImie());
		postac2Imie = new JLabel(postac2.getImie());
		postac1Wygrane = new JLabel("wygrane " + String.valueOf(wygraneGracz1));
		postac2Wygrane = new JLabel("wygrane " + String.valueOf(wygraneGracz2));

		dalej = new Dalej();
		dalej.setBounds(150, 350, 100, 20);
		add(dalej);

		postac1Wygrane.setBounds(150, 20, 130, 20);
		add(postac1Wygrane);

		postac1Imie.setBounds(20, 20, 130, 20);
		add(postac1Imie);

		postac2Wygrane.setBounds(150, 100, 130, 20);
		add(postac2Wygrane);

		postac2Imie.setBounds(20, 100, 130, 20);
		add(postac2Imie);
	}

	class Dalej extends JButton implements ActionListener {

		Dalej() {
			super("Walczcie");

			addActionListener(this);
		}

		public void actionPerformed(ActionEvent e) {
			new SterowanieWalka(pvp, postac1, postac2);

		}
	}

}
