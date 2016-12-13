package zadania;

public class Zad5 {

	public static void main(String[] args) {

		int tab[] = { 1, 0, 0, 0, 2, 0, 0, 0, 3 };

		for (int i = 0; i < tab.length; i += 3) {
			for (int j = i; j < i + 3; j++) {
				System.out.print(tab[j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = tab.length - 3; i >= 0; i -= 3) {
			for (int j = i; j <= i + 2; j++) {
				System.out.print(tab[j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = tab.length - 1; i >= 0; i -= 3){
			for(int j = i; j > i - 3; j--){
				System.out.print(tab[j]);
			}
			System.out.println();
		}
	}

}
