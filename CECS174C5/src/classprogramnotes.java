import java.util.Scanner;
public class classprogramnotes {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	//System.out.println("Hello");
	
	//String x = "Hello";
	//String y = "hello";
	//System.out.println(x.length()-y.length());
	
	final double rate1 = .10;
	final double rate2 = .25;
	final double single_limit = 32000;
	final double married_limit = 64000;
	double tax1 = 0;
	double tax2 = 0;
	
	System.out.print("What is your income? ");
	double income = keyboard.nextDouble();
	
	System.out.print("What is your status? Enter m for married, s for single: ");
	String status  = keyboard.next();
	
	if (status.equals("s")) {
		if (income <= single_limit) {
			tax1 = rate1 * income;
			
		}
		else {
			tax1 = rate1 * single_limit;
			tax2 = rate2 * (income - single_limit);
		}
	}
	else {
		if(income <= married_limit) {
			tax1 = rate1 * income;
			
		}
		else {
			tax1 = rate1 * married_limit;
			tax2 = rate2 * (income - married_limit);
			
		}
	}
	double total_tax = tax1 + tax2;
	System.out.println("The total tax is: $" + total_tax);
}
}
