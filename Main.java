package zadania;

//import library.*;

public class Main {

	public static void main(String[] args) {
		
		Kwadrat kwadrat1 = new Kwadrat(5);
		Kwadrat kwadrat2 = new Kwadrat(8);
		Kwadrat kwadrat3 = new Kwadrat(10);
		
		kwadrat1.show();
		kwadrat2.show();
		kwadrat3.show();
		
		System.out.println("-------------------------------------------");
		
		Walec walec1 = new Walec(2.4, 6.3);
		Walec walec2 = new Walec(3.1, 4.2);
		Walec walec3 = new Walec(5.8, 10.1);
		
		walec1.show();
		walec2.show();
		walec3.show();
		
		System.out.println("-------------------------------------------");
		
		Walec walec4 = (new Kwadrat(18)).przygotujWalec();
		walec4.show();
		
		System.out.println("-------------------------------------------");
		
		KulaW kula1 = new KulaW(kwadrat1);
		KulaW kula2 = new KulaW(walec3);
		
		kula1.show();
		kula2.show();
	}

}
