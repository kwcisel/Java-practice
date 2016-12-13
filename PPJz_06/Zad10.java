
public class Zad10 {

	public static void main(String[] args) {
		int[][] tab = new int[5][5];

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

		int sumRow = 0;
		int sumCol = 0;
		int[] sumsRow = new int[tab.length];
		int[] sumsCol = new int[tab.length];
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				sumRow = sumRow + tab[i][j];
				sumCol = sumCol + tab[j][i];
			}
			sumsRow[i] = sumRow;
			sumsCol[i] = sumCol;
			sumRow = 0;
			sumCol = 0;
		}

		for (int i = 0; i < sumsRow.length; i++) {
			System.out.print(sumsRow[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < sumsRow.length; i++) {
			System.out.print(sumsCol[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < sumsRow.length; i++) {
			for (int j = 0; j < sumsCol.length; j++) {
				if (sumsRow[i] == sumsCol[j]) {
					System.out.println("Suma wiersza " + i + " jest równa sumie kolumny " + j + " i wynosi " + sumsRow[i] + ".");
				}
			}
		}

	}

}
