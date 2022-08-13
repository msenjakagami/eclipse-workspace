package battleGame;

public class Attack {
	private int atk_power;
	private String atk_name;
	public Attack(){
		atk_power = 10;
		atk_name = "Basic Attack";
	}
	
	public Attack(String name, int power){
		atk_power = power;
		atk_name = name;
	}
	
	public void setAtkPower(int atk_power){
		this.atk_power = atk_power; 
	}
	
	public void setAtkName(String atk_name){
		this.atk_name = atk_name;
	}
	
	public int getAtkPower(){
		return atk_power;
	}
	
	public String getAtkName(){
		return atk_name;
	}
}
