package dNd;

import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Character {

	private String name;
	private String race;
//	private Class pclass;
	private String pclass;
	private int level;
	private int age;
	private double alignment;
	private int[] stats = new int[6];
	private int HP;
	private int[] AC = new int[3];
	private ArrayList<String> lang = new ArrayList<String>();
//	private ArrayList<ArrayList<Object>> inventory = new ArrayList<ArrayList<Object>>();
	private ArrayList<Ability> playerAbilities = new ArrayList<Ability>();
	
	public Character(String n, String r, String c, int a, double a1, int h, String l){
		name = n;
		race = r;
		pclass = c;
		level = 1;
		alignment = a1;
		HP = h;
		lang.add(l);
	}
	
	public void setStats(int[] s){
		for(int i = 0; i < stats.length; i++){
			stats[i] = s[i];
		}
	}
	
	public void levelUp(){
		level++;
	}

	private String getAlignment(){
		String axis1 = "";
		String axis2 = "";

		if((alignment%3)%0.5 == 0){
			axis1 = "Neutral";
		}
		else if((alignment%3)%0.5 < 0.5){
			axis1 = "Chaotic";
		}
		else{
			axis1 = "Lawful";
		}
		
		if(alignment < -1){
			axis2 = "Evil";
		}
		else if(alignment > 1){
			axis2 = "Good";
		}
		else{
			axis2 = "Neutral";
		}
		if(axis1.equals(axis2)){
			axis1 = "True";
		}
		return axis1 + " " + axis2;
	}
	public void printout(String fname)throws FileNotFoundException{
		String path = "C:\\Users\\Gabriel\\Desktop\\Character Pages\\";
		PrintWriter out = new PrintWriter(path + fname + ".txt");
		out.print("Name: " + name);
		out.print("Race: " + race);
		
		out.println("Lvl: " + level);
		out.println("Age: " + age);
		out.println("Alignment: " + getAlignment());
	}
//	public Character(){
//		name = null;
//		race = null;
//		pclass = null;
//		level = 1;
//		age = 1;
//		alignment = 0;
//		for(int i = 0; i < stats.length; i++){
//			stats[i] = 5;
//		}
//		HP = 0;
//		for(int i = 0; i < AC.length; i++){
//			AC[i] = 0;
//		}
//		lang.add("Common");
//	}
//
//	public void setName(String name){
//		this.name = name;
//	}
//	
//	public void setRace(String race){
//		this.race = race;
//	}
//	
//	public void setClass(String n){
//		if(n.equalsIgnoreCase("Fighter")){
//			
//		}
//		else if(n.equalsIgnoreCase("Magic User")){
//			
//		}
//		else if(n.equalsIgnoreCase("Rogue")){
//			
//		}
//			
//		
//	}
//	
}
