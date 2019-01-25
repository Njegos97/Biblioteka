package logika;
import java.util.*;
import BibliotekaInterface.InterfaceZaBiblioteku;
import entiteti.Clan;
import entiteti.Knjiga;
public class BibliotekaLogika implements InterfaceZaBiblioteku {
	//nacin 1
	 //static InterfaceZaBiblioteku generisiKey = new BibliotekaLogika();
	
	public static boolean registracija(LinkedHashMap<Integer, Clan> listaClanova, Clan clanKojiSeRegistruje) {
	        
		    Map lista = listaClanova;
	        //nacin 2:
		    InterfaceZaBiblioteku generisiKey = new BibliotekaLogika();
		    int key = generisiKey.generisiKey(lista);
		    
		    
		   //Nacin 3:
		   //BibliotekaLogika key = null;
		   //key.generisiKey(lista);
		
		    listaClanova.put(key, clanKojiSeRegistruje);
		   
		    return true;
			}

	@Override
	public int generisiKey(Map<Integer, Object> lista) {
		int key = lista.size() + 1;
		for(int i = 0; i < lista.size(); i++) {
	        if(lista.containsKey(key)) {
	        	key += 1;
	        	/* i = 0;          ZA SAD RADI, POKUSAJ OVO U SLUCAJU NEKE GRESKE 
	        	   prodji opet kroz listu ako bi opet bila knjiga sa istim id-om */
	        	 
	        }
		}
	  
	   
	   return key;
	}

	@Override
	public boolean izbrisi(Map<Integer, Object> lista, int key) {
		// TODO Auto-generated method stub
		
		
		return false;
	}

	@Override
	public Object pretraziListu(Map<Integer, Object> lista, int key) {
		
		return lista.get(key);
		}
	
	
	

}
