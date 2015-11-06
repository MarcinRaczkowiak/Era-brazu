package PanelWalki;

import java.util.Random;

import javax.swing.JFrame;

import Postac.Postac;
import Pvp.Pvp;

public class SterowanieWalka {
	JFrame oknoStartowe;
	Postac postac1, postac2;
	String color; // tymczasowe rozwiazanie !!!!!!!!!!!!!!!!!!!
	PanelAtaku walkaGracz;
	PanelAtaku walkaGracz2;

	public SterowanieWalka() {

	}

	/**
	 * 2 graczy przeciwko sobie
	 * 
	 * @param oknoStartowe
	 * @param postac1
	 * @param postac2
	 */
	public SterowanieWalka(JFrame oknoStartowe, Postac postac1, Postac postac2,
			String color) {

		this.oknoStartowe = oknoStartowe;
		this.postac1 = postac1;
		this.postac2 = postac2;
		this.color = color;
		Pvp();
	}

	/**
	 * Walka 1 gracza z botem
	 * 
	 * @param postac1
	 * @param bot
	 * @param oknoStartowe
	 */
	public SterowanieWalka(Postac postac, Postac bot, JFrame oknoStartowe) {

		this.oknoStartowe = oknoStartowe;
		postac1 = postac;
		postac2 = bot;
		WalkaZBotem();
	}

	public void WalkaZBotem() {

		final PanelAtaku walkaGracz = new PanelAtaku(postac1, postac2,
				oknoStartowe, this);
		final OknoWalki oknoWalki = new OknoWalki();

		walkaGracz.setVisible(true);
		oknoStartowe.setVisible(false);

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				while (postac1.getHp() > 0 && postac2.getHp() > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				oknoWalki.setVisible(false);
				walkaGracz.setVisible(false);
				oknoStartowe.setVisible(true);
			}
		});

		t2.start();

	}

	public void ZakonczWalkaZBotem() {
		System.out.println("sukces");
		OknoWalki.setDefaultLookAndFeelDecorated(false);
	}

	public void Pvp() {
		postac1.StartPostaci();
		postac2.StartPostaci();
		final PanelAtaku walkaGracz = new PanelAtaku(postac1, postac2,
				oknoStartowe, this);
		final PanelAtaku walkaGracz2 = new PanelAtaku(postac2, postac1,
				oknoStartowe, this);
		final OknoWalki oknoWalki = new OknoWalki();

		StartWalki(walkaGracz, walkaGracz2);

		oknoWalki.setVisible(true);
		walkaGracz.setVisible(true);
		walkaGracz2.setBounds(800, 20, 410, 410);
		walkaGracz2.setVisible(true);
		oknoStartowe.setVisible(false);

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				while (postac1.getHp() > 0 && postac2.getHp() > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				oknoWalki.setVisible(false);
				walkaGracz.setVisible(false);
				walkaGracz2.setVisible(false);
				int zwyciesca;

				if (postac2.getHp() > 0) {
					zwyciesca = 2;

				} else {
					zwyciesca = 1;

				}
				if (Integer.parseInt(color) != 1) {
					if (postac2.getHp() > 0) {

						((Pvp) oknoStartowe).WygraneGracz2();
					} else {

						((Pvp) oknoStartowe).WygraneGracz1();
					}
				} else {
					((Pvp) oknoStartowe).WynikWalki(zwyciesca);
				}

				oknoStartowe.setVisible(true);

			}
		});

		t2.start();

	}

	public void StartWalki(PanelAtaku walkaGracz, PanelAtaku walkaGracz2) {
		this.walkaGracz = walkaGracz;
		this.walkaGracz2 = walkaGracz2;
		if (postac1.getInicjatywa() + postac1.getSzybkosc() < postac2
				.getInicjatywa() + postac2.getSzybkosc()) {
			walkaGracz.Guzik(false);
		} else {
			walkaGracz2.Guzik(false);
		}
	}

	public void Atakuj¹cy1() {

		Random SAtak = new Random();

		int pierwszy = SAtak.nextInt(postac1.getInicjatywa()
				+ postac1.getSzybkosc() + 10) + 1;
		int drugi = SAtak.nextInt(postac2.getInicjatywa()
				+ postac2.getSzybkosc() + 11) + 1;

		if (pierwszy < drugi) {
			walkaGracz.Guzik(false);
			walkaGracz2.Guzik(true);
		} else {
			walkaGracz2.Guzik(false);
			walkaGracz.Guzik(true);
		}

	}

	public void Atakuj¹cy2() {

	}

}
