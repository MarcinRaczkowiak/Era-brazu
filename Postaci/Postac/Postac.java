package Postac;

import Bron.BronBaza;
import PrzedmiotyPostaci.Plecak;
import PrzedmiotyPostaci.ZbrojaBron;
import Wzor.Item;

public class Postac {
	private String imie;
	private boolean plecM;
	private boolean bot;
	private int klasa;
	private int level;
	private int pozycjax;
	private int pozycjay;

	private int sila;
	private int silaCiosu;
	private int terzyznaFizyczna;
	private int gurnik;

	private int zwinnosc;
	private int celnosc;
	private int unik;
	private int skradanie;

	private int szybkosc;
	private int szybkoscCiosu;
	private int szybkoscObrony;
	private int inicjatywa;

	private int wiedzaNaukowa;
	private int anatomia;
	private int traper;
	private int zielarz;

	private int znajomoscBroni;
	private int rozbrojenie;
	private int zbrojmistsz;
	private int platnerz;

	private int silyWitalne;
	private int zdrowie;
	private int kondycja;
	private int pojemnoscZoladka;

	private int wiedzaCodzienna;
	private int gotowanie;
	private int wetkarstwo;
	private int rolnictwo;

	private int wiedzaBudowlana;
	private int maszynyOblerznicze;
	private int budynkoObronne;
	private int budynkiSocjalne;

	private String bron;
	private String zbroja;
	private String obuwie;
	private String spodnie;
	private String rekawice;
	private String czapka;
	private String zapas;

	private Plecak plecak;
	private ZbrojaBron zbrojaBron;

	private int hp;

	public Postac(String imie, boolean plecM, boolean bot, int klasa,
			int level, int pozycjax, int pozycjay, int sila, int silaCiosu,
			int terzyznaFizyczna, int gurnik, int zwinnosc, int celnosc,
			int unik, int skradanie, int szybkosc, int szybkoscCiosu,
			int szybkoscObrony, int inicjatywa, int wiedzaNaukowa,
			int anatomia, int traper, int zielarz, int znajomoscBroni,
			int rozbrojenie, int zbrojmistsz, int platnerz, int silyWitalne,
			int zdrowie, int kondycja, int pojemnoscZoladka, int ziemiarz,
			int gotowanie, int wetkarstwo, int wiedzaCodzienna,
			int wiedzaBudowlana, int maszynyOblerznicze, int budynkoObronne,
			int budynkiSocjalne, String bron, String zbroja, String obuwie,
			String spodnie, String rekawice, String czapka, String zapas) {
		super();
		this.imie = imie;
		this.plecM = plecM;
		this.bot = bot;
		this.klasa = klasa;
		this.level = level;
		this.pozycjax = pozycjax;
		this.pozycjay = pozycjay;
		this.sila = sila;
		this.silaCiosu = silaCiosu;
		this.terzyznaFizyczna = terzyznaFizyczna;
		this.gurnik = gurnik;
		this.zwinnosc = zwinnosc;
		this.celnosc = celnosc;
		this.unik = unik;
		this.skradanie = skradanie;
		this.szybkosc = szybkosc;
		this.szybkoscCiosu = szybkoscCiosu;
		this.szybkoscObrony = szybkoscObrony;
		this.inicjatywa = inicjatywa;
		this.wiedzaNaukowa = wiedzaNaukowa;
		this.anatomia = anatomia;
		this.traper = traper;
		this.zielarz = zielarz;
		this.znajomoscBroni = znajomoscBroni;
		this.rozbrojenie = rozbrojenie;
		this.zbrojmistsz = zbrojmistsz;
		this.platnerz = platnerz;
		this.silyWitalne = silyWitalne;
		this.zdrowie = zdrowie;
		this.kondycja = kondycja;
		this.pojemnoscZoladka = pojemnoscZoladka;
		this.wiedzaCodzienna = ziemiarz;
		this.gotowanie = gotowanie;
		this.wetkarstwo = wetkarstwo;
		this.rolnictwo = wiedzaCodzienna;
		this.wiedzaBudowlana = wiedzaBudowlana;
		this.maszynyOblerznicze = maszynyOblerznicze;
		this.budynkoObronne = budynkoObronne;
		this.budynkiSocjalne = budynkiSocjalne;
		this.bron = bron;
		this.zbroja = zbroja;
		this.obuwie = obuwie;
		this.spodnie = spodnie;
		this.rekawice = rekawice;
		this.czapka = czapka;
		this.zapas = zapas;
		StartPostaci();
	}

