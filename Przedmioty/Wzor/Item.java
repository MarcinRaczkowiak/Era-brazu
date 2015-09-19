package Wzor;

public class Item {
	int waga;
	int wygoda;
	int zaczepy;
	int hpPrzedmiotu;
	int odpornoscNaCiecie;
	int odpornoscNaKucie;
	int odpornoscNaObuch;

	public Item(int waga, int wygoda, int zaczepy, int hpPrzedmiotu,
			int odpornoscNaCiecie, int odpornoscNaKucie, int odpornoscNaObuch) {
		super();
		this.waga = waga;
		this.wygoda = wygoda;
		this.zaczepy = zaczepy;
		this.hpPrzedmiotu = hpPrzedmiotu;
		this.odpornoscNaCiecie = odpornoscNaCiecie;
		this.odpornoscNaKucie = odpornoscNaKucie;
		this.odpornoscNaObuch = odpornoscNaObuch;
	}

	public String toString() {
		return "Item [waga=" + waga + ", wygoda=" + wygoda + ", zaczepy="
				+ zaczepy + ", hpPrzedmiotu=" + hpPrzedmiotu
				+ ", odpornoscNaCiecie=" + odpornoscNaCiecie
				+ ", odpornoscNaKucie=" + odpornoscNaKucie
				+ ", odpornoscNaObuch=" + odpornoscNaObuch + "]";
	}

	public synchronized int getWaga() {
		return waga;
	}

	public synchronized void setWaga(int waga) {
		this.waga = waga;
	}

	public synchronized int getWygoda() {
		return wygoda;
	}

	public synchronized void setWygoda(int wygoda) {
		this.wygoda = wygoda;
	}

	public synchronized int getZaczepy() {
		return zaczepy;
	}

	public synchronized void setZaczepy(int zaczepy) {
		this.zaczepy = zaczepy;
	}

	public synchronized int getHpPrzedmiotu() {
		return hpPrzedmiotu;
	}

	public synchronized void setHpPrzedmiotu(int hpPrzedmiotu) {
		this.hpPrzedmiotu = hpPrzedmiotu;
	}

	public synchronized int getOdpornoscNaCiecie() {
		return odpornoscNaCiecie;
	}

	public synchronized void setOdpornoscNaCiecie(int odpornoscNaCiecie) {
		this.odpornoscNaCiecie = odpornoscNaCiecie;
	}

	public synchronized int getOdpornoscNaKucie() {
		return odpornoscNaKucie;
	}

	public synchronized void setOdpornoscNaKucie(int odpornoscNaKucie) {
		this.odpornoscNaKucie = odpornoscNaKucie;
	}

	public synchronized int getOdpornoscNaObuch() {
		return odpornoscNaObuch;
	}

	public synchronized void setOdpornoscNaObuch(int odpornoscNaObuch) {
		this.odpornoscNaObuch = odpornoscNaObuch;
	}

}
