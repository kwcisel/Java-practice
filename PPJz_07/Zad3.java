package zadania07;

public class Zad3 {

	public static void main(String[] args) {
		int[] tab = new int[20];

		for (int i = 0; i < 19; i++) {
			int random = (int) (Math.random() * 11);
			tab[i] = random;
		}
		for (int i = 0; i < tab.length; i++) {
			System.out.println("tab[" + i + "] = " + tab[i]);
		}
		System.out.println();

		for (int i = tab.length - 1; i > tab.length / 2; i--) {
			int tmp = tab[i];
			tab[i] = tab[i - 1];
			tab[i - 1] = tmp;
		}
		for (int i = 0; i < tab.length; i++) {
			System.out.println("tab[" + i + "] = " + tab[i]);
		}
		System.out.println();
		
		tab[tab.length/2] = -1;
		
		for (int i = 0; i < tab.length; i++) {
			System.out.println("tab[" + i + "] = " + tab[i]);
		}

	}
}
