import java.util.Scanner; 
public class class_code {
	public static void main(String[] args){
	/*int x=5;
	String z = "hello";
	
	boolean a = (x < 7);
	boolean b = (x > 100);
	boolean c = (x == 7);
	boolean d = (x != 7);
	System.out.println("The value of a is " + a);
	System.out.println("The Value of b is " + b);
	System.out.println("The Value of c is " + c);
	System.out.println("The Value of d is " + d);
	
	boolean e = (x < 20 && x > 15);
	boolean f = (x < 20 || x > 15);
	System.out.println("The Value of e is " + e);
	System.out.println("The Value of f is " + f);
	
	boolean g = z.equals("Hello");
	System.out.println("The value of g is " + g);
	
	String A = "everyone";
	int h = z.compareTo(A);
	System.out.println("The Value of h is " + h);
	*/
	Scanner keyboard = new Scanner(System.in);
	/*System.out.println("How many chocolate bars would you like to buy? ");
	int number = keyboard.nextInt();
	if (number < 5){
		System.out.println("Your total will be " + 2 * number + " dollars") ;
	}
	
	else if (number >= 5 && number < 10){
		System.out.println("Your total will be " + 1.50 * number + " dollars");
		
	}
	else {
		System.out.println("Your total will be " + 1 * number + " dollars");
	}
	System.out.println("How was your day today?(good, bad) ");
	String answer = keyboard.next();
	if (answer.equals("good")) {
		System.out.println("I'm glad your day is " + answer);
	}
	else {
		System.out.println("I'm sorry your day is  " + answer);
	}*/
	//While loops
	/*int n = 20;
	int i = 1;
	while (i <= n ){
		System.out.println(i);
		i = i + 1;
		
	}
	int number  = 23;
	int guess = -5;
	while (guess != number){
		System.out.println("Guess a number between 0 and 30 ");
		guess = keyboard.nextInt();
		if (guess!= number){
			System.out.println("Your guess is wrong");
		}
	}
	System.out.println("You guessed the right number the number is " + number);*/
	System.out.println("Enter a number: ");
	double number = keyboard.nextDouble();
	double smallest_number = number;
	double largest_number = number;
	System.out.println("Enter a number: ");
	while( keyboard.hasNextDouble()){
	System.out.println("Enter a number: ");
	number = keyboard.nextDouble();
	if (number < smallest_number){
		smallest_number = number;
	}
	else if (number > largest_number) {
		largest_number = number;
	}
	System.out.println("The largest number is " + largest_number);
	System.out.println("The smallest number is " + smallest_number);
	}
	}
}
