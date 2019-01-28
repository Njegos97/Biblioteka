package logika;

import java.util.*;
import BibliotekaInterface.InterfaceZaBiblioteku;
import entiteti.Clan;
import entiteti.Knjiga;
import java.io.*;

public class BibliotekaLogika implements InterfaceZaBiblioteku {
	// nacin 1
	// static InterfaceZaBiblioteku generisiKey = new BibliotekaLogika();

	public static boolean registracija(LinkedHashMap<Integer, Clan> listaClanova, Clan clanKojiSeRegistruje) {

		Map lista = listaClanova;
		// nacin 2:
		InterfaceZaBiblioteku generisiKey = new BibliotekaLogika();
		int key = generisiKey.generisiKey(lista);

		// Nacin 3:
		// BibliotekaLogika key = null;
		// key.generisiKey(lista);

		listaClanova.put(key, clanKojiSeRegistruje);

		return true;
	}

	public static boolean DodajKnjigu(Map<Integer, Knjiga> listaKnjiga, Knjiga knjiga) {

		Map lista = listaKnjiga;
		InterfaceZaBiblioteku generisiKey = new BibliotekaLogika();
		int key = generisiKey.generisiKey(lista);

		listaKnjiga.put(key, knjiga);

		return true;
	}

	@Override
	public int generisiKey(Map<Integer, Object> lista) {
		int key = lista.size() + 1;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.containsKey(key)) {
				key += 1;
				/*
				 * i = 0; ZA SAD RADI, POKUSAJ OVO U SLUCAJU NEKE GRESKE prodji opet kroz listu
				 * ako bi opet bila knjiga sa istim id-om
				 */

			}
		}

		return key;
	}

	@Override
	public boolean izbrisi(Map<Integer, Object> lista, int key) {
		// TODO Auto-generated method stub

		lista.remove(key);
		return true;
	}

	@Override
	public Object pretraziListu(Map<Integer, Object> lista, int key) {

		return lista.get(key);
	}

	public static int IznajmiKnjigu(Clan clan, Knjiga knjiga, int key) {

		if (clan.getMojeKnjige().size() < Clan.MAKSIMALAN_BROJ_KNJIGA && knjiga.getIznajmljena() == false) {
			clan.getMojeKnjige().put(key, knjiga);
			knjiga.setImeClana(clan.getIme());
			knjiga.setIznajmljena(true);
			return 0;
		} else if (clan.getMojeKnjige().size() >= Clan.MAKSIMALAN_BROJ_KNJIGA) {
			return 1;
		}

		else {
			return 2;
		}

	}

	public static boolean vratiKnjigu(Map<Integer, Knjiga> listaKnjiga, int key) {

		listaKnjiga.get(key).setIznajmljena(false);
		listaKnjiga.remove(key);

		return true;

	}

	public static boolean upisiKnjigeUFile(Map<Integer, Knjiga> listaKnjiga) throws FileNotFoundException {
		File file = new File("SpisakKnjiga.txt");

		PrintWriter pw = new PrintWriter(file);
		for (int i = 0; i < listaKnjiga.size(); i++) {
			int key = (int) listaKnjiga.keySet().toArray()[i];
			pw.print(key);
			String nazivKnjige = listaKnjiga.get(key).getIme();
			pw.println(nazivKnjige);
		}
		pw.close();

		return true;
	}
	
	public static boolean upisiClanoveUFile(Map<Integer, Clan> listaClanova) throws FileNotFoundException {
		File file = new File("SpisakClanova.txt");

		PrintWriter pw = new PrintWriter(file);
		for (int i = 0; i < listaClanova.size(); i++) {
			int key = (int) listaClanova.keySet().toArray()[i];
			pw.print(key);
			String nazivClana = listaClanova.get(key).getIme();
			pw.println(nazivClana);
		}
		pw.close();

		return true;
	}
	
	public static boolean procitajClanoveizFile(Map<Integer, Clan> listaClanova) throws FileNotFoundException{
		File file = new File("SpisakClanova.txt");
		
		Scanner read = new Scanner(file);
		
		while(read.hasNext()) {
			int key = read.nextInt();
			System.out.print(key);
			String ime = read.next();
			System.out.println(ime);
		}
		
		read.close();
		
		return true;
		
		
	}
	
	public static boolean procitajKnjigeizFile(Map<Integer, Knjiga> listaKnjiga) throws FileNotFoundException{
		File file = new File("SpisakKnjiga.txt");
		
		Scanner read = new Scanner(file);
		
		while(read.hasNext()) {
			int key = read.nextInt();
			System.out.print(key);
			String ime = read.next();
			System.out.println(ime);
		}
		
		read.close();
		
		return true;
		
		
	}
	

}
