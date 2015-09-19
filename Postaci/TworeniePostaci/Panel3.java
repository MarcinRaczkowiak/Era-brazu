package TworeniePostaci;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Pvp.Pvp;
import WyzwanieSolo.OknoWyzwania;

public class Panel3 extends JPanel {

	public static final int HEIGHT = 410;
	public static final int WIDTH = 410;
	private JButton anulujButton;
	private JButton grajButton;
	private JButton zapiszButton;

	private JPanel Panel1;

	private JFrame menyStart;
	private JFrame tworzeniePostaci;
	private String rodzajGry;

	public Panel3(JFrame menyStart, TworzeniePostaci tworzeniePostaci,
			String rodzajGry) {
		this.tworzeniePostaci = tworzeniePostaci;
		this.rodzajGry = rodzajGry;
		this.menyStart = menyStart;
		anulujButton = new AnulujButton();
		grajButton = new GrajButton();
		zapiszButton = new zapiszButton();

		Panel1 = this;
		setVisible(false);

		setPreferredSize(new Dimension(WIDTH, HEIGHT));

		anulujButton.setBounds(80, 350, 100, 20);
		grajButton.setBounds(200, 350, 100, 20);
		zapiszButton.setBounds(140, 200, 100, 20);

		add(anulujButton);
		add(zapiszButton);
		add(grajButton);

	}

	class AnulujButton extends JButton implements ActionListener {

		AnulujButton() {
			super("Anuluj");
			addActionListener(this);
		}

		public void actionPerformed(ActionEvent e) {
			tworzeniePostaci.setVisible(false);
			menyStart.setVisible(true);
		}
	}

	class GrajButton extends JButton implements ActionListener {

		GrajButton() {
			super("Graj");
			addActionListener(this);
		}

		public void actionPerformed(ActionEvent e) {
			((TworzeniePostaci) tworzeniePostaci).setVisible(false);
			// ((TworzeniePostaci) tworzeniePostaci).newBochater();

			if (rodzajGry.equals("WyzwanieSolo")) {
				OknoWyzwania wyzwanie = new OknoWyzwania(
						((TworzeniePostaci) tworzeniePostaci).newBochater());
			} else if (rodzajGry.equals("PVP")) {
				Pvp pvp = new Pvp(
						((TworzeniePostaci) tworzeniePostaci).newBochater());
			} else if (rodzajGry.equals("Gracz2")) {

				((Pvp) menyStart)
						.bochater2(((TworzeniePostaci) tworzeniePostaci)
								.newBochater());

				menyStart.setVisible(true);
			} else if (rodzajGry.equals("Gracz1")) {

				((Pvp) menyStart)
						.bochater1(((TworzeniePostaci) tworzeniePostaci)
								.newBochater());

				menyStart.setVisible(true);
			}

		}
	}

	class zapiszButton extends JButton implements ActionListener {

		zapiszButton() {
			super("Zapisz");
			addActionListener(this);
		}

		public void actionPerformed(ActionEvent e) {

			JFileChooser fc = new JFileChooser();
			if (fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
				File plik = fc.getSelectedFile();
				JOptionPane.showMessageDialog(null,
						"Wybrany plik to " + plik.getAbsolutePath());
				try {
					PrintWriter pw = new PrintWriter(plik);
					Scanner skaner = new Scanner(
							((TworzeniePostaci) tworzeniePostaci).Zapis());
					while (skaner.hasNext())
						pw.println(skaner.nextLine());
					pw.close();
					skaner.close();
				} catch (FileNotFoundException e1) {

					e1.printStackTrace();
				}
			}
		}
	}

}
