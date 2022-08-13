package roninGame;
import java.util.ArrayList;

public class Player{
	private String name;
	private String species;
	private int level;
	private int[] stats;
	
	/**
	* Constructor with default values
	*/
	public Player(){
		name = "";
		species = "Human";
		level = 1;
		stats = new int[5];
	}
	/**
	 * Overloaded Constructor with user inputed values for 
	 * @param name - preset name
	 * @param species - user inputed species 
	 * @param stats - user inputed stats
	 */
	public Player(String name, Species race){
		this.name = name;
		species = race.getSpeciesName();
		level = 1;
		stats = race.setStats();
	}
	/**
	 * change player name
	 * @param name
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * change stats
	 * @param statPoint - how much the stat will change by
	 * @param chosenStat - which stat will change
	 */
	public void changeStats(int statPoint, int chosenStat){
		for(int i: stats){
			if (chosenStat == i){
				int newstat = stats[i] + statPoint;
				stats[i] = newstat;
			}
			else{
				continue;
			}
		}
	}
	/**
	 * levels up player
	 */
	public void levelUp(){
		level = level + 1;
	}
	/**
	 * returns player name
	 * @return name
	 */
	public String getName(){
		return name;
	}
	/**
	 * returns player species
	 * @return
	 */
	public String getSpecies(){
		return species;
	}
	/**
	 * returns player level
	 * @return
	 */
	public int getLevel(){
		return level;
	}
	/**
	 * returns stats
	 * @return
	 */
	public int[] getStats(){
		return stats;
	}
	/**
	 * displays all player stats, name and species
	 */
	public void characterScreen(){
		System.out.println("____________Character Screen____________");
		System.out.printf("%-17s%s", "Name:" , name);
		System.out.println();
		System.out.printf("%-17s%s", "Species:" , species);
		System.out.println();
		System.out.printf("%-17s%d", "Level: ", level);
		System.out.println();
		for(int i = 0; i < stats.length; i++){
			if(i == 0){
				if(stats[i] > 0){
					System.out.printf("%-17s%s", "Strength: ", "+" + stats[i]);
				}
				else{
					System.out.printf("%-17s%d", "Strength: ", stats[i]);
				}
				System.out.println();
			}
			else if(i==1){
				if(stats[i] > 0){
					System.out.printf("%-17s%s", "Intelligence: ", "+" + stats[i]);
				}
				else{
					System.out.printf("%-17s%d", "Intelligence: ", stats[i]);
				}
				System.out.println();
			}
			else if(i==2){
				if(stats[i] > 0){
					System.out.printf("%-17s%s", "Agility: ","+" + stats[i]);
				}
				else{
					System.out.printf("%-17s%d", "Agility: ", stats[i]);
				}
				System.out.println();
			}
			else if(i==3){				
				if(stats[i] > 0){
					System.out.printf("%-17s%s", "Endurance: ","+" + stats[i]);
			}
				else{
					System.out.printf("%-17s%d", "Endurance: ", stats[i]);
				}
				System.out.println();
			}
		}
	}
	
}