import java.util.Scanner;

public class pig_method {


	public static int dice_roll(String z, int total, int max){
		Scanner keyboard = new Scanner(System.in);
		int roll;
		int p1tot = 0;
		// int max = 20;

		String choice = "";
			do {
				roll = 1 + (int) (Math.random() * 6);
				System.out.println("Player " + z + " rolled a " + roll + ".");
				if (roll == 1) {
					System.out.println("YOUR TURN ENDS!!!" );
					System.out.println();
					p1tot = 0;
					total = 0;
					break;
				}
				else {
					p1tot += roll;
					if( (total + p1tot) >= max){
						break;
					}
					System.out.println("Player " + z + " has " + (p1tot + total) + " points.");
					System.out.println("Would you like to roll again or hold? ");
					choice = keyboard.next();
					System.out.println();
					}
			   } while(choice.equals("roll"));
			   return p1tot + total;
		}

	public static void main(String[] args){
		int x = 0;
		int y = 0;
		int max = 50;
		while(1 < 2){
			 System.out.println("PLAYER 1 TURN!!!");
			 System.out.println();

			 x = dice_roll("1", x, max);

			 if (x >= max) {
			 	System.out.println("Player 1 wins!");
			 	break;
			 }

			 System.out.println("You ended your turn with " + x + " points");
			 
			 

			 System.out.println();

			 System.out.println("PLAYER 2 TURN!!!");

			 System.out.println();			 

			 y = dice_roll("2", y, max);

			 if (y >= max) {
			 	System.out.println("Player 2 wins!");
			 	break;
			 }

			 System.out.println("You ended your turn with " + y + " points");

			 System.out.println();


			 
		} 

	}

}