package codes;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;


public class Catcher {

		private int x,y;//co-ordinates
		private String path;//path of the image
		
		
		
		public Catcher(int x, int y, String path) {
			
			this.x = x;
			this.y = y;
			this.path = path;
		}


		public int getX() {
			return x;
		}


		public void setX(int x) {
			this.x = x;
		}


		public int getY() {
			return y;
		}


		public void setY(int y) {
			this.y = y;
		}


		public String getPath() {
			return path;
		}


		public void setPath(String path) {
			this.path = path;
		}
		
		//method to move the catcher to the right
		public void moveRight(){
			
			if(x < 350)
				x+=13;
		}
		
		//method to move the catcher to the left
		public void moveLeft(){
			
			if(x > 0)
				x-=13;
		}
		
		/*The following method is used to draw
		 * the catcher.
		 */
		public void draw(Graphics g){
			
			
			ImageIcon icon = new ImageIcon(path);
			Image catcherImage = icon.getImage();
			g.drawImage(catcherImage,x,y,null);
		
		}
		
	
}
