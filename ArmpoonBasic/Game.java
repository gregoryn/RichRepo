//MIKE YAMSEK
//will draw the Armpoon game out


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JComponent;
import java.awt.Font;

public class Game extends JComponent{

	private Armpoon armpoon;
	private Scorpion scorpion;
	private Background background;
	
	//inherit armpoon and scorpion
	public void GameComponent(Armpoon a, Scorpion s, Background b) {
		armpoon = a;
		scorpion = s;
		background = b;
	}
	
	//serves to draw the most recent movements, is a draw & redraw
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		background.draw(g2);
		armpoon.draw(g2);
		scorpion.draw(g2);
		
	}
	
	public void drawGameOver(Graphics g2){
		
	}
	   
	   
}
