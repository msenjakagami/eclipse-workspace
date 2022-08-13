import java.util.Scanner;
public class pig {
/*public static void main(String[] args){
	Scanner enter = new Scanner (System.in);
	int total1 = 0;
	int total2 = 0;
	int round1 = 0;
	int round2 = 0;
	int Gameover = 20;
	int roll1 = 0;
	int roll2 = 0;;
	String input1 = "y";
	String input2 = "y";
	char repeat;
	while (total1 < Gameover && total2 < Gameover){
		do {
			roll1 = (int) (Math.random() * 6 + 1);
		    System.out.println("Player 1 rolled: " + roll1);
	           if(roll1 == 1){
	               round1 = 0;
	               total1 = 0;
	               System.out.print("Turn over \n");
	                 System.out.println("===========================");
	                 System.out.println("Player 1: " + total1);
	                 System.out.println("Player 2: " + total2);
	                 System.out.println("===========================");
	           }
	           else 
	           {         
	              round1 += roll1;
	              total1 = round1;
	              if (total1 >= Gameover)
	              {
	            	  System.out.println("Player 1 score is " + total1 + "\n");
	                  System.out.println("Player 1 wins");
	            	  break;
	              }
	              System.out.println("===========================");
	              System.out.print("Player 1: " + round1 + "\n");
	              System.out.print("Player 2: " + round2 + "\n");
	              System.out.println("===========================");
	              System.out.print("Would you like to roll again? (enter 'y' for yes or 'n' for no)");
	              input1  = enter.nextLine();
	              repeat = input1.charAt(0);
	              if(repeat == 'n')
	              {
	            	  System.out.println("Round over.");
	            	  System.out.println("===========================");
	            	  System.out.println("Player 1: " + total1); 
	            	  System.out.println("Player 2: " + total2);
	            	  System.out.println("===========================");
	              }
	           }

			} while(input1.equalsIgnoreCase("y") && roll1 != 1); 
			{             
				total1 += round1;
				if (total1 >= Gameover){
					break;
				}
			}

         if(total1 >= Gameover){
             System.out.println("Your total score is " + total1);
             System.out.println("Player 1 has won!");

         }
         do {
        	 roll2 = (int) (Math.random() * 6 + 1);
             System.out.println("Player 2 rolled: " + roll2);

             if(roll2 == 1){
                 round2 = 0;
                 total2 = 0;
                 System.out.print("Turn over \n");
                 System.out.println("===========================");
                 System.out.println("Player 1: " + total1);
                 System.out.println("Player 2: " + total2);
                 System.out.println("===========================");
                 break;             
               }
             else {
             round2 += roll2;
             total2 = round2;
             if (total2 >= Gameover){
            	 System.out.println("Player 2 score is " + total2 + "\n");
                 System.out.println("Player 2 wins");
            	 break;
             }
             System.out.println("===========================");
             System.out.print("Player 1: " + round1 + "\n");
             System.out.print("Player 2: " + round2 + "\n");
             System.out.println("===========================");
             System.out.print("Would you like to roll again? (enter 'y' for yes or 'n' for no)");
             input2 = enter.nextLine();
             repeat = input2.charAt(0);


           if(repeat == 'n')
               {
        	   System.out.println("Round over.");
         	  System.out.println("===========================");
         	  System.out.println("Player 1: " + total1);
         	  System.out.println("Player 2: " + total2);
         	  System.out.println("===========================");
               }
           }
       }  
       while(input2.equalsIgnoreCase("y") && roll2 != 1);
       {
           total2 += round2;
             }
        }
       if(total2 >= Gameover){
             System.out.println("Player 2 score is " + total2 + "\n");
             System.out.println("Player 2 wins");
     
         }
        }
}
*/
public static int diceRoll (String player, int total, int Gameover) {
	Scanner enter = new Scanner (System.in);
	int roll;
	int round = 0;
	String input = "";
	do {
		roll = (int) (Math.random() * 6 + 1);
	    System.out.println("Player " + player + " rolled: " + roll);
           if(roll == 1){
               round = 0;
               total = 0;
               System.out.print("Turn over \n");
           }
           else 
           {         
              round += roll;
              if (total + round >= Gameover) {
            	  break;
              }
              System.out.println("===========================");
              System.out.print("Player " + player + ": " + (round + total) + " points \n");
              System.out.println("===========================");
              System.out.print("Would you like to roll again? (yes or no)");
              input  = enter.nextLine();
              System.out.println("");
           }

		} while(input.equals("yes") && roll != 1); 
		return round + total;
}
public static void main (String[] args){
	int player1 = 0;
	int player2 = 0;
	int Gameover = 20;
		while (1 < 2) {
			System.out.println("Player 1's turn");
			System.out.println("");
			player1 = diceRoll("1", player1, Gameover);
			if (player1 >= Gameover)
			{
				System.out.println("Player 1 score is " + player1 + "\n");
				System.out.println("Player 1 wins");
				break;
			}
			System.out.println("");
			System.out.println("Player 2's turn");
			System.out.println("");
			player2 = diceRoll("2", player2, Gameover);
			if (player2 >= Gameover)
			{
				System.out.println("Player 2 score is " + player2 + "\n");
				System.out.println("Player 2 wins");
				break;
			}
			System.out.println("");
		}
	}
}


