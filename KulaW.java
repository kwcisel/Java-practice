package zadania;

public class KulaW {
	
	public double promien;
	
	public KulaW(Kwadrat kwadrat){
		
		promien = kwadrat.getBok()/2;
	}
	
	public KulaW(Walec walec){
		
		promien = walec.getPromien() > walec.getWysokosc() ? walec.getWysokosc() / 2 : walec.getPromien();
	}
	
	public void show(){
		
		System.out.println("Promien kuli = " + promien);
	}

}
