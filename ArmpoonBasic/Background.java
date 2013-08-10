//MIKE YAMSEK
//this class generates a background for Armpoon basic

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;


public class Background {
	
	public Background(){
		
	}
	
	
	//serves to draw the most recent movements, is a draw & redraw
	//MAYBE have this attached to a listener?
	/*public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		//change so that it can be resized
		Rectangle sky = new Rectangle(50,88,700,434);
		g2.setColor(Color.CYAN);
		g2.draw(sky);
		g2.fill(sky);
	}*/
	
	public void draw(Graphics2D g2){
		//change so that it can be resized
		Rectangle sky = new Rectangle(50,88,700,434);
		g2.setColor(Color.CYAN);
		g2.draw(sky);
		g2.fill(sky);
	}
	
}
