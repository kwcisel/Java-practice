
public class Zad8 {

	public static void main(String[] args) {
		//w sam raz
		
		int x = 4;
		long y = x * 4 - x++;
		if (y < 10)
			System.out.println("za mało");
		else
			System.out.println("w sam raz");

	}

}
