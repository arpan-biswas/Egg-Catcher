package codes;


import javax.sound.sampled.*;
import java.io.*;

public class Sound {

	//sound at the start of the game
	public static void welcomeSound(){
		
		try{
			
			File sound = new File("sounds//intro.wav");
			AudioInputStream ais =AudioSystem.getAudioInputStream(sound);
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
		}
		catch(Exception e){}
	}
	
	//when egg misses the catcher
	public static void eggBreaks(){
		
		try{
			
			File sound = new File("sounds//break.wav");
			AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
			
		}
		catch(Exception e){}
		
		
	}
	
	//sound when the egg gets caught.
	public static void eggCaught(){
		
		try	{
			
			File sound = new File("sounds//egg_caught.wav");
			AudioInputStream ais =AudioSystem.getAudioInputStream(sound);
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
			}
		catch(Exception e){}
	
		
	}
	
	//sound at the end
	public static void gameEnds(){
		
		try{
			
			File sound = new File("sounds//game_over.wav");
			AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
		}
		
		catch(Exception e){}
		
		
	}
	
	

	
	
}
