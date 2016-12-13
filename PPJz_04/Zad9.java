package zadania;

public class Zad9 {

	public static void main(String[] args) {
		//true, 20, false
		
		boolean x = true, z = true;
		int y = 20;
		x = (y != 10) ^ (z = false);
		System.out.println(x + ", " + y + ", " + z);

	}

}
