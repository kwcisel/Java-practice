
public class Zad9 {

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
		
		int[] diags = new int[tab.length * 2];
		for (int i = 0; i < tab.length; i++) {
			diags[i] = tab[i][i];
		}
		for (int i = 0; i < tab.length; i++) {
			diags[i + tab.length] = tab[i][tab.length - 1 - i];
		}
		for (int i = 0; i < diags.length; i++) {
			System.out.print(diags[i] + " ");
		}
		System.out.println();
		
		int values[] = new int[11];
		for(int i = 0; i < diags.length; i++){
			int wrt = diags[i];
			values[wrt]++;
		}
		
		for(int i = 0; i < values.length; i++){
			System.out.println("Wartosc " + i + " wystepuje " + values[i] + " razy.");
		}
		System.out.println();
		
		boolean res = false;
		int wartosc = -1;
		for(int i = 0; i < values.length; i++){
			if(values[i] >= 2){
				res = true;
				wartosc = i;
				break;
			}
				
		}
		if(res){
			System.out.println("Wartosc " + wartosc + " wystepuje przynajmniej 2 razy.");
		} else {
			System.out.println("Zadna wartosc nie wystepuje przynajmniej 2 razy.");
		}
	}

}
