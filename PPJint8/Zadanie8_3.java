		
class Zadanie8_3{
	
	public static void main(String[] args){
		//Przykład 1
		Kwadrat figury1 = new Kwadrat(5); //domyślna konwersja
			figury1.show();
		//Przykład 2	
		Kwadrat figury2 = new Kwadrat(2.5);
			figury2.show();	
	}
}
	
	class Kwadrat{
		double bok;
	
		public Kwadrat(double bok){
		this.bok = bok;
		}	
		
		public void show(){
		double pow = bok * bok;
		System.out.println("Powierzchnia:" + String.format("%.2f",pow));
		System.out.println("Objetosc:" + String.format("%.2f",(pow*bok)));
		}
	
		public Walec przygotujWalec(){
		Walec walec = new Walec(bok/2, bok);
		return walec;
		}
	}
	
	class Walec{
		double r, h;
	
		public Walec(double r, double h){
		this.r = r;
		this.h = h;
		}	
		
		public void showWalec(){
		double pp = Math.PI * Math.pow(r, 2);
		System.out.println("Pole powierzchni podstawy:" + String.format("%.2f",pp));
		System.out.println("Objetosc:" + String.format("%.2f",(pp*h)));
		}
	
	}