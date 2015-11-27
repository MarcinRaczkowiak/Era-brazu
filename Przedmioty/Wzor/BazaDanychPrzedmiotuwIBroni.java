package Wzor;

import Bron.BronBaza;

public abstract class BazaDanychPrzedmiotuwIBroni {

	public BronBaza BronBazaDanych(String bron) {

		int waga = 0, dlugosc = 0, ostrosc = 0, zadzior = 0, obuch = 0, szpikulec = 0;
		if (bron.equals("Luk")) {
			waga = 50;
			dlugosc = 50;
			ostrosc = 100;
			zadzior = 0;
			obuch = 0;
			szpikulec = 100;
		} else if (bron.equals("Topur")) {
			waga = 200;
			dlugosc = 100;
			ostrosc = 200;
			zadzior = 0;
			obuch = 100;
			szpikulec = 0;
		} else if (bron.equals("Miecz")) {
			waga = 150;
			dlugosc = 150;
			ostrosc = 100;
			zadzior = 50;
			obuch = 0;
			szpikulec = 50;
		} else if (bron.equals("Dzida")) {
			waga = 30;
			dlugosc = 200;
			ostrosc = 10;
			zadzior = 10;
			obuch = 0;
			szpikulec = 10;
		} else {
			waga = 300;
			dlugosc = 50;
			ostrosc = 0;
			zadzior = 0;
			obuch = 450;
			szpikulec = 0;
		}

		BronBaza brone = new BronBaza(waga, dlugosc, ostrosc, zadzior, obuch,
				szpikulec);

		return brone;
	}

	public Item setZbrojaDane(String zbroja) {// /////////////////////zbroja
		int waga = 0;
		int wygoda = 0;
		int zaczepy = 0;
		int hpPrzedmiotu = 0;
		int odpornoscNaCiecie = 0;
		int odpornoscNaKucie = 0;
		int odpornoscNaObuch = 0;

		if (zbroja.equals("Lniana")) {
			waga = 100;
			wygoda = 0;
			zaczepy = 100;
			hpPrzedmiotu = 100;
			odpornoscNaCiecie = 100;
			odpornoscNaKucie = 100;
			odpornoscNaObuch = 100;
		} else if (zbroja.equals("Bawelniana")) {
			waga = 50;
			wygoda = 50;
			zaczepy = 50;
			hpPrzedmiotu = 50;
			odpornoscNaCiecie = 50;
			odpornoscNaKucie = 50;
			odpornoscNaObuch = 50;
		} else if (zbroja.equals("Welniane")) {
			waga = 0;
			wygoda = 0;
			zaczepy = 0;
			hpPrzedmiotu = 0;
			odpornoscNaCiecie = 0;
			odpornoscNaKucie = 0;
			odpornoscNaObuch = 0;
		} else {
			waga = 0;
			wygoda = 0;
			zaczepy = 0;
			hpPrzedmiotu = 0;
			odpornoscNaCiecie = 0;
			odpornoscNaKucie = 0;
			odpornoscNaObuch = 0;
		}

		Item zbrojaa = new Item(waga, wygoda, zaczepy, hpPrzedmiotu,
				odpornoscNaCiecie, odpornoscNaKucie, odpornoscNaObuch);

		return zbrojaa;
	}

	public Item setObuwieDane(String obuwie) {// /////////////////////obuwie
		int waga = 0;
		int wygoda = 0;
		int zaczepy = 0;
		int hpPrzedmiotu = 0;
		int odpornoscNaCiecie = 0;
		int odpornoscNaKucie = 0;
		int odpornoscNaObuch = 0;

		if (obuwie.equals("Lniana")) {
			waga = 100;
			wygoda = 100;
			zaczepy = 100;
			hpPrzedmiotu = 100;
			odpornoscNaCiecie = 100;
			odpornoscNaKucie = 100;
			odpornoscNaObuch = 100;
		} else if (obuwie.equals("Bawelniana")) {
			waga = 0;
			wygoda = 0;
			zaczepy = 0;
			hpPrzedmiotu = 0;
			odpornoscNaCiecie = 0;
			odpornoscNaKucie = 0;
			odpornoscNaObuch = 0;
		} else if (obuwie.equals("Welniane")) {
			waga = 0;
			wygoda = 0;
			zaczepy = 0;
			hpPrzedmiotu = 0;
			odpornoscNaCiecie = 0;
			odpornoscNaKucie = 0;
			odpornoscNaObuch = 0;
		} else {
			waga = 0;
			wygoda = 0;
			zaczepy = 0;
			hpPrzedmiotu = 0;
			odpornoscNaCiecie = 0;
			odpornoscNaKucie = 0;
			odpornoscNaObuch = 0;
		}

		Item obuwiee = new Item(waga, wygoda, zaczepy, hpPrzedmiotu,
				odpornoscNaCiecie, odpornoscNaKucie, odpornoscNaObuch);

		return obuwiee;
	}

