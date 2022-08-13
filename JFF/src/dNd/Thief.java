package dNd;
//import java.util.ArrayList;

public class Thief extends JobClass {

	
	public Thief() {
		// TODO Auto-generated constructor stub
		setName("Thief");
		startingAbilities();
	}

	private void startingAbilities(){
		Ability pickpocket = new Ability("Pickpocket", 0.3);
		Ability lockpick = new Ability("Lockpick", 0.25);
		Ability traps = new Ability("Use Traps", 0.2);
		Ability sneak = new Ability("Sneak", 0.15);
		Ability hide = new Ability("Hide", 0.1);
		Ability detect = new Ability("Detect Noise", 0.10);
		Ability climb = new Ability("Climb Wall", 0.85);
		//for(int i = 0; i < 7; i++){
		addAbility(pickpocket);
		addAbility(lockpick);
		addAbility(traps);
		addAbility(sneak);
		addAbility(detect);
		addAbility(climb);
		addAbility(hide);
		
		
	}

	@Override
	public String toString(){
		String s1 = "Job: " + getName() + "\n";
		String s2 = "Abilities:\n";
		String s3 = "";
		for(Ability x: getAbilities()){
			s3 = s3 + x.toString()+"\n";
		}
		return s1 + s2 + s3;
				
	}
}
