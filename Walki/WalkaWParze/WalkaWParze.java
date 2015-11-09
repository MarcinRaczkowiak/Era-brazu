package WalkaWParze;

import java.util.Random;

import PanelWalki.OknoWalki;
import Postac.Postac;
import Wzor.Item;

public class WalkaWParze {
	/**
	 * atakujacy
	 */
	private Postac bochater;
	/**
	 * obrywajacy
	 */
	private Postac bot;

	public WalkaWParze(Postac bochater, Postac bot) {
		this.bochater = bochater;
		this.bot = bot;
	}

	/**
	 * atak postaci na postac. Atakujacy to bochater Obrywajacy to bot G³uwne
	 * wyliczenia czy atak sie uda wraz z kontynuacj¹ ca³ego ataku
	 */
	public void Atak(String rodzajAtaku, String celAtaku) {
		int pretkoscAtaku = (bochater.getSzybkosc() + bochater
				.getSzybkoscCiosu())
				* 5
				+ bochater.getDlugoscBroni()
				- bochater.getDyskonfort() + 25;
		if (pretkoscAtaku < 5)
			pretkoscAtaku = 5;

		int pretkoscObrony = (bot.getSzybkosc() + bot.getSzybkoscObrony() * 5
				+ bochater.getDlugoscBroni() - bot.getDyskonfort());
		if (pretkoscObrony < 5)
			pretkoscObrony = 5;

		int Atak;
		Random SAtak = new Random();
		Atak = SAtak.nextInt(pretkoscAtaku) + 5;

		int Obrona;
		Random SObrona = new Random();
		Obrona = SObrona.nextInt(pretkoscObrony);

		OknoWalki.DopiszTekstWalkiNiezakonczonej("Atakuje "
				+ bochater.getImie() + "    Broni sie " + bot.getImie());
		OknoWalki.DopiszTekstWalkiNiezakonczonej("Atak " + Atak + "    Obrona "
				+ Obrona);
		System.out.println("Atak" + Atak + "    Obrona" + Obrona);

		if (Atak >= Obrona) {
			Cios(rodzajAtaku, celAtaku);
		} else {
			KontrAtak(rodzajAtaku, celAtaku);
		}
		System.out.println("");
		System.out.println("hp bochater" + bochater.getHp());
		System.out.println("hp bot" + bot.getHp());
		OknoWalki.DopiszTekstWalkiNiezakonczonej("");

		OknoWalki.DopiszTekstWalkiNiezakonczonej(bot.getImie() + bot.getHp());

		OknoWalki.DopiszTekstWalkiNiezakonczonej(bochater.getImie()
				+ bochater.getHp());

		OknoWalki.ZakonczTekst();
	}

	/**
	 * KOntr atak Obrywajacy zadaje obrarzenia Atakujacemu dodac bron do ciosu
	 * !!!!!
	 * 
	 * @param celAtaku
	 * @param rodzajAtaku
	 */
	private void KontrAtak(String rodzajAtaku, String celAtaku) {
		int cios = (bot.getSila() + bot.getSilaCiosu() + bot.getWagaBroni()) / 30;
		int unik = (bochater.getUnik() + bochater.getZwinnosc());

		if (unik <= 1) {
			unik = 0;
		} else {
			Random SObrona = new Random();
			unik = SObrona.nextInt(unik);
			cios -= unik;
		}

		if (cios > 0) {

			OknoWalki.DopiszTekstWalkiNiezakonczonej(bot.getImie() + " uderza "
					+ bochater.getImie() + " za " + cios);

			OknoWalki.DopiszTekstWalkiNiezakonczonej(bochater.getImie()
					+ " unika " + unik + " obrarzeñ");

			String item = Item();
			Item trafionyItem = bochater.getItem(item);
			OknoWalki.DopiszTekstWalkiNiezakonczonej("trafiono w " + item);
			CiosKontraItem(bot, trafionyItem, cios, bochater);
		} else {
			OknoWalki.DopiszTekstWalkiNiezakonczonej(bochater.getImie()
					+ " zrobi³ pe³en unik");
		}
	}

