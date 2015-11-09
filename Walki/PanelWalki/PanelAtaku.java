package PanelWalki;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Postac.Postac;
import WalkaWParze.WalkaWParze;

public class PanelAtaku extends JFrame implements ActionListener {

	private Postac bot;
	private Postac postacBochater;
	private JLabel jlRodzajAtaku = new JLabel("Rodzaj ataku:");
	private JLabel jlCelAtaku = new JLabel("Cel ataku:");
	private JLabel imie;
	private JLabel hp = new JLabel("HP: ");
	private JLabel iloscHp;
	private JButton atak;
	private JComboBox<String> wybierzRodzajAtaku;
	private JComboBox<String> wybierzCelAtaku;
	private WalkaWParze walka;
	private WalkaWParze walkaBot;
	private JFrame gra;
	private SterowanieWalka sterowanieWalka;

	public PanelAtaku(Postac postacBochater, Postac bot, JFrame gra,
			SterowanieWalka sterowanieWalka) {
		this.postacBochater = postacBochater;
		this.bot = bot;
		this.gra = gra;
		this.sterowanieWalka = sterowanieWalka;
		walka = new WalkaWParze(postacBochater, bot);
		if (bot.getBot()) {
			walkaBot = new WalkaWParze(bot, postacBochater);
		}

		setTitle("Panel " + postacBochater.getImie());
		setVisible(false);
		setSize(410, 410);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(20, 20, 410, 410);

		imie = new JLabel(postacBochater.getImie());
		iloscHp = new JLabel(String.valueOf(postacBochater.getHp()));
		imie.setBounds(180, 1, 100, 10);
		hp.setBounds(200, 150, 50, 10);
		iloscHp.setBounds(250, 150, 50, 10);

		jlCelAtaku.setBounds(10, 190, 100, 20);
		add(jlCelAtaku);
		jlRodzajAtaku.setBounds(10, 130, 100, 20);
		add(jlRodzajAtaku);
		wybierzRodzajAtaku = new JComboBox<String>();
		wybierzRodzajAtaku.setBounds(10, 160, 100, 20);
		wybierzRodzajAtaku.addItem("Ciecie");
		wybierzRodzajAtaku.addItem("Pchniecie");
		wybierzRodzajAtaku.addItem("Walniecie");
		add(wybierzRodzajAtaku);

		wybierzCelAtaku = new JComboBox<String>();
		wybierzCelAtaku.setBounds(10, 220, 100, 20);
		wybierzCelAtaku.addItem("Losowo");
		wybierzCelAtaku.addItem("G³owa");
		wybierzCelAtaku.addItem("Tors");
		wybierzCelAtaku.addItem("Nogi");
		wybierzCelAtaku.addItem("Rêce");
		wybierzCelAtaku.addItem("Stopy");
		add(wybierzCelAtaku);

		atak = new JButton("Walcz");
		atak.setBounds(10, 100, 100, 20);
		atak.addActionListener(this);
		add(atak);
		add(imie);
		add(iloscHp);
		add(hp);
	}

	public void Guzik(boolean aktywnoscGuzika) {
		atak.setEnabled(aktywnoscGuzika);
	}

	public void actionPerformed(ActionEvent arg0) {

		sterowanieWalka.Atakuj¹cy1();
		String rodzajAtaku = wybierzRodzajAtaku.getSelectedItem().toString();
		String celAtaku = wybierzCelAtaku.getSelectedItem().toString();
		walka.Atak(rodzajAtaku, celAtaku);
		iloscHp.setText(String.valueOf(postacBochater.getHp()));
		if (bot.getBot()) {
			walkaBot.Atak(rodzajAtaku, celAtaku);
		}

		// if (postacBochater.getHp() <= 0) {
		// setVisible(false);
		// gra.setVisible(true);
		// OknoWalki.setDefaultLookAndFeelDecorated(false);
		// }
		// if (bot.getHp() <= 0) {
		// setVisible(false);
		// OknoWalki.setDefaultLookAndFeelDecorated(false);
		// gra.setVisible(true);
		// }
	}
}
