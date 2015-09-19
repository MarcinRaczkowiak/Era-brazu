package Bron;

public class BronBaza {

	int waga;
	int dlugosc;
	int ostrosc;
	int zadzior;
	int obuch;
	int szpikulec;

	@Override
	public String toString() {
		return "Bron [waga=" + waga + ", dlugosc=" + dlugosc + ", ostrosc="
				+ ostrosc + ", zadzior=" + zadzior + ", obuch=" + obuch
				+ ", szpikulec=" + szpikulec + "]";
	}

	public BronBaza(int waga, int dlugosc, int ostrosc, int zadzior, int obuch,
			int szpikulec) {
		super();
		this.waga = waga;
		this.dlugosc = dlugosc;
		this.ostrosc = ostrosc;
		this.zadzior = zadzior;
		this.obuch = obuch;
		this.szpikulec = szpikulec;
	}

	public synchronized int getObuch() {
		return obuch;
	}

	public synchronized void setObuch(int obuch) {
		this.obuch = obuch;
	}

	public synchronized int getSzpikulec() {
		return szpikulec;
	}

	public synchronized void setSzpikulec(int szpikulec) {
		this.szpikulec = szpikulec;
	}

	public synchronized int getWaga() {
		return waga;
	}

	public synchronized void setWaga(int waga) {
		this.waga = waga;
	}

	public synchronized int getDlugosc() {
		return dlugosc;
	}

	public synchronized void setDlugosc(int dlugosc) {
		this.dlugosc = dlugosc;
	}

	public synchronized int getOstrosc() {
		return ostrosc;
	}

	public synchronized void setOstrosc(int ostrosc) {
		this.ostrosc = ostrosc;
	}

	public synchronized int getZadzior() {
		return zadzior;
	}

	public synchronized void setZadzior(int zadzior) {
		this.zadzior = zadzior;
	}

}
