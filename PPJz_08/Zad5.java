package zadania08;

public class Zad5 {

	public static void main(String[] args) {
		int[][] tab = new int[10][10];

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				int random = (int) (Math.random() * 11);
				tab[i][j] = random;
			}
		}
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print(tab[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				for (int k = j + 1; k < tab[i].length; k++) {
					if (tab[i][k] < tab[i][j]) {
						int tmp = tab[i][j];
						tab[i][j] = tab[i][k];
						tab[i][k] = tmp;
					}
				}
			}
		}

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print(tab[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
