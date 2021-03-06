package TworeniePostaci;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel1 extends JPanel {

	public static final int HEIGHT = 410;
	public static final int WIDTH = 410;
	private JButton anulujButton;
	private JButton dalejButton;
	private JButton wczytajButton;

	private JLabel wsyep = new JLabel("Stworz postac");
	private JLabel podajImie = new JLabel("Imie postaci:");
	private JLabel wybierzPlec = new JLabel("Plec:");
	private JLabel wybierzKlase = new JLabel("Klasa postaci:");
	private JLabel bonus1 = new JLabel("Trenuj");
	private JLabel bonus2 = new JLabel("Trenuj");
	private JLabel bonus3 = new JLabel("Trenuj");
	private JLabel bonus4 = new JLabel("Trenuj");

	private JTextField wpisaneImie = new JTextField("kunegunda");
	private JComboBox<String> podajPlec = new JComboBox<String>();
	private JComboBox<String> podajKlase;
	private JComboBox<String> podajbonus1 = new JComboBox<String>();
	private JComboBox<String> podajbonus2 = new JComboBox<String>();
	private JComboBox<String> podajbonus3 = new JComboBox<String>();
	private JComboBox<String> podajbonus4 = new JComboBox<String>();

	private JPanel Panel1;

	private JFrame menyStart;
	private JFrame tworzeniePostaci;

	public Panel1(JFrame menyStart, TworzeniePostaci tworzeniePostaci) {
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

		podajPlec.addItem("Me�czyzna");
		podajPlec.addItem("Kobieta");
		podajPlec.addItem("Inna");

		podajbonus1.addItem("sila");
		podajbonus1.addItem("zwinnosc");
		podajbonus1.addItem("szybkosc");
		podajbonus1.addItem("wiedza naukowa");
		podajbonus2.addItem("znajomosc broni");
		podajbonus2.addItem("sily witalne");
		podajbonus2.addItem("wiedza codzienna");
		podajbonus2.addItem("wiedza budowlana");

		podajbonus3.addItem("sila");
		podajbonus4.addItem("zwinnosc");
		podajbonus3.addItem("szybkosc");
		podajbonus4.addItem("wiedza naukowa");
		podajbonus3.addItem("znajomosc broni");
		podajbonus4.addItem("sily witalne");
		podajbonus3.addItem("wiedza codzienna");
		podajbonus4.addItem("wiedza budowlana");

		podajKlase = new JComboBox<String>();
		podajKlase.addItem("Zbrojny");
		podajKlase.addItem("Lotr");
		podajKlase.addItem("Pikinier");
		podajKlase.addItem("Medyk");
		podajKlase.addItem("Metalurg");
		podajKlase.addItem("Gigant");
		podajKlase.addItem("Rolnik");
		podajKlase.addItem("Budowniczy");

		wpisaneImie.setBounds(185, 40, 130, 20);
		add(wpisaneImie);
		podajPlec.setBounds(185, 80, 130, 20);
		add(podajPlec);
		podajKlase.setBounds(185, 120, 130, 20);
		add(podajKlase);
		podajbonus1.setBounds(185, 160, 130, 20);
		add(podajbonus1);
		podajbonus2.setBounds(185, 200, 130, 20);
		add(podajbonus2);
		podajbonus3.setBounds(185, 240, 130, 20);
		add(podajbonus3);
		podajbonus4.setBounds(185, 280, 130, 20);
		add(podajbonus4);

		anulujButton = new AnulujButton();
		dalejButton = new DalejButton();
		wczytajButton = new WczytajButton();

		Panel1 = this;
		setVisible(true);
		setLayout(null);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		anulujButton.setBounds(40, 350, 100, 20);
		wczytajButton.setBounds(145, 350, 120, 20);
		dalejButton.setBounds(270, 350, 100, 20);
		add(anulujButton);
		add(wczytajButton);
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

	class WczytajButton extends JButton implements ActionListener {

		WczytajButton() {
			super("Wczytaj i graj");
			addActionListener(this);
		}

		public void actionPerformed(ActionEvent e) {
			JFileChooser fc = new JFileChooser();
			if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				File plik = fc.getSelectedFile();

				try {
					String to = "";
					Scanner skaner = new Scanner(plik);
					System.out.println("start");
					int wowoowowa = 0;
					while (skaner.hasNext()) { // dziaa zawsze tylko 1 zapis
						// to = to + (skaner.nextLine() + "\n");

						wowoowowa++;
						// System.out.println(skaner.nextLine() + wowoowowa);
						((TworzeniePostaci) tworzeniePostaci).Odczyt(wowoowowa,
								skaner.nextLine());
					}
					System.out.println("stop");
					skaner.close();
					JOptionPane.showMessageDialog(null,
							to + plik.getAbsolutePath());
				} catch (FileNotFoundException e1) {

					e1.printStackTrace();
				}
				((TworzeniePostaci) tworzeniePostaci).panel1do3();
			}

		}

	}

	class DalejButton extends JButton implements ActionListener {

		DalejButton() {
			super("Dalej");
			addActionListener(this);
		}

		public void actionPerformed(ActionEvent e) {

			((TworzeniePostaci) tworzeniePostaci).nadajImie(wpisaneImie
					.getText());
			String color = podajPlec.getSelectedItem().toString();
			if (color.equals("Me�czyzna")) {
				((TworzeniePostaci) tworzeniePostaci).wybierzPlec(true);
			} else {
				((TworzeniePostaci) tworzeniePostaci).wybierzPlec(false);
			}
			color = podajKlase.getSelectedItem().toString();
			if (color.equals("Zbrojny")) {
				((TworzeniePostaci) tworzeniePostaci).wybierzKlase(1);
			} else if (color.equals("Lotr")) {
				((TworzeniePostaci) tworzeniePostaci).wybierzKlase(2);
			} else if (color.equals("Pikinier")) {
				((TworzeniePostaci) tworzeniePostaci).wybierzKlase(3);
			} else if (color.equals("Medyk")) {
				((TworzeniePostaci) tworzeniePostaci).wybierzKlase(4);
			} else if (color.equals("Metalurg")) {
				((TworzeniePostaci) tworzeniePostaci).wybierzKlase(5);
			} else if (color.equals("Gigant")) {
				((TworzeniePostaci) tworzeniePostaci).wybierzKlase(6);
			} else if (color.equals("Rolnik")) {
				((TworzeniePostaci) tworzeniePostaci).wybierzKlase(7);
			} else {
				((TworzeniePostaci) tworzeniePostaci).wybierzKlase(8);
			}
			color = podajbonus1.getSelectedItem().toString();
			if (color.equals("sila")) {
				((TworzeniePostaci) tworzeniePostaci)
						.setSila(((TworzeniePostaci) tworzeniePostaci)
								.getSila() + 5);
			} else if (color.equals("zwinnosc")) {
				((TworzeniePostaci) tworzeniePostaci)
						.setZwinnosc(((TworzeniePostaci) tworzeniePostaci)
								.getZwinnosc() + 5);
			} else if (color.equals("szybkosc")) {
				((TworzeniePostaci) tworzeniePostaci)
						.setSzybkosc(((TworzeniePostaci) tworzeniePostaci)
								.getSzybkosc() + 5);
			} else {
				((TworzeniePostaci) tworzeniePostaci)
						.setWiedzaNaukowa(((TworzeniePostaci) tworzeniePostaci)
								.getWiedzaNaukowa() + 5);
			}
			color = podajbonus2.getSelectedItem().toString();
			if (color.equals("znajomosc broni")) {
				((TworzeniePostaci) tworzeniePostaci)
						.setZnajomoscBroni(((TworzeniePostaci) tworzeniePostaci)
								.getZnajomoscBroni() + 5);
			} else if (color.equals("sily witalne")) {
				((TworzeniePostaci) tworzeniePostaci)
						.setSilyWitalne(((TworzeniePostaci) tworzeniePostaci)
								.getSilyWitalne() + 5);
			} else if (color.equals("wiedza codzienna")) {
				((TworzeniePostaci) tworzeniePostaci)
						.setWiedzaCodzienna(((TworzeniePostaci) tworzeniePostaci)
								.getWiedzaCodzienna() + 5);
			} else {
				((TworzeniePostaci) tworzeniePostaci)
						.setWiedzaBudowlana(((TworzeniePostaci) tworzeniePostaci)
								.getWiedzaBudowlana() + 5);
			}
			color = podajbonus3.getSelectedItem().toString();
			if (color.equals("sila")) {
				((TworzeniePostaci) tworzeniePostaci)
						.setSila(((TworzeniePostaci) tworzeniePostaci)
								.getSila() + 5);
			} else if (color.equals("szybkosc")) {
				((TworzeniePostaci) tworzeniePostaci)
						.setSzybkosc(((TworzeniePostaci) tworzeniePostaci)
								.getSzybkosc() + 5);
			} else if (color.equals("znajomosc broni")) {
				((TworzeniePostaci) tworzeniePostaci)
						.setZnajomoscBroni(((TworzeniePostaci) tworzeniePostaci)
								.getZnajomoscBroni() + 5);
			} else {
				((TworzeniePostaci) tworzeniePostaci)
						.setWiedzaCodzienna(((TworzeniePostaci) tworzeniePostaci)
								.getWiedzaCodzienna() + 5);
			}
			color = podajbonus4.getSelectedItem().toString();
			if (color.equals("zwinnosc")) {
				((TworzeniePostaci) tworzeniePostaci)
						.setZwinnosc(((TworzeniePostaci) tworzeniePostaci)
								.getZwinnosc() + 5);
			} else if (color.equals("wiedza naukowa")) {
				((TworzeniePostaci) tworzeniePostaci)
						.setWiedzaNaukowa(((TworzeniePostaci) tworzeniePostaci)
								.getWiedzaNaukowa() + 5);
			} else if (color.equals("sily witalne")) {
				((TworzeniePostaci) tworzeniePostaci)
						.setSilyWitalne(((TworzeniePostaci) tworzeniePostaci)
								.getSilyWitalne() + 5);
			} else {
				((TworzeniePostaci) tworzeniePostaci)
						.setWiedzaBudowlana(((TworzeniePostaci) tworzeniePostaci)
								.getWiedzaBudowlana() + 5);
			}

			// dodatek sta�y dla postaci

			((TworzeniePostaci) tworzeniePostaci)
					.setSilaCiosu(((TworzeniePostaci) tworzeniePostaci)
							.getSilaCiosu() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setTerzyznaFizyczna(((TworzeniePostaci) tworzeniePostaci)
							.getTerzyznaFizyczna() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setGurnik(((TworzeniePostaci) tworzeniePostaci)
							.getGurnik() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setCelnosc(((TworzeniePostaci) tworzeniePostaci)
							.getCelnosc() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setUnik(((TworzeniePostaci) tworzeniePostaci).getUnik() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setSkradanie(((TworzeniePostaci) tworzeniePostaci)
							.getSkradanie() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setSzybkoscCiosu(((TworzeniePostaci) tworzeniePostaci)
							.getSzybkoscCiosu() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setSzybkoscObrony(((TworzeniePostaci) tworzeniePostaci)
							.getSzybkoscObrony() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setInicjatywa(((TworzeniePostaci) tworzeniePostaci)
							.getInicjatywa() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setAnatomia(((TworzeniePostaci) tworzeniePostaci)
							.getAnatomia() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setTraper(((TworzeniePostaci) tworzeniePostaci)
							.getTraper() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setZielarz(((TworzeniePostaci) tworzeniePostaci)
							.getZielarz() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setRozbrojenie(((TworzeniePostaci) tworzeniePostaci)
							.getRozbrojenie() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setZbrojmistsz(((TworzeniePostaci) tworzeniePostaci)
							.getZbrojmistsz() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setPlatnerz(((TworzeniePostaci) tworzeniePostaci)
							.getPlatnerz() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setZdrowie(((TworzeniePostaci) tworzeniePostaci)
							.getZdrowie() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setKondycja(((TworzeniePostaci) tworzeniePostaci)
							.getKondycja() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setPojemnoscZoladka(((TworzeniePostaci) tworzeniePostaci)
							.getPojemnoscZoladka() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setGotowanie(((TworzeniePostaci) tworzeniePostaci)
							.getGotowanie() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setWetkarstwo(((TworzeniePostaci) tworzeniePostaci)
							.getWetkarstwo() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setWiedzaCodzienna(((TworzeniePostaci) tworzeniePostaci)
							.getWiedzaCodzienna() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setMaszynyOblerznicze(((TworzeniePostaci) tworzeniePostaci)
							.getMaszynyOblerznicze() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setBudynkoObronne(((TworzeniePostaci) tworzeniePostaci)
							.getBudynkoObronne() + 2);

			((TworzeniePostaci) tworzeniePostaci)
					.setBudynkiSocjalne(((TworzeniePostaci) tworzeniePostaci)
							.getBudynkiSocjalne() + 2);

			// podstawowe

			((TworzeniePostaci) tworzeniePostaci)
					.setSila(((TworzeniePostaci) tworzeniePostaci).getSila() + 4);

			((TworzeniePostaci) tworzeniePostaci)
					.setZwinnosc(((TworzeniePostaci) tworzeniePostaci)
							.getZwinnosc() + 4);

			((TworzeniePostaci) tworzeniePostaci)
					.setSzybkosc(((TworzeniePostaci) tworzeniePostaci)
							.getSzybkosc() + 4);

			((TworzeniePostaci) tworzeniePostaci)
					.setWiedzaNaukowa(((TworzeniePostaci) tworzeniePostaci)
							.getWiedzaNaukowa() + 4);

			((TworzeniePostaci) tworzeniePostaci)
					.setZnajomoscBroni(((TworzeniePostaci) tworzeniePostaci)
							.getZnajomoscBroni() + 4);

			((TworzeniePostaci) tworzeniePostaci)
					.setSilyWitalne(((TworzeniePostaci) tworzeniePostaci)
							.getSilyWitalne() + 4);

			((TworzeniePostaci) tworzeniePostaci)
					.setZiemiarz(((TworzeniePostaci) tworzeniePostaci)
							.getZiemiarz() + 4);

			((TworzeniePostaci) tworzeniePostaci)
					.setWiedzaBudowlana(((TworzeniePostaci) tworzeniePostaci)
							.getWiedzaBudowlana() + 4);

			((TworzeniePostaci) tworzeniePostaci).panel2();
		}
	}

}
