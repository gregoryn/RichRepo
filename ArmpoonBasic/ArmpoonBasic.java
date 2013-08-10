//Mike Yamsek
//this is a basic game where the user battle a scorpion with Armpoon

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;

//RICH REPO
public class ArmpoonBasic {
	
	private static final int FRAME_WIDTH = 820;
	private static final int FRAME_HEIGHT = 660;
	
	public static void main(String[] args) {
		
		final Armpoon armpoon = new Armpoon();
		final Scorpion scorpion = new Scorpion();
		final Background background = new Background();
		
		//create a new game
		final Game g = new Game();
		g.GameComponent(armpoon, scorpion, background);
		
		/*
		 * The inner UpdateCharecter class simply does something every
		 * time the timer from above fires an event.  In this case,
		 * it repaints the JPanel - meaning it calls paintComponent().
		 */
		class UpdateCharecter implements ActionListener{
			public void actionPerformed(ActionEvent e){
				//update Charecter positions
				armpoon.move();
				scorpion.move();
				
				//if a charecter moves test for sprite crossovers
				
				
				//REPAINT IF SOMETHING HAPPENS
				g.repaint();
			}
		}	
		
		/*
		 * The inner KeyboardListener class listens for when you press
		 * keys on your keyboard.  When you do, it does stuff.
		 */
		class ArmpoonMover implements KeyListener {

			public void keyPressed(KeyEvent evt) {
				/*
				 * Stores the key you pressed into a variable.
				 * 
				 * Each movement key causes the mover to move in the
				 * corresponding direction.
				 */
							 
				int key = evt.getKeyCode();
				 
				switch ( key ){
				case KeyEvent.VK_W:
					scorpion.setMovingUp( true );
					break;
				case KeyEvent.VK_A:
					scorpion.setMovingLeft( true );
					break;
				case KeyEvent.VK_S:
					scorpion.setMovingDown( true );
					break;
				case KeyEvent.VK_D:
					scorpion.setMovingRight( true );
					break;
				case KeyEvent.VK_UP:
					armpoon.setMovingUp( true );
					break;
				case KeyEvent.VK_LEFT:
					armpoon.setMovingLeft( true );
					break;
				case KeyEvent.VK_DOWN:
					armpoon.setMovingDown( true );
					break;
				case KeyEvent.VK_RIGHT:
					armpoon.setMovingRight( true );
				}			
			}

			/*
			 * Same as above, but these stop the mover from moving
			 * in a direction, when the corresponding direction key is
			 * released.
			 */
			public void keyReleased(KeyEvent evt) {
				int key = evt.getKeyCode();
				 
				switch ( key ){
				case KeyEvent.VK_W:
					scorpion.setMovingUp( false );
					break;
				case KeyEvent.VK_A:
					scorpion.setMovingLeft( false );
					break;
				case KeyEvent.VK_S:
					scorpion.setMovingDown( false );
					break;
				case KeyEvent.VK_D:
					scorpion.setMovingRight( false );
					break;
				case KeyEvent.VK_UP:
					armpoon.setMovingUp( false );
					break;
				case KeyEvent.VK_LEFT:
					armpoon.setMovingLeft( false );
					break;
				case KeyEvent.VK_DOWN:
					armpoon.setMovingDown( false );
					break;
				case KeyEvent.VK_RIGHT:
					armpoon.setMovingRight( false );
					break;
				}
			}
			
			
			// I don't use this one, but it has to be here.
			public void keyTyped(KeyEvent evt) {
				//possibly good for HOTKEYS
				
			}
		}
		
		//have a listener created for when the user wants to move Armpoon
		ArmpoonMover listener = new ArmpoonMover();
		g.addKeyListener(listener);
		g.setFocusable( true );
		
		
		//Create a frame
		JFrame frame = new JFrame();
		frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		frame.setTitle("ARMPOON");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(g);
		frame.setVisible(true);
		
		UpdateCharecter listener2 = new UpdateCharecter();
		Timer t = new Timer(30,listener2);
		t.start();
		
	
	}
}
