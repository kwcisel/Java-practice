package zadania07;

public class Zad4 {

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
		for(int i = 0; i < tab.length - 2; i++){
			if(tab[i] == 1 && tab[i+1] == 0 && tab[i+2] == 1){
				counter++;
			}	
		}
		if(counter > 0)
			System.out.println("Sekwencja 101 wystepuje " + counter + " razy.");
		else
			System.out.println("Nie wystepuje sekwencja 101.");
	}

}
