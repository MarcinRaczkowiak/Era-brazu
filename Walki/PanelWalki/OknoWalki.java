package PanelWalki;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class OknoWalki extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 973209532967398093L;
	private static JTextArea tekst;
	private JButton czysc;
	private static String tekstWalkiNieZakoNczonej = "";

	public OknoWalki() {

		setTitle("Postêp w walce");
		setVisible(false);
		setSize(350, 690);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		tekst = new JTextArea("");

		JScrollPane jps = new JScrollPane(tekst);
		jps.setBounds(0, 0, 342, 600);
		add(jps);

		czysc = new JButton("Czyœæ");
		czysc.setBounds(120, 620, 100, 20);
		czysc.addActionListener(this);
		add(czysc);

	}

	/**
	 * Zakonczenie walki
	 */
	public static void ZakonczTekst() {

		String stary = tekst.getText() + tekstWalkiNieZakoNczonej + "\n\n";
		tekst.setText(stary);
		tekstWalkiNieZakoNczonej = "";
	}

	/**
	 * Informacje w oknienku podczas trfania walki po zakonczonej walce wykonaj
	 * ZakonczTekst()
	 */
	public static void DopiszTekstWalkiNiezakonczonej(String nowy) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();

		if (tekstWalkiNieZakoNczonej.equals("")) {
			tekstWalkiNieZakoNczonej = "\n" + dateFormat.format(date) + "\n";
		}

		tekstWalkiNieZakoNczonej = tekstWalkiNieZakoNczonej + "\n" + nowy;

	}

	public void actionPerformed(ActionEvent e) {
		Object z = e.getSource();
		if (z == czysc) {
			tekst.setText("");
		}

	}

}
