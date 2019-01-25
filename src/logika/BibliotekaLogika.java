package logika;
import java.util.*;
import BibliotekaInterface.InterfaceZaBiblioteku;
import entiteti.Clan;
public class BibliotekaLogika implements InterfaceZaBiblioteku {

	
	public static boolean registracija(LinkedHashMap<Integer, Clan> listaClanova, Clan clanKojiSeRegistruje) {
		
		    BibliotekaLogika.
			Integer key =0 ;
		    listaClanova.put(key, clanKojiSeRegistruje);
		   
		    return true;
			}

	@Override
	public int generisiKey(Map<Integer, Object> lista) {
		int a = 0;
		return 0;
	}

	@Override
	public boolean izbrisi(Map<Integer, Object> lista) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object pretraziListu(Map<Integer, Object> lista) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
