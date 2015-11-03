package PanelWalki;

import javax.swing.JFrame;

import Postac.Postac;
import Pvp.Pvp;

public class SterowanieWalka {
	JFrame oknoStartowe;
	Postac postac1, postac2;

	public SterowanieWalka() {

	}

	/**
	 * 2 graczy przeciwko sobie
	 * 
	 * @param oknoStartowe
	 * @param postac1
	 * @param postac2
	 */
	public SterowanieWalka(JFrame oknoStartowe, Postac postac1, Postac postac2) {

		this.oknoStartowe = oknoStartowe;
		this.postac1 = postac1;
		this.postac2 = postac2;
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
				oknoStartowe);
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
				oknoStartowe);
		final PanelAtaku walkaGracz2 = new PanelAtaku(postac2, postac1,
				oknoStartowe);
		final OknoWalki oknoWalki = new OknoWalki();
		oknoWalki.setVisible(true);
		walkaGracz.setVisible(true);
		walkaGracz2.setVisible(true);
		oknoStartowe.setVisible(false);

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				while (postac1.getHp() >= 0 && postac2.getHp() >= 0) {
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
				if (postac1.getHp() >= 0) {
					zwyciesca = 2;
				} else {
					zwyciesca = 1;
				}

				((Pvp) oknoStartowe).WynikWalki(zwyciesca);
				oknoStartowe.setVisible(true);

			}
		});

		t2.start();

	}
}
