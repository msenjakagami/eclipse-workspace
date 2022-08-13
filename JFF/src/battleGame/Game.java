package battleGame;
import java.util.Scanner;

public class Game {
	Scanner in = new Scanner(System.in);
	
	public static void main(String args[]){
		int[] p1Stats = {7, 5, 4};
		int[] p2Stats = {5, 3, 8};
		PC player1 = new PC("PR", p1Stats, 100);
		PC player2 = new PC("PR2", p2Stats, 80);
		Attack fire = new Attack("Fireball", 25);
		player1.addAttack(fire);
		Attack wind = new Attack("Windblade", 20);
		player2.addAttack(wind);
		battle(player1, player2);
	}
	
	public static void battle(PC p1, PC p2){
		
	}
	
}
