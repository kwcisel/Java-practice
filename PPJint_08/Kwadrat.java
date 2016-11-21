
public class Kwadrat {

	public double bok;
	
	public Kwadrat(double bok){
		this.bok = bok;
	}
	
	public void show(){
		
		double pole = bok * bok;
		double obj = pole * bok;
		System.out.println("Pole powierzchni kwadratu to: " + pole);
		System.out.println("Objetosc kwadratu to: " + obj);
	}
	
	public Walec przygotujWalec(){
		
		return new Walec(bok / 2, bok);
	}
	
	public double getBok(){
		
		return bok;
	}

}
