package PrzedmiotyPostaci;

import Bron.BronBaza;
import Wzor.Item;

public class ZbrojaBron {
	private BronBaza bron;
	private Item zbroja;
	private Item obuwie;
	private Item spodnie;
	private Item rekawice;
	private Item czapka;

	public ZbrojaBron(BronBaza bron, Item zbroja, Item obuwie, Item spodnie,
			Item rekawice, Item czapka) {
		super();
		this.bron = bron;
		this.zbroja = zbroja;
		this.obuwie = obuwie;
		this.spodnie = spodnie;
		this.rekawice = rekawice;
		this.czapka = czapka;
	}

	public int getWygodaUzbrojenia() {
		int wygodaUzbrojenia = zbroja.getWygoda() + obuwie.getWygoda()
				+ spodnie.getWygoda() + rekawice.getWygoda()
				+ czapka.getWygoda();

		return wygodaUzbrojenia;
	}

	public int getWagaUzbrojenia() {
		int wagaCalkowita = zbroja.getWaga() + obuwie.getWaga()
				+ spodnie.getWaga() + rekawice.getWaga() + czapka.getWaga()
				+ bron.getWaga();

		return wagaCalkowita;
	}

	public int getDlugoscBroni() {
		int DlugoscBroni = bron.getDlugosc();

		return DlugoscBroni;
	}

	public int getWagaBroni() {
		int wagaBroni = bron.getWaga();

		return wagaBroni;
	}

	public synchronized BronBaza getBron() {
		return bron;
	}

	public synchronized void setBron(BronBaza bron) {
		this.bron = bron;
	}

	public synchronized Item getZbroja() {
		return zbroja;
	}

	public synchronized void setZbroja(Item zbroja) {
		this.zbroja = zbroja;
	}

	public synchronized Item getObuwie() {
		return obuwie;
	}

	public synchronized void setObuwie(Item obuwie) {
		this.obuwie = obuwie;
	}

	public synchronized Item getSpodnie() {
		return spodnie;
	}

	public synchronized void setSpodnie(Item spodnie) {
		this.spodnie = spodnie;
	}

	public synchronized Item getRekawice() {
		return rekawice;
	}

	public synchronized void setRekawice(Item rekawice) {
		this.rekawice = rekawice;
	}

	public synchronized Item getCzapka() {
		return czapka;
	}

	public synchronized void setCzapka(Item czapka) {
		this.czapka = czapka;
	}

	public Item getItem(String i) {
		if (i.equals("zbroja")) {
			return zbroja;
		} else if (i.equals("obuwie")) {
			return obuwie;
		} else if (i.equals("spodnie")) {
			return spodnie;
		} else if (i.equals("rekawice")) {
			return rekawice;
		} else if (i.equals("czapka")) {
			return czapka;
		} else {
			return null;
		}
	}

}
