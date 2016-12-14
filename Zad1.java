package zadania08;

public class Zad1 {

	public static void main(String[] args) {
		int[][] tab = new int[8][8];

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

		int[] diags = new int[tab.length * 2];

		for (int i = 0; i < tab.length; i++) {
			diags[i] = tab[i][i];
		}

		for (int i = 0; i < tab.length; i++) {
			diags[tab.length + i] = tab[i][tab.length - 1 - i];
		}

		for (int i = 0; i < diags.length; i++) {
			System.out.print(diags[i] + " ");
		}
		System.out.println();

		int[] values = new int[11];
		for (int i = 0; i < diags.length; i++) {
			int wrt = diags[i];
			values[wrt]++;
		}

		for (int i = 0; i < values.length; i++) {
			System.out.println("values[" + i + "] = " + values[i]);
		}
		System.out.println();

		boolean res = false;
		int value = -1;

		for (int i = 0; i < values.length; i++) {
			if (values[i] >= 3) {
				res = true;
				value = i;
				break;
			}
		}
		
		if(res)
			System.out.println("Wartosc " + value + " wystepuje przynajmniej 3 razy.");
		else
			System.out.println("Zadna wartosc nie wystepuje przynajmniej 3 razy.");
	}
}