	public void StartPostaci() {
		setStartHP();
		plecak = new Plecak();
		zbrojaBron = new ZbrojaBron(setBron(), setZbroja(), setObuwie(),
				setSpodnie(), setRekawice(), setCzapka());

	}

	public int getDyskonfort() {
		int bonus = (sila + terzyznaFizyczna) * 5
				+ zbrojaBron.getWygodaUzbrojenia();
		int Dyskonfort = (-bonus + zbrojaBron.getWagaUzbrojenia()) / 2;
		if (Dyskonfort < 0)
			Dyskonfort = 0;

		return Dyskonfort;
	}

	public int getDlugoscBroni() {
		int DlugoscBroni = zbrojaBron.getDlugoscBroni();

		return DlugoscBroni;
	}

	public int getWagaBroni() {
		int wagaBroni = zbrojaBron.getWagaBroni();

		return wagaBroni;
	}

	public Item getItem(String i) {
		Item to = zbrojaBron.getItem(i);
		return to;
	}

	public BronBaza setBron() {
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

		BronBaza bron = new BronBaza(waga, dlugosc, ostrosc, zadzior, obuch,
				szpikulec);

		return bron;
	}

	public Item setZbroja() {
		int waga = 0;
		int wygoda = 0;
		int zaczepy = 0;
		int hpPrzedmiotu = 0;
		int odpornoscNaCiecie = 0;
		int odpornoscNaKucie = 0;
		int odpornoscNaObuch = 0;

		if (zbroja.equals("Lniana")) {
			waga = 100;
			wygoda = 100;
			zaczepy = 100;
			hpPrzedmiotu = 100;
			odpornoscNaCiecie = 100;
			odpornoscNaKucie = 100;
			odpornoscNaObuch = 100;
		} else if (zbroja.equals("Bawelniana")) {
			waga = 50;
			wygoda = 0;
			zaczepy = 0;
			hpPrzedmiotu = 0;
			odpornoscNaCiecie = 0;
			odpornoscNaKucie = 0;
			odpornoscNaObuch = 0;
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

		Item zbroja = new Item(waga, wygoda, zaczepy, hpPrzedmiotu,
				odpornoscNaCiecie, odpornoscNaKucie, odpornoscNaObuch);

		return zbroja;
	}

	public Item setObuwie() {
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

		Item obuwie = new Item(waga, wygoda, zaczepy, hpPrzedmiotu,
				odpornoscNaCiecie, odpornoscNaKucie, odpornoscNaObuch);

		return obuwie;
	}

	public Item setSpodnie() {
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

		Item spodnie = new Item(waga, wygoda, zaczepy, hpPrzedmiotu,
				odpornoscNaCiecie, odpornoscNaKucie, odpornoscNaObuch);

		return spodnie;
	}

	public Item setRekawice() {
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

		Item rekawice = new Item(waga, wygoda, zaczepy, hpPrzedmiotu,
				odpornoscNaCiecie, odpornoscNaKucie, odpornoscNaObuch);

		return rekawice;
	}

	public Item setCzapka() {
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

		Item czapka = new Item(waga, wygoda, zaczepy, hpPrzedmiotu,
				odpornoscNaCiecie, odpornoscNaKucie, odpornoscNaObuch);

		return czapka;
	}

	public void setStartHP() {
		hp = 100 + (silyWitalne * 5) + (zdrowie * 5);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPozycjax() {
		return pozycjax;
	}

	public void setPozycjax(int pozycjax) {
		this.pozycjax = pozycjax;
	}

	public int getPozycjay() {
		return pozycjay;
	}

	public void setPozycjay(int pozycjay) {
		this.pozycjay = pozycjay;
	}

	public String getBron() {
		return bron;
	}

	public void setBron(String buty) {
		this.bron = buty;
	}

	public String getZbroja() {
		return zbroja;
	}

	public void setZbroja(String zbroja) {
		this.zbroja = zbroja;
	}

	public String getObuwie() {
		return obuwie;
	}

	public void setObuwie(String obuwie) {
		this.obuwie = obuwie;
	}

	public String getSpodnie() {
		return spodnie;
	}

	public void setSpodnie(String spodnie) {
		this.spodnie = spodnie;
	}

	public String getRekawice() {
		return rekawice;
	}

	public void setRekawice(String rekawice) {
		this.rekawice = rekawice;
	}

	public String getCzapka() {
		return czapka;
	}

	public void setCzapka(String czapka) {
		this.czapka = czapka;
	}

	public String getZapas() {
		return zapas;
	}

	public void setZapas(String zapas) {
		this.zapas = zapas;
	}

	public boolean isPlecM() {
		return plecM;
	}

	public void setPlecM(boolean plecM) {
		this.plecM = plecM;
	}

	public int getKlasa() {
		return klasa;
	}

	public void setKlasa(int klasa) {
		this.klasa = klasa;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public synchronized int getSila() {
		return sila;
	}

	public synchronized void setSila(int sila) {
		this.sila = sila;
	}

	public synchronized int getSilaCiosu() {
		return silaCiosu;
	}

	public synchronized void setSilaCiosu(int silaCiosu) {
		this.silaCiosu = silaCiosu;
	}

	public synchronized int getTerzyznaFizyczna() {
		return terzyznaFizyczna;
	}

	public synchronized void setTerzyznaFizyczna(int terzyznaFizyczna) {
		this.terzyznaFizyczna = terzyznaFizyczna;
	}

	public synchronized int getGurnik() {
		return gurnik;
	}

	public synchronized void setGurnik(int gurnik) {
		this.gurnik = gurnik;
	}

	public synchronized int getZwinnosc() {
		return zwinnosc;
	}

	public synchronized void setZwinnosc(int zwinnosc) {
		this.zwinnosc = zwinnosc;
	}

	public synchronized int getCelnosc() {
		return celnosc;
	}

	public synchronized void setCelnosc(int celnosc) {
		this.celnosc = celnosc;
	}

	public synchronized int getUnik() {
		return unik;
	}

	public synchronized void setUnik(int unik) {
		this.unik = unik;
	}

	public synchronized int getSkradanie() {
		return skradanie;
	}

	public synchronized void setSkradanie(int skradanie) {
		this.skradanie = skradanie;
	}

	public synchronized int getSzybkosc() {
		return szybkosc;
	}

	public synchronized void setSzybkosc(int szybkosc) {
		this.szybkosc = szybkosc;
	}

	public synchronized int getSzybkoscCiosu() {
		return szybkoscCiosu;
	}

	public synchronized void setSzybkoscCiosu(int szybkoscCiosu) {
		this.szybkoscCiosu = szybkoscCiosu;
	}

	public synchronized int getSzybkoscObrony() {
		return szybkoscObrony;
	}

	public synchronized void setSzybkoscObrony(int szybkoscObrony) {
		this.szybkoscObrony = szybkoscObrony;
	}

	public synchronized int getInicjatywa() {
		return inicjatywa;
	}

	public synchronized void setInicjatywa(int inicjatywa) {
		this.inicjatywa = inicjatywa;
	}

	public synchronized int getWiedzaNaukowa() {
		return wiedzaNaukowa;
	}

	public synchronized void setWiedzaNaukowa(int wiedza) {
		this.wiedzaNaukowa = wiedza;
	}

	public synchronized int getAnatomia() {
		return anatomia;
	}

	public synchronized void setAnatomia(int anatomia) {
		this.anatomia = anatomia;
	}

	public synchronized int getTraper() {
		return traper;
	}

	public synchronized void setTraper(int traper) {
		this.traper = traper;
	}

	public synchronized int getZielarz() {
		return zielarz;
	}

	public synchronized void setZielarz(int zielarz) {
		this.zielarz = zielarz;
	}

	public synchronized int getZnajomoscBroni() {
		return znajomoscBroni;
	}

	public synchronized void setZnajomoscBroni(int znajomoscBroni) {
		this.znajomoscBroni = znajomoscBroni;
	}

	public synchronized int getRozbrojenie() {
		return rozbrojenie;
	}

	public synchronized void setRozbrojenie(int rozbrojenie) {
		this.rozbrojenie = rozbrojenie;
	}

	public synchronized int getZbrojmistsz() {
		return zbrojmistsz;
	}

	public synchronized void setZbrojmistsz(int zbrojmistsz) {
		this.zbrojmistsz = zbrojmistsz;
	}

	public synchronized int getPlatnerz() {
		return platnerz;
	}

	public synchronized void setPlatnerz(int platnerz) {
		this.platnerz = platnerz;
	}

	public synchronized int getSilyWitalne() {
		return silyWitalne;
	}

	public synchronized void setSilyWitalne(int silyWitalne) {
		this.silyWitalne = silyWitalne;
	}

	public synchronized int getZdrowie() {
		return zdrowie;
	}

	public synchronized void setZdrowie(int zdrowie) {
		this.zdrowie = zdrowie;
	}

	public synchronized int getKondycja() {
		return kondycja;
	}

	public synchronized void setKondycja(int kondycja) {
		this.kondycja = kondycja;
	}

	public synchronized int getPojemnoscZoladka() {
		return pojemnoscZoladka;
	}

	public synchronized void setPojemnoscZoladka(int pojemnoscZoladka) {
		this.pojemnoscZoladka = pojemnoscZoladka;
	}

	public synchronized int getWiedzaCodzienna() {
		return wiedzaCodzienna;
	}

	public synchronized void setWiedzaCodzienna(int ziemiarz) {
		this.wiedzaCodzienna = ziemiarz;
	}

	public synchronized int getGotowanie() {
		return gotowanie;
	}

	public synchronized void setGotowanie(int gotowanie) {
		this.gotowanie = gotowanie;
	}

	public synchronized int getWetkarstwo() {
		return wetkarstwo;
	}

	public synchronized void setWetkarstwo(int wetkarstwo) {
		this.wetkarstwo = wetkarstwo;
	}

	public synchronized int getRolnictwo() {
		return rolnictwo;
	}

	public synchronized void setRolnictwo(int rolnictwo) {
		this.rolnictwo = rolnictwo;
	}

	public synchronized int getWiedzaBudowlana() {
		return wiedzaBudowlana;
	}

	public synchronized void setWiedzaBudowlana(int budownictwo) {
		this.wiedzaBudowlana = budownictwo;
	}

	public synchronized int getMaszynyOblerznicze() {
		return maszynyOblerznicze;
	}

	public synchronized void setMaszynyOblerznicze(int maszynyOblerznicze) {
		this.maszynyOblerznicze = maszynyOblerznicze;
	}

	public synchronized int getBudynkoObronne() {
		return budynkoObronne;
	}

	public synchronized void setBudynkoObronne(int budynkoObronne) {
		this.budynkoObronne = budynkoObronne;
	}

	public synchronized int getBudynkiSocjalne() {
		return budynkiSocjalne;
	}

	public synchronized void setBudynkiSocjalne(int budynkiSocjalne) {
		this.budynkiSocjalne = budynkiSocjalne;
	}

	public synchronized boolean getBot() {
		return bot;
	}

	public synchronized void setBot(boolean bot) {
		this.bot = bot;
	}

}
