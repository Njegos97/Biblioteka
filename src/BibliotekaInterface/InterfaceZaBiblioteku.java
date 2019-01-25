package BibliotekaInterface;


import java.util.*;

import entiteti.Clan;

public interface InterfaceZaBiblioteku  {

	public abstract int generisiKey(Map<Integer, Object> lista);
	
	public abstract boolean izbrisi(Map<Integer, Object> lista);
	
	public abstract Object pretraziListu(Map<Integer, Object> lista);

	
		
	
	
}
