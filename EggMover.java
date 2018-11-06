package codes;

import javax.swing.*;


/*This whole class is to give movement to the egg and also to check if the egg 
 * hits or misses the catcher.
 */

public class EggMover extends Thread {

		Logic panel; //makes a panel object
	
		Egg egg; //makes an egg object
	
	//constructor for the class
	public EggMover(Logic panel,Egg egg){
		
		this.panel = panel;
		this.egg = egg;
		}
	
	/* The following whole method is used for the movement of the eggs. 
	 * And to check if the egg has hit or missed the catcher.
	 * if the egg hits the catcher, hits will be incremented by 1 and if it
	 * misses miss will be incremented by 1. If at a point miss gets equals
	 * to 3, the loop will exit and the isGameOver method will be called 
	 * and the game will exit.
	 */
	public void run(){
		
		int i = 0;
		int hits = 0;
		int miss = 0;
		
		while(i < 2000000){
				
			boolean hasHit = false;
			
			while(egg.getY() < 501){
					
					egg.setY(egg.getY() + 10); 
					try{
						Thread.sleep(30); 
					}
					catch(Exception e){}
				
					panel.repaint();
					
					
					if(panel.checkEggCollision() == true){
						Sound.eggCaught();
						panel.hits++;
						hasHit = true;
						break;
					}
						
						
					
					if(panel.isGameOver() == true){
						break;
					}
					
					}//nested while ends here
			
					if(hasHit == false){
						
						panel.miss--;
						Sound.eggBreaks();
					}	
				
					if(panel.isGameOver() == true)
						break;
				
					egg.setY(0);
					egg.setX((int)(Math.random() * 340)); 
					i++;
					}
		
			
		
		
		
		}//egg falling method ends here
	
	
	
		}//class ends here
