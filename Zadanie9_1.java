		
class Zadanie9_1{
	
	public static void main(String[] args){
		
		Dzem dzem1 = new Dzem("Truskawka", 200.0);
			dzem1.show();
		
		Dzem dzem2 = new Dzem();
			dzem2.show();
			
		Dzem dzem3 = new Dzem();
			dzem3.show();
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