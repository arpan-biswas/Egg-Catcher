package codes;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


//This is the class which contains the whole Logic of the game.

public class Logic extends JPanel implements KeyListener{
	
	Catcher catcher;
	Egg egg;
	private static String score;
	private static String Miss;
	int hits = 0;
	int miss = 3;
	
	
	//getters and setters for the score counter
	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
	//getters and setters for Miss
	public String getMiss(){
		return Miss;
	}
	
	public void setMiss(String Miss){
		this.Miss = Miss;
	}
	
	

	//constructor of logic class starts here.
	public Logic(){
		
			catcher = new Catcher(340,340,"images//nest.png"); //catcher object with co-ordinates and image path.
		 	egg = new Egg((int)(Math.random() * 340),0,"images//egg.png");//egg object with co-ordinates and image path.
		 	super.addKeyListener(this);
		
		 
		 
	}//ends
	
	
	//method for the falling and spawning of the eggs
	public void eggFall(){
		
			EggMover em = new EggMover(this,egg);
			em.start();
		 	
		}//ends
	
	
	/*The whole class below, draws all the objects present in this game.
	 * The catcher, egg, background and the two strings which display 
	 * the score and the amount of times the egg missed the catcher i.e
	 * Miss.
	 */
	public void paint(Graphics g){
		
		ImageIcon background = new ImageIcon("images//background.jpg");
		Image bg = background.getImage();
		g.drawImage(bg, 0, 0, null);
		g.drawString( "Score :: " + hits, 0, 10);
		g.drawString("Chances ::" + (miss), 320, 10);
		catcher.draw(g);
		egg.draw(g);
		
	
		}//ends
	
	/*This whole method contains the CollisionDetection of the game.
	 * This is used to check if the Catcher and the Egg has intersected or not.
	 * if they intersect the the method returns true otherwise false.
	 */
	public boolean checkEggCollision(){
		
		Rectangle catcherRekt = new Rectangle(catcher.getX(),catcher.getY(),43,30);
		Rectangle eggRekt = new Rectangle(egg.getX(),egg.getY(),20,28);
		
		if(catcherRekt.intersects(eggRekt)== true){
			egg.setX(-10000);
			
			
			return true; 
		}
	
			return false;
			
		}//ends

		
	/*This method below is used to test to see if the game has ended or not.
	 * if the amount of misses in the game at some point gets equal to 3, the
	 * method returns true otherwise will return false.
	 */
	public boolean isGameOver(){
		
		if(miss == 0){
			
			return true;
		}
		
		return false;
		
		}//ends
	
	
	
	
	
	public void keyTyped(KeyEvent e) {}
	
	/*The method below is used to move the object Catcher.
	 * Using the arrow keys in the keyboard
	 */ 
	 
	public void keyPressed(KeyEvent e) {
		
		 if(e.getKeyCode() == e.VK_LEFT){
			catcher.moveLeft();
			
		}
	
		else if(e.getKeyCode() == e.VK_RIGHT){
			catcher.moveRight();
			
		}
		
		super.repaint();
		
		}//ends
	
	
	public void keyReleased(KeyEvent e) {}

	
	
	
	}//logic class ends.
