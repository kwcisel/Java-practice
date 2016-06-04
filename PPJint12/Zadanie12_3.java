import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;


	class myFrame extends Frame{
		
		public myFrame(){
			
		}
		public void setSize(int width, int height){
			
		}
		public void setVisible(boolean b){
			
		}
		
		public void paint (Graphics g){
			g.drawString("Teraz rysuje", 25, 25);
			
			int width = getWidth();
			int height = getHeight();
			int radius;
			
			if (width < height)
				radius = 2*width/5;
			else
				radius = 2*height/5;
			
			g.setColor(Color.blue);
			g.fillOval((width/2 - radius), (height/2 - radius), radius*2, radius*2);
		}
		
	}
	
public
	class Zadanie12_3{
		public static void main(String[] args){
			myFrame frame = new myFrame();
			frame.setSize(600, 600);
			frame.setVisible(true);
		}
	}