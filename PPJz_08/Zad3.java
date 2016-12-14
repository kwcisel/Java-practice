package zadania08;

import java.util.Arrays;

public class Zad3 {

	public static void main(String[] args) {
		char[][] tab = { 
				{ 'S', 'a', 'm', 's', 'u', 'n', 'g' }, 
				{ 'N', 'o', 'k', 'i', 'a' },
				{ 'A', 'p', 'p', 'l', 'e' }, 
				{ 'B', 'l', 'a', 'c', 'k', 'B', 'e', 'r', 'r', 'y' },
				{ 'A', 'l', 'c', 'a', 't', 'e', 'l' }, 
				{ 'S', 'o', 'n', 'y' }, 
				{ 'J', 'o', 'l', 'l', 'a' } 
			};
		
		int[] czySpelnia = new int[tab.length];
		
		// czy przynajmniej dwie takie same litery
		slowoLoop: for(int s = 0; s < tab.length; s++){
			char[] slowo = tab[s];
			
			for(int i = 0; i < slowo.length-1; i++){
				char c1 = Character.toLowerCase(slowo[i]);
				for(int j = i + 1; j < slowo.length; j++){
					char c2 = Character.toLowerCase(slowo[j]);
					if(c1 == c2){
						System.out.println("Slowo " + String.valueOf(slowo) + " zawiera co najmniej 2 takie same litery.");
						czySpelnia[s]++;
						continue slowoLoop;
					}
				}
			}
		}
		
		// czy suma wszystkich znakow w slowie wieksza niz 255
		for(int s = 0; s < tab.length; s++){
			char[] slowo = tab[s];
			int counter = 0;
			for(int i = 0; i < slowo.length - 1; i++){
				counter += slowo[i];
			}
			if(counter > 0xFF){
				System.out.println("Suma slowa " + String.valueOf(slowo) + " wynosi " + counter	);
				czySpelnia[s]++;
			}
		}
		
		// czy zawiera przynajmniej jeden znak 'i'
		slowoLoop: for(int s = 0; s < tab.length; s++){
			char[] slowo = tab[s];
			for(int i = 0; i < slowo.length; i++){
				if(slowo[i] == 'i'){
					System.out.println("Slowo " + String.valueOf(slowo) + " zawiera przynajmniej 1 znak 'i'.");
					czySpelnia[s]++;
					continue slowoLoop;
				}
			}
		}
		
		// czy zawiera przynajmniej dwa takie same znaki
		slowoLoop: for(int s = 0; s < tab.length; s++){
			char[] slowo = tab[s];
			for(int i = 0; i < slowo.length - 1; i++){
				for(int j = i + 1; j < slowo.length; j++){
					if(slowo[i] == slowo[j]){
						System.out.println("Slowo " + String.valueOf(slowo) + " zawiera przynajmniej 2 takie same znaki");
						czySpelnia[s]++;
						continue slowoLoop;
					}
				}
			}
		}
		
		for(int i = 0; i < czySpelnia.length; i++){
			if(czySpelnia[i] > 2){
				System.out.println("Slowo " + Arrays.toString(tab[i]) + " spelnia " + czySpelnia[i] + " warunki.");
			}
				
		}
	}

}
