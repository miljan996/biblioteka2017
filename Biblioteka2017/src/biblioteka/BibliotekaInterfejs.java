package biblioteka;

import java.util.LinkedList;

public interface BibliotekaInterfejs {
	
	public void dodajKnjigu(Knjiga k);
	public void obrisiKnjigu(Knjiga k);
	public LinkedList<Knjiga> vratiSveKnjige(Knjiga k);
	public LinkedList<Knjiga> pronadjiKnjigu(Autor a, long isbn, String naslov, String izdavac);

	

}
