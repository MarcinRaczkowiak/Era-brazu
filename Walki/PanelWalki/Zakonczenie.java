package PanelWalki;

import java.util.Scanner;

public class Zakonczenie {
	SterowanieWalka to;

	public Zakonczenie(SterowanieWalka to) {
		super();
		this.to = to;
	}

	public void zatrzymany() throws InterruptedException {
		synchronized (this) {
			System.out.println("Producent pracuje");
			to.WalkaZBotem();
			wait();
			System.out.println("Ponawia");
		}
	}

	public void ponawiajacy() throws InterruptedException {
		Scanner scaner = new Scanner(System.in);

		synchronized (this) {
			System.out.println("Czeka na klucz");
			scaner.nextLine();
			System.out.println("³ap klucz");
			notify();
		}
	}
}
