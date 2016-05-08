
class Zadanie8_2{
	
	public static void main(String[] args){
		//Przykład 1
		Walec figury1 = new Walec(5, 2); //domyślna konwersja
			figury1.show();
		//Przykład 2	
		Walec figury2 = new Walec(2.5, 2.5);
			figury2.show();	
	}
}
	
	class Walec{
		double r, h;
	
		public Walec(double r, double h){
		this.r = r;
		this.h = h;
		}	
		
		public void show(){
		double pp = Math.PI * Math.pow(r, 2);
		System.out.println("Pole powierzchni podstawy:" + String.format("%.2f",pp));
		System.out.println("Objetosc:" + String.format("%.2f",(pp*h)));
		}
	
	}