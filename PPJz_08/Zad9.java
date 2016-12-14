package zadania08;

public class Zad9 {

	public static int fibonacci(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;

		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(5));
	}

}
