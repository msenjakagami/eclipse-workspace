package dNd;

public class Ability {

	private String name;
	private double percentage;
	public Ability(String n, double i) {
		name = n;
		percentage = i;
	}
	
	public String getName(){
		return name;
	}
	
	public double getPercentage(){
		return percentage;
	}
	
	public void increasePercentage(double inc){
		percentage += inc;
	}
	
	@Override
	public String toString(){
		return String.format("%-17s%9s", "  >" + name + ":", percentage * 100 + "%");
	}

	
}
