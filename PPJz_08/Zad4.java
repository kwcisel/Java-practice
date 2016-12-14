package zadania08;

public class Zad4 {

	public static void main(String[] args) {
		int size = (int)(Math.random()*11);
		int[] tab = new int[size];
		
		for(int i = 0; i < tab.length; i++){
			int random = (int)(Math.random()*11);
			tab[i] = random;
		}
		
		for(int i = 0; i < tab.length; i++){
			System.out.print(tab[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < tab.length; i++){
			for(int j = i + 1; j < tab.length; j++){
				if(tab[j] < tab[i]){
					int tmp = tab[i];
					tab[i] = tab[j];
					tab[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < tab.length; i++){
			System.out.print(tab[i] + " ");
		}
		System.out.println();
		
		int[] resTab = new int[tab.length*2];
		
		for(int i = 0; i < tab.length; i++){
			resTab[i] = tab[i];
			resTab[tab.length+i] = tab[tab.length-1-i];
		}
		
		
		for(int i = 0; i < resTab.length; i++){
			System.out.print(resTab[i] + " ");
		}
		System.out.println();
	}

}
