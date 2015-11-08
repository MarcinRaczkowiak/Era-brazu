package TworeniePostaci;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel2 extends JPanel {

	public static final int HEIGHT = 410;
	public static final int WIDTH = 410;
	private JButton anulujButton;
	private JButton dalejButton;

	private JLabel wsyep = new JLabel("Dobierz Itemy");
	private JLabel podajImie = new JLabel("Bron:");
	private JLabel wybierzPlec = new JLabel("Zbroja:");
	private JLabel wybierzKlase = new JLabel("Obuwie :");
	private JLabel bonus1 = new JLabel("Spownie");
	private JLabel bonus2 = new JLabel("Rekawice");
	private JLabel bonus3 = new JLabel("Czapka");
	private JLabel bonus4 = new JLabel("Zapas");

	private JComboBox<String> bron = new JComboBox<String>();
	private JComboBox<String> zbroja = new JComboBox<String>();
	private JComboBox<String> obuwie = new JComboBox<String>();
	private JComboBox<String> spodnie = new JComboBox<String>();
	private JComboBox<String> rekawice = new JComboBox<String>();
	private JComboBox<String> czapka = new JComboBox<String>();
	private JComboBox<String> zapas = new JComboBox<String>();

	private JPanel Panel1;

	private JFrame menyStart;
	private JFrame tworzeniePostaci;

	public Panel2(JFrame menyStart, TworzeniePostaci tworzeniePostaci) {
		this.tworzeniePostaci = tworzeniePostaci;
		this.menyStart = menyStart;

		wsyep.setBounds(100, 00, 130, 20);
		add(wsyep);
		podajImie.setBounds(80, 40, 130, 20);
		add(podajImie);
		wybierzPlec.setBounds(80, 80, 130, 20);
		add(wybierzPlec);
		wybierzKlase.setBounds(80, 120, 130, 20);
		add(wybierzKlase);
		bonus1.setBounds(80, 160, 130, 20);
		add(bonus1);
		bonus2.setBounds(80, 200, 130, 20);
		add(bonus2);
		bonus3.setBounds(80, 240, 130, 20);
		add(bonus3);
		bonus4.setBounds(80, 280, 130, 20);
		add(bonus4);

		bron.addItem("Luk");
		bron.addItem("Topur");
		bron.addItem("Miecz");
		bron.addItem("Dzida");
		bron.addItem("Mlotek");

		zbroja.addItem("Lniana");
		zbroja.addItem("Bawelniana");
		zbroja.addItem("Welniana");
		zbroja.addItem("Skórzane");

		obuwie.addItem("Boso");
		obuwie.addItem("Onuce");
		obuwie.addItem("Blaszane");
		obuwie.addItem("Skórzane");

		spodnie.addItem("Lniana");
		spodnie.addItem("Bawelniane");
		spodnie.addItem("Welniane");
		spodnie.addItem("Skórzane");

		rekawice.addItem("Lniana");
		rekawice.addItem("Bawelniane");
		rekawice.addItem("Welniane");
		rekawice.addItem("Skórzane");

		czapka.addItem("Garnek");
		czapka.addItem("Welniana");
		czapka.addItem("Skórzana");
		czapka.addItem("Bez");

		zapas.addItem("Miód");
		zapas.addItem("Wódka");
		zapas.addItem("Jab³ko");

		bron.setBounds(185, 40, 130, 20);
		add(bron);
		zbroja.setBounds(185, 80, 130, 20);
		add(zbroja);
		obuwie.setBounds(185, 120, 130, 20);
		add(obuwie);
		spodnie.setBounds(185, 160, 130, 20);
		add(spodnie);
		rekawice.setBounds(185, 200, 130, 20);
		add(rekawice);
		czapka.setBounds(185, 240, 130, 20);
		add(czapka);
		zapas.setBounds(185, 280, 130, 20);
		add(zapas);

		anulujButton = new AnulujButton();
		dalejButton = new DalejButton();

		Panel1 = this;
		setVisible(false);
		setLayout(null);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		anulujButton.setBounds(80, 350, 100, 20);
		dalejButton.setBounds(200, 350, 100, 20);
		add(anulujButton);
		add(dalejButton);

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

	class DalejButton extends JButton implements ActionListener {

		DalejButton() {
			super("Dalej1");
			addActionListener(this);
		}

		public void actionPerformed(ActionEvent e) {

			String color = bron.getSelectedItem().toString();
			((TworzeniePostaci) tworzeniePostaci).setBron(color);

			color = zbroja.getSelectedItem().toString();
			((TworzeniePostaci) tworzeniePostaci).setZbroja(color);

			color = obuwie.getSelectedItem().toString();
			((TworzeniePostaci) tworzeniePostaci).setObuwie(color);

			color = spodnie.getSelectedItem().toString();
			((TworzeniePostaci) tworzeniePostaci).setSpodnie(color);

			color = rekawice.getSelectedItem().toString();
			((TworzeniePostaci) tworzeniePostaci).setRekawice(color);

			color = czapka.getSelectedItem().toString();
			((TworzeniePostaci) tworzeniePostaci).setCzapka(color);

			color = zapas.getSelectedItem().toString();
			((TworzeniePostaci) tworzeniePostaci).setZapas(color);

			((TworzeniePostaci) tworzeniePostaci).panel3();
		}
	}

}
