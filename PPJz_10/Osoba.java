package Zad3;

public class Osoba {

	public String imie, nazwisko;
	public int rokUrodzenia;

	public static void main(String[] args) {
		Osoba osoba = new Osoba();
		osoba.imie = "Jan";
		osoba.nazwisko = "Kowalski";
		osoba.rokUrodzenia = 1992;
		System.out.println("Osoba[imie=" + osoba.imie + ", nazwisko=" + osoba.nazwisko + ", rok urodzenia=" + osoba.rokUrodzenia + "]");
	}	
}
