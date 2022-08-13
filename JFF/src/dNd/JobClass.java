package dNd;
import java.util.ArrayList;
public abstract class  JobClass {
	private String name;
	private ArrayList<Ability> abilities;
	
	public JobClass() {
		name = "Adventurer";
		abilities = new ArrayList<Ability>();
	}
	
	public JobClass(String name){
		this.name = name;
		abilities = new ArrayList<Ability>();
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public void addAbility(Ability ability){
		abilities.add(ability);
	}

	public ArrayList<Ability> getAbilities(){
		return abilities;
	}
	
	@Override
	public String toString(){
		String s1 = "Name: " + name + "\n";
		String s2 = "Abilities:\n";
		String s3 = "";
		for(Ability x: abilities){
			s3 = s3 + x.toString()+"/n";
		}
		return s1 + s2 + s3;
				
	}

}
