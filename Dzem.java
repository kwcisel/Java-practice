package zadania09;

public class Dzem {

	private String smak;
	private double waga;
	
	public Dzem(String smak, double waga){
		this.smak = smak;
		this.waga = waga;
	}
	
	public Dzem(double waga){
		this("No name", waga);
	}
	
	public Dzem(String smak){
		this(smak, 100.0);
	}
	
	public void show(){
		System.out.println("Dzem [" + smak + "," + waga + "]");
	}
	
	public static void main(String[] args){
		Dzem dzem1 = new Dzem("Ananas", 250.0);
		Dzem dzem2 = new Dzem(150.0);
		Dzem dzem3 = new Dzem("Kiwi");
		
		dzem1.show();
		dzem2.show();
		dzem3.show();
	}
}
