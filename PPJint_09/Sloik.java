package zadania09;

public class Sloik {
	
		private Dzem dzem;
		private boolean czyOtwarty;
		
		public Sloik(){
			dzem = null;
			czyOtwarty = false;
		}
		
		public void otworz(){
			czyOtwarty = true;
		}
		
		public void zamknij(){
			czyOtwarty = false;
		}
		
		public boolean czyOtwarty(){
			return czyOtwarty;
		}
		
		public void putDzem(Dzem dzem){
			if(dzem != null){
				System.out.println("Sloik pelny!");
				return;
			}
			if(czyOtwarty() == false){
				otworz();
				dzem = dzem;
				zamknij();
			}
		}
		
		public static void main(String[] args){
			Sloik sloik1 = new Sloik();
			Sloik sloik2 = new Sloik();
			Sloik sloik3 = new Sloik();
			
			sloik1.putDzem(new Dzem("Ananas", 150.0));
			sloik2.putDzem(new Dzem("Brzoskwinia"));
			sloik3.putDzem(new Dzem("150.0"));
		}
}
