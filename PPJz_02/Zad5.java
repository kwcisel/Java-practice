
public class Zad5 {

	public static void main(String[] args) {
		
		// typ logiczny
		boolean logMax = true;
		boolean logMin = false;

		// liczby calkowite
		byte calkBtMax = Byte.MAX_VALUE;
		byte calkBtMin = Byte.MIN_VALUE;
		short calkShMax = Short.MAX_VALUE;
		short calkShMin = Short.MIN_VALUE;
		int calkMax = Integer.MAX_VALUE;
		int calkMin = Integer.MIN_VALUE;
		long calkLgMax = Long.MAX_VALUE;
		long calkLgMin = Long.MIN_VALUE;

		// liczby rzeczywiste
		float rzeczFlMax = Float.MAX_VALUE;
		float rzeczFlMin = Float.MIN_VALUE;
		double rzeczDbMax = Double.MAX_VALUE;
		double rzeczDbMin = Double.MIN_VALUE;

		// typ znakow
		char znakMax = Character.MAX_VALUE;
		char znakMin = Character.MIN_VALUE;
		
		System.out.println("Boolean max value = " + logMax);
		System.out.println("Boolean min value = " + logMin);
		System.out.println("Byte max value = " + calkBtMax);
		System.out.println("Byte min value = " + calkBtMin);
		System.out.println("Short max value = " + calkShMax);
		System.out.println("Short min value = " + calkShMin);
		System.out.println("Integer max value = " + calkMax);
		System.out.println("Integer min value = " + calkMin);
		System.out.println("Long max value = " + calkLgMax);
		System.out.println("Long min value = " + calkLgMin);
		System.out.println("Float max value = " + rzeczFlMax);
		System.out.println("Float min value = " + rzeczFlMin);
		System.out.println("Double max value = " + rzeczDbMax);
		System.out.println("Double min value = " + rzeczDbMin);
		System.out.println("Character max value = " + (int)znakMax);
		System.out.println("Character min value = " + (int)znakMin);
	}

}
