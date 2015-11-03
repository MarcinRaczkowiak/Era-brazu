package TworeniePostaci;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Postac.Postac;

public class TworzeniePostaci extends JFrame {
	private JPanel panel1, panel2, panel3;

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
	private int ziemiarz;
	private int gotowanie;
	private int wetkarstwo;
	private int wiedzaCodzienna;
	private int wiedzaBudowlana;
	private int maszynyOblerznicze;
	private int budynkoObronne;
	private int budynkiSocjalne;

	private String bron = "nic";
	private String zbroja = "nic";
	private String obuwie = "nic";
	private String spodnie = "nic";
	private String rekawice = "nic";
	private String czapka = "nic";
	private String zapas = "nic";

	private String rodzajGry;

	/**
	 * 
	 * @param menyStart
	 *            nie pamiêtam
	 * @param rodzajGry
	 *            String zakoñczenia procesu np.pvp
	 */
	public TworzeniePostaci(JFrame menyStart, String rodzajGry) {
		this.rodzajGry = rodzajGry;
		setTitle("Era Brazu");
		setVisible(true);
		setSize(410, 410);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(450, 170, 410, 410);
		panel1 = new Panel1(menyStart, this);
		panel2 = new Panel2(menyStart, this);
		panel3 = new Panel3(menyStart, this, rodzajGry);
		setLayout(new FlowLayout());
		add(panel1);

	}

	public String Zapis() {
		String a = imie;
		a = a + "\n" + String.valueOf(plecM) + "\n" + String.valueOf(klasa)
				+ "\n" + String.valueOf(level) + "\n"
				+ String.valueOf(pozycjax) + "\n" + String.valueOf(pozycjay)
				+ "\n" + String.valueOf(sila) + "\n"
				+ String.valueOf(silaCiosu) + "\n"
				+ String.valueOf(terzyznaFizyczna) + "\n"
				+ String.valueOf(gurnik) + "\n" + String.valueOf(zwinnosc)
				+ "\n" + String.valueOf(celnosc) + "\n" + String.valueOf(unik)
				+ "\n" + String.valueOf(skradanie) + "\n"
				+ String.valueOf(szybkosc) + "\n"
				+ String.valueOf(szybkoscCiosu) + "\n"
				+ String.valueOf(szybkoscObrony) + "\n"
				+ String.valueOf(inicjatywa) + "\n"
				+ String.valueOf(wiedzaNaukowa) + "\n"
				+ String.valueOf(anatomia) + "\n" + String.valueOf(traper)
				+ "\n" + String.valueOf(zielarz) + "\n"
				+ String.valueOf(znajomoscBroni) + "\n"
				+ String.valueOf(rozbrojenie) + "\n"
				+ String.valueOf(zbrojmistsz) + "\n" + String.valueOf(platnerz)
				+ "\n" + String.valueOf(silyWitalne) + "\n"
				+ String.valueOf(zdrowie) + "\n" + String.valueOf(kondycja)
				+ "\n" + String.valueOf(pojemnoscZoladka) + "\n"
				+ String.valueOf(ziemiarz) + "\n" + String.valueOf(gotowanie)
				+ "\n" + String.valueOf(wetkarstwo) + "\n"
				+ String.valueOf(wiedzaCodzienna) + "\n"
				+ String.valueOf(wiedzaBudowlana) + "\n"
				+ String.valueOf(maszynyOblerznicze) + "\n"
				+ String.valueOf(budynkoObronne) + "\n"
				+ String.valueOf(budynkiSocjalne) + "\n" + bron + "\n" + zbroja
				+ "\n" + obuwie + "\n" + spodnie + "\n" + rekawice + "\n"
				+ czapka + "\n" + zapas + "\n" + bot;

		return a;
	}

	public void Odczyt(int krok, String dane) {
		switch (krok) {
		case 1:
			imie = dane;
			break;

		case 2:
			plecM = Boolean.valueOf(dane);

			break;
		case 3:
			klasa = Integer.parseInt(dane);
			break;

		case 4:
			level = Integer.parseInt(dane);
			break;
		case 5:
			pozycjax = Integer.parseInt(dane);
			break;

		case 6:
			pozycjay = Integer.parseInt(dane);
			break;
		case 7:
			sila = Integer.parseInt(dane);
			break;

		case 8:
			silaCiosu = Integer.parseInt(dane);
			break;
		case 9:
			terzyznaFizyczna = Integer.parseInt(dane);
			break;

		case 10:
			gurnik = Integer.parseInt(dane);
			break;
		case 11:
			zwinnosc = Integer.parseInt(dane);
			break;

		case 12:
			celnosc = Integer.parseInt(dane);
			break;
		case 13:
			unik = Integer.parseInt(dane);
			break;

		case 14:
			skradanie = Integer.parseInt(dane);
			break;
		case 15:
			szybkosc = Integer.parseInt(dane);
			break;

		case 16:
			szybkoscCiosu = Integer.parseInt(dane);
			break;
		case 17:
			szybkoscObrony = Integer.parseInt(dane);
			break;

		case 18:
			inicjatywa = Integer.parseInt(dane);
			break;
		case 19:
			wiedzaNaukowa = Integer.parseInt(dane);
			break;
		case 20:
			anatomia = Integer.parseInt(dane);
			break;
		case 21:
			traper = Integer.parseInt(dane);
			break;

		case 22:
			zielarz = Integer.parseInt(dane);
			break;
		case 23:
			znajomoscBroni = Integer.parseInt(dane);
			break;

		case 24:
			rozbrojenie = Integer.parseInt(dane);
			break;
		case 25:
			zbrojmistsz = Integer.parseInt(dane);
			break;

		case 26:
			platnerz = Integer.parseInt(dane);
			break;
		case 27:
			silyWitalne = Integer.parseInt(dane);
			break;

		case 28:
			zdrowie = Integer.parseInt(dane);
			break;
		case 29:
			kondycja = Integer.parseInt(dane);
			break;
		case 30:
			pojemnoscZoladka = Integer.parseInt(dane);
			break;
		case 31:
			ziemiarz = Integer.parseInt(dane);
			break;

		case 32:
			gotowanie = Integer.parseInt(dane);
			break;
		case 33:
			wetkarstwo = Integer.parseInt(dane);
			break;

		case 34:
			wiedzaCodzienna = Integer.parseInt(dane);
			break;
		case 35:
			wiedzaBudowlana = Integer.parseInt(dane);
			break;
		case 36:
			maszynyOblerznicze = Integer.parseInt(dane);
			break;
		case 37:
			budynkoObronne = Integer.parseInt(dane);
			break;

		case 38:
			budynkiSocjalne = Integer.parseInt(dane);
			break;
		case 39:
			bron = dane;
			break;
		case 40:
			zbroja = dane;
			break;
		case 41:
			obuwie = dane;
			break;
		case 42:
			spodnie = dane;
			break;
		case 43:
			rekawice = dane;
			break;
		case 44:
			czapka = dane;
			break;
		case 45:
			zapas = dane;
			break;
		case 46:
			bot = false;
			break;

		}

	}

