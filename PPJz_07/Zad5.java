package zadania07;

public class Zad5 {

	public static void main(String[] args) {
		String zdanie = new String("Ala ma kota");
		char[] tab = zdanie.toCharArray();
		
		System.out.println("Oryginalna:");
		for(int i = 0; i < tab.length; i++){
			System.out.print(tab[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < tab.length; i++){
		tab[i] = (char) (tab[i] + i);
		}
		
		System.out.println("Zaszyfrowana:");
		for(int i = 0; i < tab.length; i++){
			System.out.print(tab[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < tab.length; i++){
			tab[i] = (char)(tab[i] - i);
		}
		
		System.out.println("Odszyfrowana:");
		for(int i = 0; i < tab.length; i++){
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}

}
