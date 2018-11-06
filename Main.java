package codes;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

/*This is the main class of the game. The Game is known as The Egg Catcher.
 * Eggs will spawn from above randomly and user has to catch them.
 * The user will be given 3 chances, and if he uses up all three chances 
 * the game will exit and display the score.
 * Enjoy. 
 */

public class Main {

	public static void main(String[] args) {
		
		Sound.welcomeSound();
		JOptionPane.showMessageDialog(null, "Welcome to the Egg Catcher!!");
		
		JFrame window =  new JFrame();
		window.setTitle("The Egg Catcher");
		window.setSize(400, 400);
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		window.setResizable(false);
		
		Logic logic = new Logic();
		logic.eggFall();
		window.add(logic);
		
		
		logic.setFocusable(true);
		window.setVisible(true);
		
	
		while(logic.isGameOver() == false){
			
		}
		
		Sound.gameEnds();
		JOptionPane.showMessageDialog(null, "Game over. Your Caught " + logic.hits + " Eggs");
		window.dispose();
	
	
		}//main method ends
		
}//class ends.


