package battleGame;
import java.util.ArrayList;

public class PC {
	private String name;
	private int[] stats = new int[3];
	private ArrayList<Attack> move_set;
	private int HP;
	
	public PC(){
		name = "";
		stats[0] = 5;
		stats[1] = 5;
		stats[2] = 5;
		move_set = new ArrayList<Attack>();
		Attack base = new Attack();
		move_set.add(base);
		HP = 100;
	}
	
	public PC(String name, int[] stats, int HP){
		this.name = name;
		this.stats[0] = stats[0];
		this.stats[1] = stats[1];
		this.stats[2] = stats[2];
		move_set = new ArrayList<Attack>();
		Attack base = new Attack();
		move_set.add(base);
		this.HP = HP;
	}
	
	public void setName(String new_name){
		name = new_name;
	}
	
	public void changeStats(int pos, int inc){
		for(int i = 0; i < stats.length; i++){
			if (i == pos){
				stats[i] += inc;
				break;
			}
		}
	}

	public void addAttack(Attack new_attack){
		move_set.add(new_attack);
	}

	public void setStats(int pos, int inc){
		for(int i = 0; i < stats.length; i++){
			if (i == pos){
				stats[i] = inc;
				break;
			}
		}
	}

	public void display(){
		System.out.printf("%-15s%15s","Name:", name);
		System.out.printf("%-15s%15d","HP:", HP);
		System.out.printf("%-15s%15d","Strength:", stats[0]);
		System.out.printf("%-15s%15d","Endurance:", stats[1]);
		System.out.printf("%-15s%15d","Speed:", stats[2]);
		System.out.println("Known moves:");
		for(Attack i: move_set){
			System.out.printf("%-15s%15d", i.getAtkName(), i.getAtkPower());
		}
	}

	public void setHP(int hp){
		HP = hp;
	}
	
	public int getStrength(){
		return stats[0];
	}
	public int getEndurance(){
		return stats[1];
	}
	public int getSpeed(){
		return stats[2];
	}

	public String getName(){
		return name;
	}
	
	public int getHP(){
		return HP;
	}
}