	/**
	 * dodac bron do ciosu !!!!!
	 * 
	 * @param rodzajAtaku
	 * @param celAtaku
	 */
	private void Cios(String rodzajAtaku, String celAtaku) {

		int cios = bochater.getSila() + bochater.getSilaCiosu()
				+ bochater.getWagaBroni() / 10;
		int unik = (bot.getUnik() + bot.getZwinnosc());

		if (unik <= 1) {
			unik = 0;
		} else {
			Random SObrona = new Random();
			unik = SObrona.nextInt(unik);
			cios -= unik;
		}

		if (cios > 0) {

			OknoWalki.DopiszTekstWalkiNiezakonczonej(bochater.getImie()
					+ " uderza " + bot.getImie() + " za " + cios);

			OknoWalki.DopiszTekstWalkiNiezakonczonej(bot.getImie() + " unika "
					+ unik + " obrarzeñ");

			String item = Item();// gdzie trafia atakuj¹cy
			OknoWalki.DopiszTekstWalkiNiezakonczonej("trafiono w " + item);

			Item trafionyItem = bot.getItem(item);
			CiosKontraItem(bochater, trafionyItem, cios, bot);
		} else {
			OknoWalki.DopiszTekstWalkiNiezakonczonej(bot.getImie()
					+ " zrobi³ pe³en unik");
		}
	}

	private String Item() {
		Random gg = new Random();
		int item = gg.nextInt(6) + 1;
		String nItem = "";
		switch (item) {
		case 1:
			nItem = "zbroja";
			System.out.println("zbroja");

			break;

		case 2:
			nItem = "obuwie";
			System.out.println("obuwie");

			break;
		case 3:
			nItem = "spodnie";
			System.out.println("spodnie");
			break;

		case 4:
			nItem = "rekawice";
			System.out.println("rekawice");
			break;
		case 5:
			nItem = "czapka";
			System.out.println("czapka");
			break;

		case 6:
			nItem = "zbroja";
			System.out.println(" zbroja");
			break;

		default:
		}
		return nItem;

	}

	private void CiosKontraItem(Postac Atakujacy, Item trafionyItem, int cios,
			Postac Obrywa) {

		if (cios <= trafionyItem.getOdpornoscNaCiecie()) {
			OknoWalki.DopiszTekstWalkiNiezakonczonej("Cios w przedmiot");
			CiosWItem(trafionyItem, cios, Obrywa);

		} else if (0 == trafionyItem.getOdpornoscNaCiecie()) {
			Obrywa.setHp(Obrywa.getHp() - cios);// cios tylko w bpchatera
			OknoWalki.DopiszTekstWalkiNiezakonczonej("Cios omija przedmiot");

		} else {
			OknoWalki
					.DopiszTekstWalkiNiezakonczonej("Cios trwfi³ w przedmiot i w "
							+ Obrywa.getImie());
			Obrywa.setHp(Obrywa.getHp() - cios
					+ trafionyItem.getOdpornoscNaCiecie());
			CiosWItem(trafionyItem, cios - trafionyItem.getOdpornoscNaCiecie(),
					Obrywa);

		}

	}

	/**
	 * cios w przedmiot z pelnym pochlonieciem jego sily
	 */
	private void CiosWItem(Item trafionyItem, int cios, Postac Obrywa) {
		if (cios <= trafionyItem.getHpPrzedmiotu()) {
			trafionyItem.setHpPrzedmiotu(trafionyItem.getHpPrzedmiotu() - cios);
			OknoWalki
					.DopiszTekstWalkiNiezakonczonej("Przedmiot poch³on¹ ca³e obra¿enia ");

		} else {
			Obrywa.setHp(Obrywa.getHp()
					- (cios - trafionyItem.getHpPrzedmiotu()));
			trafionyItem.setHpPrzedmiotu(0);

			OknoWalki
					.DopiszTekstWalkiNiezakonczonej("Przedmiot jest zbyt zniszczony by odebraæ obrarzenia");

		}
	}

}
