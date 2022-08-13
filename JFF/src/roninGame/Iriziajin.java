package roninGame;

import java.util.ArrayList;

/**
 * Testing Inheritance and subclasses
 * @author Gabriel
 *
 */
public class Iriziajin extends Player{ 
	private boolean hasHelix;
	private boolean isSerako;
	private int serakurilvl;
	private final static Species iriziajin = new Species("serako");
	/**
	 * Default constructor for an elysian
	 */
	public Iriziajin(String name){
		super(name, iriziajin);
		hasHelix = false;
		isSerako = false;
		serakurilvl = 1;
	}
	/**
	 * Overloaded constructor for an existing character
	 * @param Serako - choose whether or not the character is a Serako
	 * @param serakuriLvl - input character's serakuri level
	 */
	public Iriziajin(String name, boolean Serako, int serakuriLvl){
		super(name, iriziajin);
		hasHelix = false;
		isSerako = Serako;
		serakurilvl = serakuriLvl;
	}
	/**
	 * getter method that returns whether or not the character is a Serako
	 * @return if serako or not
	 */
	public boolean getSerako(){
		return isSerako;
	}
	/**
	 * getter method that returns whether or not the character is a serako 
	 * @return if serako or not
	 */
	public int getSerakuri(){
		return serakurilvl;
	}
	/**
	 * setter method. changes the Searkuri level of the character
	 * if the character doesn't have the helix, then the highest the serakurilvl can go is 4
	 */
	public void serakuriLvlUp(){
		if(serakurilvl < 4){
			serakurilvl += 1;
		}
		else if(serakurilvl == 4 && hasHelix){
			serakurilvl = 5;
		}
		else if (serakurilvl == 4 && !hasHelix){
			serakurilvl = 4;
		}
	}
	/**
	 * setter method. Gives the character the helix
	 */
	public void helix(){
		hasHelix = true;
	}
	public void displayElysianStats(){
		System.out.printf("%-17s%n", "Serakuri Level", serakurilvl);
		
	}
}

