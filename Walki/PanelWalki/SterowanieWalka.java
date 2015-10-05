package PanelWalki;

import javax.swing.JFrame;

import Postac.Postac;

public class SterowanieWalka {
	JFrame oknoStartowe;
	Postac postac1, postac2;

	public SterowanieWalka() {

	}

	public SterowanieWalka(JFrame oknoStartowe, Postac postac1, Postac postac2) {

		this.oknoStartowe = oknoStartowe;
		this.postac1 = postac1;
		this.postac2 = postac2;
		Pvp();
	}

	public SterowanieWalka(Postac postac1, Postac bot, JFrame oknoStartowe) {

		this.oknoStartowe = oknoStartowe;
		this.postac1 = postac1;
		postac2 = bot;
		WalkaZBotem();
	}

	public void WalkaZBotem() {
		PanelAtaku walkaGracz = new PanelAtaku(postac1, postac2, oknoStartowe);
		OknoWalki oknoWalki = new OknoWalki();
		oknoWalki.setVisible(true);
		walkaGracz.setVisible(true);
		oknoStartowe.setVisible(false);
		// ((OknoWyzwania) oknoStartowe).panel2();

		// wiele bledów do poprawki
	}

	public void Pvp() {
		postac1.StartPostaci();
		postac2.StartPostaci();
		PanelAtaku walkaGracz = new PanelAtaku(postac1, postac2, oknoStartowe);
		PanelAtaku walkaGracz2 = new PanelAtaku(postac2, postac1, oknoStartowe);
		OknoWalki oknoWalki = new OknoWalki();
		oknoWalki.setVisible(true);
		walkaGracz.setVisible(true);
		walkaGracz2.setVisible(true);
		oknoStartowe.setVisible(false);
	}
}
