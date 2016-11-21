package zadania;

public class Walec {

	public double promien;
	public double wysokosc;

	public Walec(double promien, double wysokosc) {
		this.promien = promien;
		this.wysokosc = wysokosc;
	}

	public void show() {

		double polePodst = 3.14 * promien * promien;
		double objWalec = polePodst * wysokosc;

		System.out.println("Pole podstawy walca to: " + polePodst);
		System.out.println("Objetosc walca to: " + objWalec);
	}

	public double getPromien() {

		return promien;
	}
	
	public double getWysokosc(){
		
		return wysokosc;
	}

}
