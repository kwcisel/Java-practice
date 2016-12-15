package zadania09;

// Utwórz program losuj¹cy 10 par liczb ca³kowitych z przedzia³u 0 - 100 i wyliczaj¹cy
// najwiêkszy wspólny dzielnik ka¿dej z par. Zadanie zrealizuj tworz¹c funkcjê
// implementuj¹c¹ algorytm Euklidesa.

public class Zad3 {

	public static int randomInt(){
		return(int)(Math.random()*101);
	}
	
	public static int euklides(int wrt1, int wrt2){
		while(wrt1 != wrt2){
			if(wrt1 > wrt2){
				wrt1 -= wrt2;
			} else {
				wrt2 -= wrt1;
			}
		}
		return wrt1;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
			int wrt1 = randomInt();
			int wrt2 = randomInt();
			int nwd = euklides(wrt1, wrt2);
			System.out.println("NWD(" + wrt1 + "," + wrt2 + ")=" + nwd);
		}
	}

}
