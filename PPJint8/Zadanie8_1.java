		
class Zadanie8_1{
	
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
	
	}