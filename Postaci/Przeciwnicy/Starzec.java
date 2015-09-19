package Przeciwnicy;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

import Postac.Postac;

public class Starzec extends Postac {

	private int exp;
	private String drop;

	public Starzec(String imie, boolean plecM, boolean bot, int klasa,
			int level, int pozycjax, int pozycjay, int sila, int silaCiosu,
			int terzyznaFizyczna, int gurnik, int zwinnosc, int celnosc,
			int unik, int skradanie, int szybkosc, int szybkoscCiosu,
			int szybkoscObrony, int inicjatywa, int wiedza, int anatomia,
			int traper, int zielarz, int znajomoscBroni, int rozbrojenie,
			int zbrojmistsz, int platnerz, int silyWitalne, int zdrowie,
			int kondycja, int pojemnoscZoladka, int ziemiarz, int gotowanie,
			int wetkarstwo, int rolnictwo, int budownictwo,
			int maszynyOblerznicze, int budynkoObronne, int budynkiSocjalne,
			String buty, String zbroja, String obuwie, String spodnie,
			String rekawice, String czapka, String zapas) {
		super(imie, plecM, bot, klasa, level, pozycjax, pozycjay, sila,
				silaCiosu, terzyznaFizyczna, gurnik, zwinnosc, celnosc, unik,
				skradanie, szybkosc, szybkoscCiosu, szybkoscObrony, inicjatywa,
				wiedza, anatomia, traper, zielarz, znajomoscBroni, rozbrojenie,
				zbrojmistsz, platnerz, silyWitalne, zdrowie, kondycja,
				pojemnoscZoladka, ziemiarz, gotowanie, wetkarstwo, rolnictwo,
				budownictwo, maszynyOblerznicze, budynkoObronne,
				budynkiSocjalne, buty, zbroja, obuwie, spodnie, rekawice,
				czapka, zapas);

	}

	public Starzec(String imie, boolean plecM, boolean bot, int klasa,
			int level, int pozycjax, int pozycjay, int sila, int silaCiosu,
			int terzyznaFizyczna, int gurnik, int zwinnosc, int celnosc,
			int unik, int skradanie, int szybkosc, int szybkoscCiosu,
			int szybkoscObrony, int inicjatywa, int wiedza, int anatomia,
			int traper, int zielarz, int znajomoscBroni, int rozbrojenie,
			int zbrojmistsz, int platnerz, int silyWitalne, int zdrowie,
			int kondycja, int pojemnoscZoladka, int ziemiarz, int gotowanie,
			int wetkarstwo, int rolnictwo, int budownictwo,
			int maszynyOblerznicze, int budynkoObronne, int budynkiSocjalne,
			String buty, String zbroja, String obuwie, String spodnie,
			String rekawice, String czapka, String zapas, int exp, String drop) {
		super(imie, plecM, bot, klasa, level, pozycjax, pozycjay, sila,
				silaCiosu, terzyznaFizyczna, gurnik, zwinnosc, celnosc, unik,
				skradanie, szybkosc, szybkoscCiosu, szybkoscObrony, inicjatywa,
				wiedza, anatomia, traper, zielarz, znajomoscBroni, rozbrojenie,
				zbrojmistsz, platnerz, silyWitalne, zdrowie, kondycja,
				pojemnoscZoladka, ziemiarz, gotowanie, wetkarstwo, rolnictwo,
				budownictwo, maszynyOblerznicze, budynkoObronne,
				budynkiSocjalne, buty, zbroja, obuwie, spodnie, rekawice,
				czapka, zapas);
		this.exp = exp;
		this.drop = drop;
	}

	public char charAt(int arg0) {
		return drop.charAt(arg0);
	}

	public IntStream chars() {
		return drop.chars();
	}

	public int codePointAt(int arg0) {
		return drop.codePointAt(arg0);
	}

	public int codePointBefore(int arg0) {
		return drop.codePointBefore(arg0);
	}

	public int codePointCount(int arg0, int arg1) {
		return drop.codePointCount(arg0, arg1);
	}

	public IntStream codePoints() {
		return drop.codePoints();
	}

	public int compareTo(String arg0) {
		return drop.compareTo(arg0);
	}

	public int compareToIgnoreCase(String arg0) {
		return drop.compareToIgnoreCase(arg0);
	}

	public String concat(String arg0) {
		return drop.concat(arg0);
	}

	public boolean contains(CharSequence arg0) {
		return drop.contains(arg0);
	}

	public boolean contentEquals(CharSequence arg0) {
		return drop.contentEquals(arg0);
	}

