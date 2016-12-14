package zadania08;

public class Zad2 {

	public static void main(String[] args) {
		double[] tab1 = new double[3];
		double[] tab2 = new double[3];
		
		for(int i = 0; i < tab1.length; i++){
			double random1 = Math.random()*5;
			double random2 = Math.random()*5;
			tab1[i] = random1;
			tab2[i] = random2;
		}
		
		for(int i = 0; i < tab1.length; i++){
			System.out.print(tab1[i] + "\t");
		}
		System.out.println();

		for(int i = 0; i < tab2.length; i++){
			System.out.print(tab2[i] + "\t");
		}
		System.out.println();
		
		double[] resTab = new double[3];
		for(int i = 0; i < resTab.length; i++){
			resTab[i] = tab1[i] + tab2[tab2.length-1];
		}
		
		for(int i = 0; i < resTab.length; i++){
			System.out.print(resTab[i] + "\t");
		}
		System.out.println();
	}

}
