package zadania07;

public class Zad6 {

	public static void main(String[] args) {
		
		int size1 = (int)(Math.random()*11);
		int size2 = (int)(Math.random()*11);
		int size3 = (int)(Math.random()*11);
		
		int[] tab1 = new int[size1];
		int[] tab2 = new int[size2];
		int[] tab3 = new int[size3];
		
		for(int i = 0; i < tab1.length; i++){
			int random = (int)(Math.random()*11);
			tab1[i] = random;
		}
		for(int i = 0; i < tab2.length; i++){
			int random = (int)(Math.random()*11);
			tab2[i] = random;
		}
		for(int i = 0; i < tab3.length; i++){
			int random = (int)(Math.random()*11);
			tab3[i] = random;
		}
		
		int[][] tabs = {tab1, tab2, tab3};
		
		for(int i = 0; i < tabs.length; i++){
			for(int j = 0; j < tabs[i].length; j++){
				System.out.print(tabs[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