	public Item setSpodnieDane(String spodnie) {// /////////////////////spodnie
		int waga = 0;
		int wygoda = 0;
		int zaczepy = 0;
		int hpPrzedmiotu = 0;
		int odpornoscNaCiecie = 0;
		int odpornoscNaKucie = 0;
		int odpornoscNaObuch = 0;

		if (spodnie.equals("Lniana")) {
			waga = 100;
			wygoda = 100;
			zaczepy = 100;
			hpPrzedmiotu = 100;
			odpornoscNaCiecie = 100;
			odpornoscNaKucie = 100;
			odpornoscNaObuch = 100;
		} else if (spodnie.equals("Bawelniana")) {
			waga = 0;
			wygoda = 0;
			zaczepy = 0;
			hpPrzedmiotu = 0;
			odpornoscNaCiecie = 0;
			odpornoscNaKucie = 0;
			odpornoscNaObuch = 0;
		} else if (spodnie.equals("Welniane")) {
			waga = 0;
			wygoda = 0;
			zaczepy = 0;
			hpPrzedmiotu = 0;
			odpornoscNaCiecie = 0;
			odpornoscNaKucie = 0;
			odpornoscNaObuch = 0;
		} else {
			waga = 0;
			wygoda = 0;
			zaczepy = 0;
			hpPrzedmiotu = 0;
			odpornoscNaCiecie = 0;
			odpornoscNaKucie = 0;
			odpornoscNaObuch = 0;
		}

		Item spodniee = new Item(waga, wygoda, zaczepy, hpPrzedmiotu,
				odpornoscNaCiecie, odpornoscNaKucie, odpornoscNaObuch);

		return spodniee;
	}

	public Item setRekawiceDane(String rekawice) {// /////////////////////rekawice
		int waga = 0;
		int wygoda = 0;
		int zaczepy = 0;
		int hpPrzedmiotu = 0;
		int odpornoscNaCiecie = 0;
		int odpornoscNaKucie = 0;
		int odpornoscNaObuch = 0;

		if (rekawice.equals("Lniana")) {
			waga = 100;
			wygoda = 100;
			zaczepy = 100;
			hpPrzedmiotu = 100;
			odpornoscNaCiecie = 100;
			odpornoscNaKucie = 100;
			odpornoscNaObuch = 100;
		} else if (rekawice.equals("Bawelniana")) {
			waga = 0;
			wygoda = 0;
			zaczepy = 0;
			hpPrzedmiotu = 0;
			odpornoscNaCiecie = 0;
			odpornoscNaKucie = 0;
			odpornoscNaObuch = 0;
		} else if (rekawice.equals("Welniane")) {
			waga = 0;
			wygoda = 0;
			zaczepy = 0;
			hpPrzedmiotu = 0;
			odpornoscNaCiecie = 0;
			odpornoscNaKucie = 0;
			odpornoscNaObuch = 0;
		} else {
			waga = 0;
			wygoda = 0;
			zaczepy = 0;
			hpPrzedmiotu = 0;
			odpornoscNaCiecie = 0;
			odpornoscNaKucie = 0;
			odpornoscNaObuch = 0;
		}

		Item rekawicee = new Item(waga, wygoda, zaczepy, hpPrzedmiotu,
				odpornoscNaCiecie, odpornoscNaKucie, odpornoscNaObuch);

		return rekawicee;
	}

	public Item setCzapkaDane(String czapka) {// ////////////////Czapka
		int waga = 0;
		int wygoda = 0;
		int zaczepy = 0;
		int hpPrzedmiotu = 0;
		int odpornoscNaCiecie = 0;
		int odpornoscNaKucie = 0;
		int odpornoscNaObuch = 0;

		if (czapka.equals("Lniana")) {
			waga = 100;
			wygoda = 100;
			zaczepy = 100;
			hpPrzedmiotu = 100;
			odpornoscNaCiecie = 100;
			odpornoscNaKucie = 100;
			odpornoscNaObuch = 100;
		} else if (czapka.equals("Bawelniana")) {
			waga = 0;
			wygoda = 0;
			zaczepy = 0;
			hpPrzedmiotu = 0;
			odpornoscNaCiecie = 0;
			odpornoscNaKucie = 0;
			odpornoscNaObuch = 0;
		} else if (czapka.equals("Welniane")) {
			waga = 0;
			wygoda = 0;
			zaczepy = 0;
			hpPrzedmiotu = 0;
			odpornoscNaCiecie = 0;
			odpornoscNaKucie = 0;
			odpornoscNaObuch = 0;
		} else {
			waga = 0;
			wygoda = 0;
			zaczepy = 0;
			hpPrzedmiotu = 0;
			odpornoscNaCiecie = 0;
			odpornoscNaKucie = 0;
			odpornoscNaObuch = 0;
		}

		Item czapkaa = new Item(waga, wygoda, zaczepy, hpPrzedmiotu,
				odpornoscNaCiecie, odpornoscNaKucie, odpornoscNaObuch);

		return czapkaa;
	}

}