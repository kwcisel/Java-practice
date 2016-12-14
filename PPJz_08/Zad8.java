package zadania08;

public class Zad8 {

	public static boolean czyPalindrom(char[] tab) {
		int counter = 0;
		for (int i = 0; i < tab.length/2+1; i++) {
			if (tab[i] == tab[tab.length - 1 - i]) {
				counter++;
			}
		}
		if(counter == tab.length/2+1)
			return true;
		return false;
	}

	public static void main(String[] args) {
		String slowo1 = new String("kajak");
		char[] tab1 = slowo1.toCharArray();

		String slowo2 = new String("rower");
		char[] tab2 = slowo2.toCharArray();

		System.out.println(czyPalindrom(tab1));
		System.out.println(czyPalindrom(tab2));
	}

}
