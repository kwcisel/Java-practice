package zadania;

public class Zad2 {

	public static void main(String[] args) {
		double sqTwo = Math.sqrt(2);

		double pot = Math.pow(sqTwo, 2) - 2;

		if (pot == 0)
			System.out.println("Wynik dzialania to 0.");
		System.out.println("Wynik dzialania to " + pot);
	}

}
