
public class Zad4 {

	public static void main(String[] args) {

		double[] tab = new double[10];
		
		for(int i = 0; i < tab.length; i++){
			double random = Math.random()*11;
			tab[i] = random;
		}
		
		for(int i = 0; i < tab.length; i++){
			System.out.println(tab[i]);
		}
		System.out.println();
		
		for(int i = 0; i < tab.length; i+=2){
			System.out.println(tab[i]);
		}
		System.out.println();
		
		for(int i = 0; i < tab.length; i++){
			if((int)tab[i]%2 != 0)
				System.out.println(tab[i]);
		}

	}

}
