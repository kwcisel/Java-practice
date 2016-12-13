package zadania;

public class Zad1 {

	public static void main(String[] args) {
		int[] tab = new int[10];
		
		for(int i = 0; i < tab.length; i++){
			int random = (int)(Math.random()*2);
			tab[i] = random;
		}
		
		for(int i = 0; i < tab.length; i++){
			System.out.print(tab[i] + " ");
		}
		System.out.println();
		
		int counter = 0;
		for(int i = 0; i < tab.length; i++){
				if(tab[i] == 0)
				counter++;
		}
		System.out.println("W tablicy jest " + counter + " zer i " + (tab.length - counter) + " jedynek.");

	}

}
