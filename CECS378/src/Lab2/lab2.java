/**
 * Gabriel Espejo
 * 014487796
 * 11/1/18
 * CECS378
 * Lab 2 Malware
 */
package Lab2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class lab2 {
	static Scanner in = new Scanner(System.in);
	static String[] choices = {"Character", "Gold", "Keys", "Gems","Skull Keys", "Black Badge", "Magic Carpets", "Magic Axes", "Exit"};
	static String[] stats = {"Strength", "Dexterity", "Intelligence","MP", "HP", "Max HP", "Exp", "Exit"};
	static String[] companions = {"Player", "Shamino","Iolo", "Maraih", "Geoffery", "Jaana", "Julia", "Dupre", "Katrina", "Sentri", "Gwenno", "Johne", "Gorn", "Maxwell","Toshi", "Saduj", "Exit"};
	static byte data[] = new byte[4192];
	public static void main(String args[]) throws IOException {
		String path = "C:\\Users\\gespe\\OneDrive\\Desktop\\Ultima_5\\SAVED.GAM";//path in my pc. will need to be changed 
		FileInputStream filein = new FileInputStream(path);//reads in binary save file
		filein.read(data);
		menu();
		FileOutputStream out = new FileOutputStream(path);//overwrites original binary save file
		out.write(data);
		filein.close();
		out.close();
	}

	public static void menu() {
		boolean cont = false;
		while(!cont) {
			//String[] choices = {"Character", "Gold", "Keys","Skull Keys", "Gems", "Black Badge", "Magic Carpets", "Exit"};
			int i = 0;
			for(String c: choices) {
				i++;
				System.out.print(i + ". " + c + "\n");
			}
			System.out.print(">>");
			if(in.hasNextInt()){
				int choice = in.nextInt();
				if(choice == 1){
					charactermenu(); //leads to sub-menu 1
				}
				else if(choice == 2){
					System.out.println("Enter how much gold you want");//adds gold
					Scanner exp = new Scanner(System.in);
					int ex = exp.nextInt();
					data[516] = (byte) (ex & 0xFF);
		            data[517] = (byte) ((ex >> 8) & 0xFF);//because max gold is 9999, requires at least 32 bits to store
				}
				else if(choice == 3){
					System.out.println("Enter how many keys you want");//adds keys
					Scanner keys = new Scanner(System.in);
					int key = keys.nextInt();
					data[518] = (byte) key;				
				}
				else if(choice == 4){
					System.out.println("Enter how many skull keys you want");//adds skull keys
					Scanner skelkey = new Scanner(System.in);
					int skey = skelkey.nextInt();
					data[523] = (byte) skey;				
				}
				else if(choice == 5) {
					System.out.println("Enter how may gems you want");//adds gems
					Scanner gems = new Scanner(System.in);
					int gem = gems.nextInt();
					data[519] = (byte) gem;	
				}
				else if(choice == 6) {
					System.out.println("Enter how may black badges you want");//adds black badges
					Scanner blackbadge = new Scanner(System.in);
					int bbadge = blackbadge.nextInt();
					data[536] = (byte) bbadge;	
				}
				else if(choice == 7) {
					System.out.println("Enter how may magic carpets you want");//adds magic carpets
					Scanner magiccarpet = new Scanner(System.in);
					int macar = magiccarpet.nextInt();
					data[522] = (byte) macar;	
				}
				else if(choice == 8) {
					System.out.println("Enter how may magic axes you want");//adds magic axes
					Scanner magicaxe = new Scanner(System.in);
					int maax = magicaxe.nextInt();
					data[576] = (byte) maax;	
				}
				else if(choice == choices.length) {
					cont = true; //exits program
				}
				else { //Verifies choice validity
					System.out.println("Error. Try again");
					cont = false;
				}
			}
			else{
				System.out.println("Error. Try again");
				in.next();
			}
		}
	}
	//menu to consolidate which characters to change the stats of
	public static void charactermenu() {
		boolean cont = false;
		while(!cont) {
			String[] chars = {"Player", "Shamino","Iolo", "Mariah", "Geoffery", 
					"Jaana", "Julia", "Dupre", "Katrina", "Sentri", "Gwenno", 
					"Johne", "Gorn", "Maxwell","Toshi", "Saduj", "Exit"};
			int i = 0;
			for(String c: chars) {
				i++;
				System.out.print(i + ". " + c + "\n");
			}
			System.out.print(">>");
			if(in.hasNextInt()){
				int choice = in.nextInt();
				if(choice == 1){
					charstatmenu(chars[choice]);//player character
				}
				else if(choice == 2){
					charstatmenu(chars[choice]);
					//Shamino
				}
				else if(choice == 3){
					charstatmenu(chars[choice]);
					//Iolo
				}
				else if(choice == 4){
					charstatmenu(chars[choice]);
					//Mariah
				}
				else if(choice == 5){
					charstatmenu(chars[choice]);
					//Geoffery
				}
				else if(choice == 6){
					charstatmenu(chars[choice]);
					//Jaana
				}
				else if(choice == 7){
					charstatmenu(chars[choice]);
					//Julia
				}
				else if(choice == 8){
					charstatmenu(chars[choice]);
					//Dupre
				}
				else if(choice == 9){
					charstatmenu(chars[choice]);
					//katrina
				}
				else if(choice == 10){
					charstatmenu(chars[choice]);
					//sentri
				}
				else if(choice == 11){
					charstatmenu(chars[choice]);
					//Gwenno 
					
				}
				else if(choice == 12){
					charstatmenu(chars[choice]);
					//Johne
				}
				else if(choice == 13){
					charstatmenu(chars[choice]);
					//Gorn 
				}
				else if(choice == 14){
					charstatmenu(chars[choice]);
					//Maxwell
				}
				else if(choice == 15){
					charstatmenu(chars[choice]);
					//Toshi 
				}
				else if(choice == 16){
					charstatmenu(chars[choice]);
					//Saduj
				}
				else if(choice == chars.length){
					cont = true; //exits program
				}
				else { //Verifies choice validity
					System.out.println("Error. Try again");
					cont = false;
				}
			}
			else{
				System.out.println("Error. Try again");
				in.next();
			}
		}
	}
	//menu to consolidate changing individual character stats
	public static void charstatmenu(String name) {

		boolean cont = false;
		while(!cont) {
			//String[] stats = {"1Strength", "2Dexterity", "3Intelligence","4MP", "56HP", "78Max HP", "910Exp"};
			int i = 0;
			System.out.println("index: " + findIndexCompanions(name));
			for(String s: stats) {
				i++;
				System.out.print(i + "." + s + "\n");
			}
			System.out.print(">>");
			if(in.hasNextInt()){
				int choice = in.nextInt();
				
				if(choice == 1){
					System.out.println("Enter a new strength value\\n>>"); //changes strength score
					Scanner str = new Scanner(System.in);
					int s = str.nextInt();
					data[14 + 32 * findIndexCompanions(name)] = (byte) s;
					
				}
				
				else if(choice == 2){
					System.out.println("Enter a new dexterity value\\n>>");//changes dexterity score
					Scanner dex = new Scanner(System.in);
					int d = dex.nextInt();
					data[15 + 32 * findIndexCompanions(name)] = (byte) d;
				
				}
				
				else if(choice == 3){
					System.out.println("Enter a new intelligence value\\n>>");//changes intelligene score
					Scanner inte = new Scanner(System.in);
					int intel = inte.nextInt();
					data[16 + 32 * findIndexCompanions(name)] = (byte) intel;				
				}

				else if(choice == 4){
					System.out.println("Enter a new magic point value\\n>>");//changes magic score
					Scanner MP = new Scanner(System.in);
					int m = MP.nextInt();
					data[17 + 32 * findIndexCompanions(name)] = (byte) m;
				}

				else if(choice == 5){
					System.out.println("Enter a new hp value\n>>");//changes hp value
					Scanner HP = new Scanner(System.in);
					int h = HP.nextInt();
					data[18 + 32 * findIndexCompanions(name)] = (byte) (h & 0xFF);//because max hp is 999, requires at least 32 bits to store
					data[19 + 32 * findIndexCompanions(name)] = (byte) ((h >> 8) & 0xFF); 
				}

				else if(choice == 6){	
					System.out.println("Enter a new max hp value\\n>>");//changes max hp value
					Scanner max = new Scanner(System.in);
					int maxhp = max.nextInt();
					data[20 + 32 * findIndexCompanions(name)] = (byte) (maxhp & 0xFF);//because max hp is 999, requires at least 32 bits to store
		            data[21 + 32 * findIndexCompanions(name)] = (byte) ((maxhp >> 8) & 0xFF);
				}
				else if(choice == 7){	
					System.out.println("Enter a new experience value\\n>>");//changes exp value
					Scanner exp = new Scanner(System.in);
					int ex = exp.nextInt();
					data[22 + 32 * findIndexCompanions(name)] = (byte) (ex & 0xFF);//because max exp is 9999, requires at least 32 bits to store
		            data[23 + 32 * findIndexCompanions(name)] = (byte) ((ex >> 8) & 0xFF);
				}
				
				else if(choice == stats.length) {
					cont = true; //exits program
				}

				else { //Verifies choice validity
					System.out.println("Error. Try again");
					cont = false;
				}
			}
			else{
				System.out.println("Error. Try again");
				in.next();
			}
		}
	}
	
	private static int findIndexCompanions(String t){ //finds index of a name from the companions array
        // find length of array 
        int len = companions.length; 
        int i = 0; 
  
        // traverse in the array 
        while (i < len) { 
  
            // if the i-th element is t 
            // then return the index 
            if (companions[i].equals(t)) { 
                return i - 1; 
            } 
            else { 
                i = i + 1; 
            } 
        } 
        return -1; 
    } 
  
}

