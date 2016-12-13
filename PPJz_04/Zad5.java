package zadania;

public class Zad5 {

	public static void main(String[] args) {

		double wrt = -15.0;
		System.out.println(wrt);
		
		if (wrt > -3 && wrt < 0 || wrt > 5 && wrt < 10) {
			System.out.println("AC");
		} else if (wrt >= 0) {
			System.out.println("C");
		} else if (wrt >= -4 && wrt <= -3) {
			System.out.println("ABC");
		} else if (wrt > -15 && wrt <= -13 || wrt > -5 && wrt < -4) {
			System.out.println("AB");
		} else if (wrt > -13 && wrt <= -10) {
			System.out.println("A");
		} else if (wrt > -10 && wrt <= -8) {
			System.out.println("Zbior pusty.");
		} else {
			System.out.println("B");
		}
	}

}
