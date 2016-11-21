
public class Zad2 {

	public static void main(String[] args) {

		char znak = 'a';
		int wrt = 6;
		float fl = 10.0f;
		double db = 13.4;
		byte bt = 2;

		znak = (char) (znak + wrt);
		wrt = wrt + znak;
		fl = (float) (fl + db);
		bt = (byte) (bt + wrt);
		
		System.out.println(znak);
		System.out.println(wrt);
		System.out.println(fl);
		System.out.println(bt);
	}

}
