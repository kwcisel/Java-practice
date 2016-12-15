package zadania08;

public class Zad6 {

	public static void main(String[] args) {
		
		char[][] tab = {
			    "o−−−−−−−−−".toCharArray(),       
			    "xxxxxxxxx−".toCharArray(),      
			    "−−−−−−−−x−".toCharArray(),       
			    "−xxxxxx−x−".toCharArray(),       
			    "−xe−−−−−x−".toCharArray(),       
			    "−xxxxxxxx−".toCharArray(),      
			    "−−−−−−−−−−".toCharArray()        
	        } ; 
		
		int pozycjaX = 0 , pozycjaY = 0;
		
		while(tab[pozycjaY][pozycjaX] != 'e'){
			tab[pozycjaY][pozycjaX] = 'o';
			
			for(int i = 0; i < tab.length; i++){
				for(int j = 0; j < tab[i].length; j++){
					System.out.print(tab[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			
			if(pozycjaX + 1 < tab[pozycjaY].length){
				char field = tab[pozycjaY][pozycjaX+1];
				if(field != 'x' && field != 'o'){
					pozycjaX = pozycjaX + 1;
					continue;
				}
			}
			
			if(pozycjaX - 1 >= 0){
				char field = tab[pozycjaY][pozycjaX-1];
				if(field != 'x' && field != 'o'){
					pozycjaX = pozycjaX - 1;
					continue;
				}
			}
			
			if(pozycjaY + 1 < tab.length){
				char field = tab[pozycjaY+1][pozycjaX];
				if(field != 'x' && field != 'o'){
					pozycjaY = pozycjaY + 1;
					continue;
				}
			}
			
			if(pozycjaY - 1 >= 0){
				char field = tab[pozycjaY-1][pozycjaX];
				if(field != 'x' && field != 'o'){
					pozycjaY = pozycjaY - 1;
					continue;
				}
			}
		}
	}

}
