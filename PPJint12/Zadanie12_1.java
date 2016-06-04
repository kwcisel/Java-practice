import java.awt.Frame;
import java.awt.Graphics;


	class myFrame extends Frame{
		
		public myFrame(){
			
		}
		public void setSize(int width, int height){
			
		}
		public void setVisible(boolean b){
			
		}
		
		public void paint (Graphics g){
			g.drawString("Teraz rysuje", 25, 25);
		}
	}
	
public
	class Zadanie12_1{
		public static void main(String[] args){
			myFrame frame = new myFrame();
			frame.setSize(600, 600);
			frame.setVisible(true);
		}
	}