	public Postac newBochater() {
		Postac Bochater = new Postac(imie, plecM, bot, klasa, level, pozycjax,
				pozycjay, sila, silaCiosu, terzyznaFizyczna, gurnik, zwinnosc,
				celnosc, unik, skradanie, szybkosc, szybkoscCiosu,
				szybkoscObrony, inicjatywa, wiedzaNaukowa, anatomia, traper,
				zielarz, znajomoscBroni, rozbrojenie, zbrojmistsz, platnerz,
				silyWitalne, zdrowie, kondycja, pojemnoscZoladka, ziemiarz,
				gotowanie, wetkarstwo, wiedzaCodzienna, wiedzaBudowlana,
				maszynyOblerznicze, budynkoObronne, budynkiSocjalne, bron,
				zbroja, obuwie, spodnie, rekawice, czapka, zapas);
		return Bochater;
	}

	public void nadajImie(String imie) {
		this.imie = imie;
	}

	public void wybierzPlec(boolean plecM) {
		this.plecM = plecM;
	}

	public void wybierzKlase(int klasa) {
		this.klasa = klasa;
	}

	public void panel2() {
		remove(panel1);
		// setLayout(new FlowLayout());
		add(panel2);
		panel2.setVisible(true);

		repaint();

	}

	public void panel3() {
		remove(panel2);
		// setLayout(new FlowLayout());
		add(panel3);
		panel3.setVisible(true);

		repaint();

	}

	public void panel1do3() {
		remove(panel1);
		// setLayout(new FlowLayout());
		add(panel3);
		panel3.setVisible(true);

		repaint();

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

	public synchronized int getZiemiarz() {
		return ziemiarz;
	}

	public synchronized void setZiemiarz(int ziemiarz) {
		this.ziemiarz = ziemiarz;
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

	public synchronized int getWiedzaCodzienna() {
		return wiedzaCodzienna;
	}

	public synchronized void setWiedzaCodzienna(int rolnictwo) {
		this.wiedzaCodzienna = rolnictwo;
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

	public String toString() {
		return "TworzenieBota [imie=" + imie + ", plecM=" + plecM + ", klasa="
				+ klasa + ", level=" + level + ", pozycjax=" + pozycjax
				+ ", pozycjay=" + pozycjay + ", sila=" + sila + ", silaCiosu="
				+ silaCiosu + ", terzyznaFizyczna=" + terzyznaFizyczna
				+ ", gurnik=" + gurnik + ", zwinnosc=" + zwinnosc
				+ ", celnosc=" + celnosc + ", unik=" + unik + ", skradanie="
				+ skradanie + ", szybkosc=" + szybkosc + ", szybkoscCiosu="
				+ szybkoscCiosu + ", szybkoscObrony=" + szybkoscObrony
				+ ", inicjatywa=" + inicjatywa + ", wiedzaNaukowa="
				+ wiedzaNaukowa + ", anatomia=" + anatomia + ", traper="
				+ traper + ", zielarz=" + zielarz + ", znajomoscBroni="
				+ znajomoscBroni + ", rozbrojenie=" + rozbrojenie
				+ ", zbrojmistsz=" + zbrojmistsz + ", platnerz=" + platnerz
				+ ", silyWitalne=" + silyWitalne + ", zdrowie=" + zdrowie
				+ ", kondycja=" + kondycja + ", pojemnoscZoladka="
				+ pojemnoscZoladka + ", ziemiarz=" + ziemiarz + ", gotowanie="
				+ gotowanie + ", wetkarstwo=" + wetkarstwo
				+ ", wiedzaCodzienna=" + wiedzaCodzienna + ", wiedzaBudowlana="
				+ wiedzaBudowlana + ", maszynyOblerznicze="
				+ maszynyOblerznicze + ", budynkoObronne=" + budynkoObronne
				+ ", budynkiSocjalne=" + budynkiSocjalne + ", bron=" + bron
				+ ", zbroja=" + zbroja + ", obuwie=" + obuwie + ", spodnie="
				+ spodnie + ", rekawice=" + rekawice + ", czapka=" + czapka
				+ ", zapas=" + zapas + ", bot=" + bot + "]";
	}

}
