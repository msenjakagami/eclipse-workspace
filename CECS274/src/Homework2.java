import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Homework2{
	public static void main (String args[]) throws FileNotFoundException
	{
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Double> prices = new ArrayList<Double>();
		ArrayList<Integer> quantities = new ArrayList<Integer>();
		//declare ArrayLists that will be needed
		Scanner in = new Scanner(System.in); //create input scanner
		//String iPath = "C:\\User\\Gabriel\\Desktop\\CECS274\\Prices.txt";
		//File inputFile = new File("C:\\User\\Gabriel\\Desktop\\CECS274\\Prices.txt");
		//Scanner inFile = new Scanner(inputFile);
		//String oPath = "C:\\User\\Gabriel\\Desktop\\Receipts\\Receipt.txt";
		PrintWriter out = new PrintWriter("C:\\Users\\Gabriel\\Desktop\\Receipt.txt");
		System.out.println("Enter the name of the product: ");
		String p_name = in.nextLine(); //input for product name
		names.add(p_name); //adds first entered name into name ArrayList
		System.out.println("Enter the price of the product: ");
		double p_price = in.nextDouble(); //input for product price
		prices.add(p_price); //adds first price to price ArrayList
		quantities.add(1);
		
		do{
			Scanner in1 = new Scanner(System.in); //initialize new scanner
			System.out.println("Enter the name of the product (or enter done if you're finished): ");
			String n_name = in1.nextLine(); //input for new product name
			if (n_name.equals("Done")|| n_name.equals("done")){
				break; //Loop exit
			}
			else {
				System.out.println("Enter the price of the product: ");
				p_price = in1.nextDouble(); //input for new product price
				//System.out.println("Enter the size/weight of the item");
				//String p_size = in.nextLine();
			}
			quantity(n_name, p_price, names, prices, quantities);
		} while (2 > 1); //generic truth value to keep the loop running until broken
		display(out, names, prices, quantities); //final display function
		out.close();
	}	
	public static void display(PrintWriter out, ArrayList<String> names, ArrayList<Double> prices, ArrayList<Integer> quantities) throws FileNotFoundException
	{
		out.println("_____________________________________________");
		out.println();
		out.println("Just Fooding");
		out.println("123 E. Lechuga St.");
		out.println("Carrotville, CA 99999");
		out.println();
		out.println();
		out.println();
		out.printf("%-20s%16s", "Items:", "Subtotal");
		out.println();
		for (int i = 0; i < names.size(); i++){ //for loop to access ArrayLists. Uses names ArrayList for simplicity
			if (quantities.get(i) == 1){ //checks if quantity value is 1
				out.printf("%-20s", names.get(i) + ":");
				out.printf("%16s","$" + String.format("%.2f", prices.get(i))); //printf displays base price w/o quantity
				out.println(); //new line
			}
			else { //if quantity value is greater than 1
				out.printf("%-20s", names.get(i) + ":"); 
				out.printf("%d%s", quantities.get(i), "(@" + String.format("%.2f", prices.get(i)/quantities.get(i)) + ")"); //printf displays quantity & unit price
				out.printf("%8s", "$" + String.format("%.2f", prices.get(i))); //printf displays total price		   
				out.println(); // new line
			}
		}
		double total = 0; //intializes variable
		for (int j = 0; j < prices.size(); j++){ //for loop to access price ArrayList
			total += prices.get(j); //adds together the subtotals
		}
		out.println();
		out.println();
		out.printf("%-8s%.2f", "Total: $", total); //Displays final total
		out.println();
		out.println("_____________________________________________");
		/* //Incomplete Extra Credit  
		Scanner changein = new Scanner(System.in);
		System.out.print("Please enter the payment: ");
		double payment = changein.nextDouble();
		double change = payment - total;
		if (change < 0){
			System.out.println("Insufficient funds");
		}
		else{
			System.out.printf("%-9s%.2f", "Change: $", change);
			System.out.println();
			System.out.println("Thank you, have a nice day!");
		}*/
	}
	
	public static void quantity (String p_name, double p_price, ArrayList<String> names, ArrayList<Double> prices, ArrayList<Integer> quantities){
		for (int i = 0; i < names.size(); i++){ //for loop steps through names ArrayList
			if (!p_name.equals(names.get(i)) && i == names.size()-1){ //executes if name doesn't exist in arraylist and it has gone through all names
				names.add(p_name); //adds new name to names arraylist
				quantities.add(1); //adds quantity of one to quantity arraylist
				prices.add(p_price); //adds price to quantity arraylist
				break; //breaks loop
			}
			else if (p_name.equals(names.get(i))){ //executes if input name already exists in array
				quantities.set(i, quantities.get(i) + 1); //adds another item to the item quantity
				prices.set(i, prices.get(i) + p_price); //subtotals the price of the items
				break; //breaks loop
			}
			else { //keeps loop running if the above conditions haven't been met yet
				continue; 
			}
		}
	}
		
		
}