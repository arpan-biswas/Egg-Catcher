package codes;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


	public class Egg {

	
	private int x,y;
	private String path;
	
	
	public Egg(int x, int y, String path) {
		
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
	
	/*This method is used to draw
	 * the egg
	 */
	
	public void draw(Graphics g){
		
		
		ImageIcon icon = new ImageIcon(path);
		Image eggImage = icon.getImage();
		g.drawImage(eggImage,x,y,null);
	
	}

	
}
