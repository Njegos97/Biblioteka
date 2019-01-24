package entiteti;

import java.util.ArrayList;

public class Clan {
	
	final public static int MAKSIMALAN_BROJ_KNJIGA = 3;
	
	private String ime;
	private String prezime;
	private int id; 
    private ArrayList<Knjiga> mojeKnjige = new ArrayList<>();
	
	//Konstruktor
	public Clan() {
		
	}
	
	public Clan(String ime, String prezime, int id) {
		this.ime = ime;
		this.prezime = prezime;
		this.id = id;
		
		}

	//getter
	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getId() {
		return id;
	}

	
	public ArrayList<Knjiga> getMojeKnjige() {
		return mojeKnjige;
	}

	
	//Setter
	public void setIme(String ime) {
		this.ime = ime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setMojeKnjige(ArrayList<Knjiga> mojeKnjige) {
		this.mojeKnjige = mojeKnjige;
	}

	

}
