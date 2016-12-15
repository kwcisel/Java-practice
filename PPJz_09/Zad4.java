package zadania09;

//Przygotuj dwuwymiarow� tablic� zmiennych typu char zawieraj�c� wylosowane
//znaki z przedzia�u �a� do �z�. Nast�pnie napisz metod� licz�c� ile wyraz�w
//�ala� wyst�pi�o w tablicy dostarczonej jako argument.

public class Zad4 {

	public static char[][] charTab(int size){
		char[][] tab = new char[size][size];
		for(int i = 0; i < tab.length; i++){
			for(int j = 0; j < tab[i].length; j++){
				tab[i][j] = randomChar();
			}
		}
		return tab;
	}
	
	public static char randomChar(){
		char c = (char)(Math.random()*('z'-'a'+1)+'a');
		return c;
	}
	
	public static int countAla(char[][] tab){
		int counter = 0;
		for(int i = 0; i < tab.length; i++){
			for(int j = 0; j < tab[i].length-2; j++){
				if(tab[i][j] == 'a' && tab[i][j+1] == 'l' && tab[i][j+2] == 'a'){
					counter++;
				}
			}
		}
		return counter;
	}
	
	public static void print(char[][] tab){
		for(int i = 0; i < tab.length; i++){
			for(int j = 0; j < tab[i].length; j++){
				System.out.print(tab[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		char[][] tab = charTab(20);
		print(tab);
		System.out.println("Slowo ala wystepuje " + countAla(tab) + " razy.");
	}

}
