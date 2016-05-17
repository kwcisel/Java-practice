		
class Zadanie9_2{
	
	public static void main(String[] args){
		
		Dzem dzem1 = new Dzem("Truskawka", 200.0);
			dzem1.show();
		
		Dzem dzem2 = new Dzem();
			dzem2.show();
			
		Dzem dzem3 = new Dzem();
			dzem3.show();
			
		Sloik sloik1 = new Sloik(dzem1);
			sloik1.show();
		
		Sloik sloik2 = new Sloik(dzem2);
			sloik2.show();
		
		Sloik sloik3 = new Sloik(dzem3);
			sloik3.show();
	}
}
	
	class Dzem{
		private String smak;
		private double waga;
	
		public Dzem(String smak, double waga){
			this.smak = smak;
			this.waga = waga;
		}
		
		public String getSmak(){
			return smak;
		}
		
		public double getWaga(){
			return waga;
		}
		
		public Dzem(String smak){
			smak = getSmak();
			waga = 100.0;
		}
		
		public Dzem(double waga){
			waga = getWaga();
			smak = "No name";
		}
		
		public void show(){
		System.out.println("Smak:" + smak);
		System.out.println("Waga:" + waga);
		}
	}
	
	class Sloik{
		private Dzem dzem;
		boolean czyOtwarty;
				
		public void otworz(){
			if(czyOtwarty == false)
				czyOtwarty == true;
		}
		
		public void zamknij(){
			if(czyOtwarty == true)
				czyOtwarty == false;
		}
		
		public Sloik(Dzem dzem){
			
		}
	}