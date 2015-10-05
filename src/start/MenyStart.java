package start;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import TworeniePostaci.TworzeniePostaci;

public class MenyStart extends JFrame implements ActionListener {

	private JButton pvp;
	private JButton pc;
	private JButton poradnik;
	private JButton wyjscie;
	private String rodzajGry = "";

	public MenyStart() {

		setTitle("Era Brazu");
		setVisible(true);
		setSize(410, 410);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(450, 170, 410, 410);

		wyjscie = new JButton("Wyjscie");
		wyjscie.setBounds(151, 300, 100, 20);
		wyjscie.addActionListener(this);
		add(wyjscie);

		poradnik = new JButton("Poradnik");
		poradnik.setBounds(151, 250, 100, 20);
		poradnik.addActionListener(this);
		add(poradnik);

		pvp = new JButton("PVP");
		pvp.setBounds(151, 150, 100, 20);
		pvp.addActionListener(this);
		add(pvp);

		pc = new JButton("WyzwanieSolo");
		pc.setBounds(142, 200, 118, 20);
		pc.addActionListener(this);
		add(pc);

	}

	public String getGra() {
		return rodzajGry;
	}

	public void actionPerformed(ActionEvent e) {
		Object z = e.getSource();
		if (z == pc) {
			rodzajGry = "WyzwanieSolo";
			setVisible(false);
			new TworzeniePostaci(this, rodzajGry);
		}
		if (z == pvp) {
			rodzajGry = "PVP";
			setVisible(false);
			new TworzeniePostaci(this, rodzajGry);
		}
		if (z == poradnik) {
			JOptionPane.showMessageDialog(null, "Poradnik w budownie",
					"Pilna wiadomoœæ", JOptionPane.INFORMATION_MESSAGE);
		}
		if (z == wyjscie) {
			System.exit(0);
		}

	}

}
