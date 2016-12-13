package zadania;

public class Zad6 {

	public static void main(String[] args) {
		final int truskawkowy = 1;
		final int malinowy = 2;
		final int brzoskwiniowy = 3;
		final int agrestowy = 4;
		
		int sloik = (int)(Math.random()*11);
		System.out.println(sloik);
		
		switch(sloik){
		case 1:
			System.out.println("Dzem truskawkowy.");
			break;
		case 2:
			System.out.println("Dzem malinowy.");
			break;
		case 3:
			System.out.println("Dzem brzoskiwniowy");
			break;
		case 4:
			System.out.println("Dzem agrestowy.");
			break;
		default:
			System.out.println("Dzem o nieznanym smaku.");
		}

	}

}
