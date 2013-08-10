//MIKE YAMSEK
//This program creates armpoon and allows for his movements

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Random;

public class Armpoon {
	
	//top left pixel location relative to panel (for the sprite) (x-axis)
	private double x_loc;
	//top left pixel location relative to panel (for the sprite) (y-axis)
	private double y_loc;
	
	// Self explanatory
	private boolean movingUp;
	private boolean movingLeft;
	private boolean movingDown;
	private boolean movingRight;
	
	//x & y velocities
	//while probably not needed, possibly for running or jumping
	private double xVelocity;
	private double yVelocity;
	
	//size of armpoons sprite
	public static int WIDTH;
	public static int HEIGHT;
	//color of certain parts of armpoon
	private Color color;
	
	public Armpoon(){
		WIDTH = 30;
		HEIGHT = 60;
		x_loc = 100;
		y_loc = 100;
		xVelocity = 1;
		yVelocity = 1;
		halt();
	}
	
	public Armpoon(int w){
		WIDTH = w;
		HEIGHT = 2*w;
		x_loc = 100;
		y_loc = 100;
		xVelocity = 1;
		yVelocity = 1;
		halt();
	}
	
	public Armpoon(int w, int h){
		WIDTH = w;
		HEIGHT = h;
		x_loc = 100;
		y_loc = 100;
		xVelocity = 1;
		yVelocity = 1;
		halt();
	}
	
	public void draw(Graphics2D g2){
		//draw armpoon here
		Ellipse2D.Double ball = new Ellipse2D.Double(x_loc,y_loc,48,48);
		g2.setColor(Color.green);
		g2.draw(ball);
		g2.fill(ball);
		
		
	}
	
	
	public void move(){
		if ( movingUp ){
			y_loc -= yVelocity;
		}
		if ( movingLeft ){
			x_loc -= xVelocity;
		}
		if ( movingDown ){
			y_loc += yVelocity;
		}
		if ( movingRight ){
			x_loc += xVelocity;
		}
	}
	
	private void halt() {
		movingUp = false;
		movingLeft = false;
		movingDown = false;
		movingRight = false;
	}
	
	public double getX_Loc() {
		return x_loc;
	}
	
	public double getY_Loc() {
		return y_loc;
	}
	
	public void setX_Loc(int x_loc) {
		this.x_loc = x_loc;
	}
	
	public void setY_Loc(int y_loc) {
		this.y_loc = y_loc;
	}
	
	public void setMovingUp(boolean movingUp) {
		this.movingUp = movingUp;
	}
	
	public void setMovingLeft(boolean movingLeft) {
		this.movingLeft = movingLeft;
	}
	
	public void setMovingDown(boolean movingDown) {
		this.movingDown = movingDown;
	}
	
	public void setMovingRight(boolean movingRight) {
		this.movingRight = movingRight;
	}
	
	
}
