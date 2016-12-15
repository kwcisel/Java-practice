package Zad4;

public class Osoba {

	public String imie, nazwisko;
	public int rokUrodzenia;
	
	public Osoba(String imie, String nazwisko, int rokUrodzenia){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rokUrodzenia = rokUrodzenia;
	}
	
	public void show(){
		System.out.println("Osoba[imie=" + imie + ", nazwisko=" + nazwisko + ", rok urodzenia=" + rokUrodzenia + "]");
	}

	public static void main(String[] args) {
		Osoba osoba = new Osoba("Jan", "Kowalski", 1992);
		osoba.show();
	}	
}
