
public class Zad7 {

	public static void main(String[] args) {

		int licznik = 0;
		int liczba = 2;
		int x = 2;

		while (licznik < 10) {
			if (liczba % x == 0) {
				if (liczba == x) {
					System.out.println("Liczba " + liczba + " jest pierwsza.");
					licznik++;
					liczba++;
				} else {
					liczba++;
				}
			} else {
				x++;
			}
		}
	}
}
