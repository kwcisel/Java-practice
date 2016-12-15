package Zad2;

public class Main {

	public static void main(String[] args) {
		
		int wrt1 = 5;
		float wrt2 = 2.1f;
		char wrt3 = 'c';
		byte wrt4 = 2;
		Liczba wrt5 = new Liczba();
		wrt5.przypiszWartosc(8);
		
		ZbiorMetod.ustalWartosc(wrt1);
		ZbiorMetod.ustalWartosc(wrt2);
		ZbiorMetod.ustalWartosc(wrt3);
		ZbiorMetod.ustalWartosc(wrt4);
		ZbiorMetod.ustalWartosc(wrt5.wrt);

	}

}
