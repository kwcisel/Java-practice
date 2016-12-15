package Zad5;

public class LiczbaZespolona {

	private double rzecz, uroj;
	
	public LiczbaZespolona(double rzecz, double uroj){
		this.rzecz = rzecz;
		this.uroj = uroj;
	}
	
	public void dodaj(LiczbaZespolona wrt){
		this.rzecz += wrt.rzecz;
		this.uroj += wrt.uroj;
	}
	
	public void odejmij(LiczbaZespolona wrt){
		this.rzecz -= wrt.rzecz;
		this.uroj -= wrt.uroj;
	}
	
	public void pomnoz(LiczbaZespolona wrt){
		this.rzecz = rzecz * wrt.rzecz;
		this.uroj = uroj * wrt.uroj;
	}
	
	public void zwieksz(){
		this.rzecz++;
	}
	
	public void wyswietl(){
		System.out.println(this.rzecz + " + " + this.uroj + "i");
	}
	
	public static void main(String[] args){
		LiczbaZespolona l1 = new LiczbaZespolona(2.0, 6.0);
		l1.dodaj(new LiczbaZespolona(5.0, 6.0));
		l1.odejmij(new LiczbaZespolona(2.0, 1.0));
		l1.pomnoz(new LiczbaZespolona(4.4, 3.14));
		l1.zwieksz();
		l1.wyswietl();
	}
	
}
