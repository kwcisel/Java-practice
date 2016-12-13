
public class Zad8 {

	public static void main(String[] args) {
		int[][] tab = { 
				{ 1, 0, 0 }, 
				{ 0, 1, 0 }, 
				{ 0, 0, 1 } 
			};

		int isDiagonal = 0;

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (i != j && tab[i][j] == 0){
					isDiagonal++;
				}
			}
		}
		if (isDiagonal == tab.length*tab.length-tab.length)
			System.out.println("Tablica jest diagonalna.");
		else
			System.out.println("Tablica nie jest diagonalna.");
	}

}
