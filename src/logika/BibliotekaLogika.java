package logika;
import java.util.*;
import entiteti.Clan;
public class BibliotekaLogika {

	
	public static boolean registracija(LinkedHashMap<Integer, Clan> listaClanova, Clan clanKojiSeRegistruje) {
		
		    
			Integer key = 0;
			return listaClanova.put(key, clanKojiSeRegistruje);
			
			
		
	}
	

}
