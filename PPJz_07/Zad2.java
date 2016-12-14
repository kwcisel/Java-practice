package zadania07;

public class Zad2 {

	public static void main(String[] args) {
		String zdanie = new String("Ala ma kota");
		char[] tab = zdanie.toCharArray();
		
		int counter = 0;
		for(int i = 0; i < tab.length; i++){
			if(tab[i] == 'a'){
				counter++;
			}
		}
		System.out.println("Litera a wystepuje " + counter + " razy.");

	}

}
