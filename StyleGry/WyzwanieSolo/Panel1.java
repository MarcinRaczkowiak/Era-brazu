package WyzwanieSolo;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import PanelWalki.SterowanieWalka;
import Postac.Postac;

public class Panel1 extends JPanel {

	public static final int HEIGHT = 410;
	public static final int WIDTH = 410;
	private JButton ZarzadzaniePostaciaButton;
	private JButton walczButton;

	private JLabel bochater;
	private JLabel podajImie = new JLabel("Imie postaci:");
	private JLabel wybierzPlec = new JLabel("Imie przeciwnika:");
	private JLabel przeciwnik = new JLabel("Przeciwnik");

	private JPanel Panel1;

	private JFrame oknoWyzwania;
	private Postac bot;
	private Postac postacBochater;

	public Panel1(OknoWyzwania oknoWyzwania, Postac postacBochater) {
		this.oknoWyzwania = oknoWyzwania;
		this.postacBochater = postacBochater;

		int bottt = 3;
		String Zbroja = "";
		bot = new Postac("Emeryt", true, true, bottt, bottt, bottt, bottt,
				bottt, bottt, bottt, bottt, bottt, bottt, bottt, bottt, bottt,
				bottt, bottt, bottt, bottt, bottt, bottt, bottt, bottt, bottt,
				bottt, bottt, bottt, bottt, bottt, bottt, bottt, bottt, bottt,
				bottt, bottt, bottt, bottt, bottt, Zbroja, Zbroja, Zbroja,
				Zbroja, Zbroja, Zbroja, Zbroja);

		ZarzadzaniePostaciaButton = new ZarzadzajPostaciaButton();
		walczButton = new WalczButton();
		bochater = new JLabel(postacBochater.getImie());

		bochater.setBounds(240, 40, 130, 20);
		add(bochater);
		podajImie.setBounds(80, 40, 130, 20);
		add(podajImie);
		wybierzPlec.setBounds(80, 80, 130, 20);
		add(wybierzPlec);
		przeciwnik.setBounds(240, 80, 130, 20);
		add(przeciwnik);

		Panel1 = this;
		setVisible(true);
		setLayout(null);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		ZarzadzaniePostaciaButton.setBounds(40, 350, 200, 20);

		walczButton.setBounds(270, 350, 100, 20);
		add(ZarzadzaniePostaciaButton);

		add(walczButton);
		postacBochater.StartPostaci();
		bot.StartPostaci();

	}

	class ZarzadzajPostaciaButton extends JButton implements ActionListener {

		ZarzadzajPostaciaButton() {
			super("Zarz¹dzanie Bochaterem");
			addActionListener(this);
		}

		public void actionPerformed(ActionEvent e) {
			// oknoWyzwania.setVisible(false);
			// menyStart.setVisible(true);
		}
	}

	class WalczButton extends JButton implements ActionListener {

		WalczButton() {
			super("Walcz");
			addActionListener(this);
		}

		public void actionPerformed(ActionEvent e) {

			new SterowanieWalka(postacBochater, bot, oknoWyzwania);

			/*
			 * PanelAtaku walkaGracz = new PanelAtaku(postacBochater, bot,
			 * oknoWyzwania); OknoWalki oknoWalki = new OknoWalki();
			 * oknoWalki.setVisible(true); walkaGracz.setVisible(true);
			 * oknoWyzwania.setVisible(false); ((OknoWyzwania)
			 * oknoWyzwania).panel2();
			 */

		}
	}
}
