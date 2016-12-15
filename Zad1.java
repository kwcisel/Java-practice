package zadania09;

public class Zad1 {

	public static void printSquare(int size, char startWith){
		char[] tab = {'x', 'o'};
		int startIndex = startWith == 'x' ? 0 : 1;
		for(int i = 0; i < size; i++){
			if(size % 2 == 0 & i > 0){
				startIndex++;
			}
			for(int j = 0; j < size; j++){
				System.out.print(tab[startIndex++ % 2]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printSquare(15, 'x');
		printSquare(10, 'o');

	}

}
