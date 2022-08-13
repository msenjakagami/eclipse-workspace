import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework2i{
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner keyboard = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> quantities = new ArrayList<Integer>();
		ArrayList<Double> subtotals = new ArrayList<Double>();
		//initializes ArrayLists
		File inputFile = new File("C:\\Users\\Gabriel\\Desktop\\CECS274\\PriceList2.txt"); //imports PriceList2 file
		Scanner inFile = new Scanner(inputFile); //scanner to read through file
		System.out.println("Enter the name of the file you want to create");
		String path = keyboard.next(); //user enters file name
		PrintWriter outFile = new PrintWriter("C:\\Users\\Gabriel\\Desktop\\Receipts\\" + path + ".txt"); //export file path
		int i = 0; //increment value for later
		do {
			Scanner in = new Scanner(System.in);//creates new scanner
			System.out.println("Enter the name of the product (or done if finished):");
			String name = in.nextLine(); //user enters name
			if (name.equals("done") || name.equals("Done")){ //if user enters done
				break;
			}
			else {
				System.out.println("Enter the weight in ct/lbs/oz/etc (w/o units): ");
				double weight = in.nextDouble(); //user enters weight
				while (inFile.hasNextLine()){ //processes file
					String line = inFile.nextLine(); //sets string to line in txt file
					Matcher m = regex(line); //gets matcher value
					if(m.find()){ //regex functions that I don't actually understand
						String itemName = m.group(1).trim(); //splits item name from file line
						double itemWeight = Double.parseDouble( m.group(2).trim()); //splits weight from file line
						String unit = m.group(3).substring(0, m.group(3).length() - 1); //splits weight units from file line
						String iWeight = itemWeight + " " + unit; //creates a string with item weight and units
						double itemPrice = Double.parseDouble(m.group(4).trim()); //splits price from file line
						
						if (itemName.equals(name) && itemWeight == weight && i != 0){ //adds item to cart if found in .txt file
							quantity(itemName, iWeight, itemPrice, names, quantities, subtotals);
							inFile = new Scanner(inputFile); //resets file scanner to scan through entire .txt file
							break; 
						}
						else if (itemName.equals(name) && itemWeight == weight && i == 0) //adds item to cart if found in txt, and if first item added (if i = 0 still)
						{ 
							names.add(itemName + " " + iWeight.trim()); //add first item name
							quantities.add(1); //adds first item quantity
							subtotals.add(itemPrice); //adds first item price
							i++; //increments i so that the program doesn't go through this again
							inFile = new Scanner(inputFile); //resets the scanner to scan through entire .txt file
							break;
						}
						else{ //keeps loop running if name not found yet
							continue;
						}
					}
				}
			}
			
		} while (2 > 1);//generic truth value
		display(outFile, names, subtotals, quantities);
		inFile.close(); //closes input file
		outFile.close(); //close output file
	}
	
	public static Matcher regex (String line){ //Module to return Matcher for regular expression
		String myString = line.replace("\t", " "); //changes \t's in txt file to whitespaces
		String regularExpr = "([\\D]+)([\\d.\\d)]+)([\\D]+)([\\d.\\d]+)"; //
		Pattern pattern = Pattern.compile(regularExpr);
		Matcher m = pattern.matcher(myString); //myString is the string that you are trying to match
		return m;
	}
	public static void display(PrintWriter out, ArrayList<String> names, ArrayList<Double> subtotals, ArrayList<Integer> quantities) throws FileNotFoundException{
		out.println("__________________________________________________________________________________________" + "\n\n\n");
		out.println("Just Fooding");
		out.println("123 E. Lechuga St.");
		out.println("Carrotville, CA 99999");
		out.println();
		out.println();
		out.printf("%-42s%39s", "Items:", "Subtotal");
		out.println();
		for (int i = 0; i < names.size(); i++){ //for loop to access ArrayLists. Uses names ArrayList for simplicity
			if (quantities.get(i) == 1){ //checks if quantity value is 1
				out.printf("%-55s", names.get(i) + ":");
				out.printf("%26s","$" + String.format("%.2f", subtotals.get(i))); //printf displays base price w/o quantity
				out.println(); //new line
			}
			else { //if quantity value is greater than 1
				out.printf("%-65s", names.get(i) + ":"); 
				out.printf("%d%s", quantities.get(i), "(@" + String.format("%.2f", subtotals.get(i)/quantities.get(i)) + ")"); //printf displays quantity & unit price
				out.printf("%8s", "$" + String.format("%.2f", subtotals.get(i))); //printf displays total price		   
				out.println(); // new line
			}
		}
		double total = 0; //intializes variable
		for (int j = 0; j < subtotals.size(); j++){ //for loop to access price ArrayList
			total += subtotals.get(j); //adds together the subtotals
		}
		out.println();
		out.println();
		out.printf("%-8s%.2f", "Total: $", total); //Displays final total
		out.println();
		out.println("__________________________________________________________________________________________");
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
	public static void quantity(String n_name, String weight, double price, ArrayList<String> names, ArrayList<Integer> quantities, ArrayList<Double> subtotals){
		String name = n_name + " " + weight; //creates string using item name and size strings
		for (int i = 0; i < names.size(); i++){ //for loop steps through names ArrayList
			if (!name.trim().equals(names.get(i)) && i == names.size() - 1){ //executes if name doesn't exist in arraylist and it has gone through all names
				names.add(name.trim()); //adds new name to names arraylist
				quantities.add(1); //adds quantity of one to quantity arraylist
				subtotals.add(price); //adds price to quantity arraylist
				break; //breaks loop
			}
			else if (name.trim().equals(names.get(i))){ //executes if input name already exists in array
				quantities.set(i, quantities.get(i) + 1); //adds another item to the item quantity
				subtotals.set(i, subtotals.get(i) + price); //subtotals the price of the items
				break; //breaks loop
			}
			else { //keeps loop running if the above conditions haven't been met yet
				continue; 
			}
		}
		
	}
	
}