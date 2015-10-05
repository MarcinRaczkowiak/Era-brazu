package Pvp;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import PanelWalki.OknoWalki;
import PanelWalki.PanelAtaku;
import Postac.Postac;
import TworeniePostaci.TworzeniePostaci;

public class Panel1 extends JPanel {

	public static final int HEIGHT = 410;
	public static final int WIDTH = 410;
	private JButton ZmienGracza1;
	private JButton ZmienGracza2;
	private JButton walczButton;

	private JLabel bochater;
	private JLabel podajImie = new JLabel("Imie postaci:");
	private JLabel wybierzPlec = new JLabel("Imie przeciwnika:");
	private JLabel przeciwnik = new JLabel("Przeciwnik");

	private JPanel Panel1;

	private JFrame pvp;
	private Postac postac2;
	private Postac postac1;

	public Panel1(Pvp pvp, Postac postac) {
		this.pvp = pvp;
		this.postac1 = postac;

		ZmienGracza2 = new ZmienGracza2();
		ZmienGracza1 = new ZmienGracza1();
		walczButton = new WalczButton();
		bochater = new JLabel(postac.getImie());

		bochater.setBounds(240, 40, 130, 20);
		add(bochater);
		podajImie.setBounds(80, 40, 130, 20);
		add(podajImie);
		wybierzPlec.setBounds(80, 80, 130, 20);
		add(wybierzPlec);
		przeciwnik.setBounds(240, 80, 130, 20);
		add(przeciwnik);

		Panel1 = this;

		String rodzajGry = "Gracz2";
		new TworzeniePostaci(pvp, rodzajGry);
		pvp.setVisible(false);
		//
		setVisible(true);
		setLayout(null);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		ZmienGracza2.setBounds(10, 120, 200, 20);
		ZmienGracza1.setBounds(10, 10, 200, 20);

		walczButton.setBounds(150, 290, 150, 20);
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
		przeciwnik.setText(postac1.getImie());
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
			postac1.StartPostaci();
			postac2.StartPostaci();
			PanelAtaku walkaGracz = new PanelAtaku(postac1, postac2, pvp);
			PanelAtaku walkaGracz2 = new PanelAtaku(postac2, postac1, pvp);
			OknoWalki oknoWalki = new OknoWalki();
			oknoWalki.setVisible(true);
			walkaGracz.setVisible(true);
			walkaGracz2.setVisible(true);
			pvp.setVisible(false);
			// ((Pvp) pvp).panel2();

		}
	}

}
