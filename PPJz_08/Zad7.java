package zadania08;

public class Zad7 {

	static void myMethod(int arg){
		arg++;
		System.out.println(arg);
	}
	
	static void myMethod(double arg){
		arg--;
		System.out.println(arg);
	}
	
	public static void main(String[] args) {
		char arg = 'a';
		System.out.println((int)arg);
		System.out.println((double)arg);
		myMethod((int)arg);
		myMethod((double)arg);
	}

}
