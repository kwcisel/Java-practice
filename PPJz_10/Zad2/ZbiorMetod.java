package Zad2;

public class ZbiorMetod {

	public static void ustalWartosc(int wrt){
		System.out.println("Typ = int, wartosc = " + wrt);
		wrt++;
		System.out.println("Typ = int, wartosc = " + wrt);
	}
	
	public static void ustalWartosc(float wrt){
		System.out.println("Typ = float, wartosc = " + wrt);
		wrt++;
		System.out.println("Typ = float, wartosc = " + wrt);
	}
	
	public void ustalWartosc(Liczba wrt){
		System.out.println("Typ = Liczba, wartosc = " + wrt.wrt);
		wrt++;
		System.out.println("Typ = Liczba, wartosc = " + wrt.wrt);
	}
	
}
