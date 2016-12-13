package zadania;

public class Zad7 {

	public static void main(String[] args) {
		byte a = 40, b = 50;
		//byte suma = (byte) a + b;
		//nie skompiluje sie, brak nawiasu
		
		byte suma = (byte)(a + b);
		System.out.println(suma);

	}

}