	public boolean contentEquals(StringBuffer arg0) {
		return drop.contentEquals(arg0);
	}

	public boolean endsWith(String arg0) {
		return drop.endsWith(arg0);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Starzec other = (Starzec) obj;
		if (drop == null) {
			if (other.drop != null)
				return false;
		} else if (!drop.equals(other.drop))
			return false;
		if (exp != other.exp)
			return false;
		return true;
	}

	public boolean equalsIgnoreCase(String arg0) {
		return drop.equalsIgnoreCase(arg0);
	}

	public byte[] getBytes() {
		return drop.getBytes();
	}

	public byte[] getBytes(Charset arg0) {
		return drop.getBytes(arg0);
	}

	public void getBytes(int arg0, int arg1, byte[] arg2, int arg3) {
		drop.getBytes(arg0, arg1, arg2, arg3);
	}

	public byte[] getBytes(String arg0) throws UnsupportedEncodingException {
		return drop.getBytes(arg0);
	}

	public void getChars(int arg0, int arg1, char[] arg2, int arg3) {
		drop.getChars(arg0, arg1, arg2, arg3);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((drop == null) ? 0 : drop.hashCode());
		result = prime * result + exp;
		return result;
	}

	public int indexOf(int arg0, int arg1) {
		return drop.indexOf(arg0, arg1);
	}

	public int indexOf(int arg0) {
		return drop.indexOf(arg0);
	}

	public int indexOf(String arg0, int arg1) {
		return drop.indexOf(arg0, arg1);
	}

	public int indexOf(String arg0) {
		return drop.indexOf(arg0);
	}

	public String intern() {
		return drop.intern();
	}

	public boolean isEmpty() {
		return drop.isEmpty();
	}

	public int lastIndexOf(int arg0, int arg1) {
		return drop.lastIndexOf(arg0, arg1);
	}

	public int lastIndexOf(int arg0) {
		return drop.lastIndexOf(arg0);
	}

	public int lastIndexOf(String arg0, int arg1) {
		return drop.lastIndexOf(arg0, arg1);
	}

	public int lastIndexOf(String arg0) {
		return drop.lastIndexOf(arg0);
	}

	public int length() {
		return drop.length();
	}

	public boolean matches(String arg0) {
		return drop.matches(arg0);
	}

	public int offsetByCodePoints(int arg0, int arg1) {
		return drop.offsetByCodePoints(arg0, arg1);
	}

	public boolean regionMatches(boolean arg0, int arg1, String arg2, int arg3,
			int arg4) {
		return drop.regionMatches(arg0, arg1, arg2, arg3, arg4);
	}

	public boolean regionMatches(int arg0, String arg1, int arg2, int arg3) {
		return drop.regionMatches(arg0, arg1, arg2, arg3);
	}

	public String replace(char arg0, char arg1) {
		return drop.replace(arg0, arg1);
	}

	public String replace(CharSequence arg0, CharSequence arg1) {
		return drop.replace(arg0, arg1);
	}

	public String replaceAll(String arg0, String arg1) {
		return drop.replaceAll(arg0, arg1);
	}

	public String replaceFirst(String arg0, String arg1) {
		return drop.replaceFirst(arg0, arg1);
	}

	public String[] split(String arg0, int arg1) {
		return drop.split(arg0, arg1);
	}

	public String[] split(String arg0) {
		return drop.split(arg0);
	}

	public boolean startsWith(String arg0, int arg1) {
		return drop.startsWith(arg0, arg1);
	}

	public boolean startsWith(String arg0) {
		return drop.startsWith(arg0);
	}

	public CharSequence subSequence(int arg0, int arg1) {
		return drop.subSequence(arg0, arg1);
	}

	public String substring(int arg0, int arg1) {
		return drop.substring(arg0, arg1);
	}

	public String substring(int arg0) {
		return drop.substring(arg0);
	}

	public char[] toCharArray() {
		return drop.toCharArray();
	}

	public String toLowerCase() {
		return drop.toLowerCase();
	}

	public String toLowerCase(Locale arg0) {
		return drop.toLowerCase(arg0);
	}

	public String toString() {
		return drop.toString();
	}

	public String toUpperCase() {
		return drop.toUpperCase();
	}

	public String toUpperCase(Locale arg0) {
		return drop.toUpperCase(arg0);
	}

	public String trim() {
		return drop.trim();
	}

	public synchronized int getExp() {
		return exp;
	}

	public synchronized void setExp(int exp) {
		this.exp = exp;
	}

	public synchronized String getDrop() {
		return drop;
	}

	public synchronized void setDrop(String drop) {
		this.drop = drop;
	}

}
