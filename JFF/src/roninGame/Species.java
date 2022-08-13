package roninGame;
import java.util.ArrayList;
public class Species {
	private String name;
	private int[] baseStats;
	private final String human = "human";
	private final String caedion = "caedion";
	private final String vikitronian = "vikitronian";
	private final String serako = "serako";
	private final String synthenian = "synthenian";
	
	public Species(){
		name = human;
		baseStats = new int[5];
	}

	public Species(String name){
		this.name = name;
		baseStats = new int[5];

	}
	
	public void setSpecies(String name){
		boolean x = false;
		do{
			if(is_aSpecies(name)){
				this.name = name.toUpperCase();
				x = true;
			}
			else{
				System.out.println("Invalid species");
			}
		} while (!x);
	}
	
	public int[] setStats(){
			if (name.equalsIgnoreCase(human)){
				baseStats[0] = 5;
				baseStats[1] = 5;
				baseStats[2] = 5;
				baseStats[3] = 5;
			}
			else if(name.equalsIgnoreCase(caedion)){
				baseStats[0] = 7;
				baseStats[1] = 6;
				baseStats[2] = 3;
				baseStats[3] = 4;
			}
			else if(name.equalsIgnoreCase(vikitronian)){
				baseStats[0] = 6;
				baseStats[1] = 3;
				baseStats[2] = 6;
				baseStats[3] = 6;
			}
			else if(name.equalsIgnoreCase(serako) || name.equalsIgnoreCase("iriziajin")){
				baseStats[0] = 4;
				baseStats[1] = 6;
				baseStats[2] = 6;
				baseStats[3] = 4;
			}
			else if(name.equalsIgnoreCase(synthenian)){
				baseStats[0] = 3;
				baseStats[1] = 8;
				baseStats[2] = 4;
				baseStats[3] = 3;
			}
			return baseStats;
	}
	public String getSpeciesName(){
		return name.toUpperCase();
	}
	private boolean is_aSpecies(String sName){
		return serako.equalsIgnoreCase(name) || human.equalsIgnoreCase(name) || caedion.equalsIgnoreCase(name) || vikitronian.equalsIgnoreCase(name) || synthenian.equalsIgnoreCase(name);
	
	}
}
