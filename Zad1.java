package zadania;

public class Zad1 {

	public static void main(String[] args) {
		boolean czyPada = true;
		boolean czySwieciSlonce = true;
		
		if(czyPada && czySwieciSlonce){
			System.out.println("tecza");
		} else if(!czyPada && !czySwieciSlonce){
			System.out.println("pochmurno");
		} else if(czyPada && !czySwieciSlonce){
			System.out.println("plucha");
		} else{
			System.out.println("slonecznie");
			
		}
		
		int wrt;
		if(czyPada)
			wrt = 5;
		else
			wrt = 8;
		
		System.out.println(wrt);
	}

}
