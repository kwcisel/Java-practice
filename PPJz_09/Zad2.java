package zadania09;

//Utw�rz metod� isDiagonal sprawdzaj�c� czy dostarczona jako argument
//dwuwymiarowa tablica:
//� ma tak� sam� ilo�� wierszy i kolumn,
//� spe�nia warunek �e aij = 0 dla i != j gdzie i i j s� indeksami tej tablicy.
//Metoda zwr�ci rezultat w postaci warto�ci logicznej true tylko gdy oba powy�sze s�
//spe�nione.

public class Zad2 {

	public static boolean isDiagonal(int[][] tab){
		for(int i = 0; i < tab.length; i++){
			if(tab[i].length != tab.length){
				return false;
			}
		}
		
		for(int i = 0; i < tab.length; i++){
			for(int j = 0; j < tab[i].length; j++){
				if(tab[i][j] != 0 && i != j){
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[][] tab1 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		int[][] tab2 = {
				{1, 0, 0},
				{0, 2, 0},
				{0, 0, 3}
		};
		int[][] tab3 = {
				{1, 2, 3, 4},
				{1, 2},
				{1, 2, 3, 4, 5}
		};
		System.out.println(isDiagonal(tab1));
		System.out.println(isDiagonal(tab2));
		System.out.println(isDiagonal(tab3));
	}

}
