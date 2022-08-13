package proj1;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Simulates the printing of a receipt from a cash register
 * <p>
 * 
 * @author Gabriel
 * @since 9/25/2016
 * @version - 1.0 
 * 
 */
public class Receipt {
	
	private static final String header1 = "Food Store";
	private static final String header2 = "987 N. Streetname St.";
	private static final String header3 = "Cityname City, CA 65432\n";
	private PrintWriter out;
	private ArrayList<String> line;
	/**
	 * Constructor that creates the ArrayList that will hold the lines of the 
	 */
	public Receipt(){
		line = new ArrayList<String>();
		line.add(header1);
		line.add(header2);
		line.add(header3);
		line.add("");
		line.add("");
		line.add("-------------------------------------------------------------------------------------");
		line.add(String.format("%-44s%41s", "Items:", "Subtotals:"));
	}
	/** 
	 * 
	 * @param purchasedItem
	 */
	public void addLineItem(Item purchasedItem){
		String lineItem1 = String.format("%-66s", purchasedItem.getName() + ":");
		String lineItem2 = String.format("%d%s", purchasedItem.getQty(), "(@ " + String.format("%.2f", purchasedItem.getPrice()) + ")");
		String lineItem3 = String.format("%9s", "$ " + String.format("%.2f", purchasedItem.getPrice() * purchasedItem.getQty()));
		String lineItem = lineItem1 + lineItem2 + lineItem3;
		line.add(lineItem);

	}
	/** 
	 * 
	 * @param amountDue
	 * @param payment
	 * @param change
	 */
	public void addTotals(double amountDue, double payment, double change){
		String amountDue_string = String.format("%-11s%20s", "Amount Due:","$" + String.format("%.2f", amountDue));
		String payment_string = String.format("%-11s%20s", "Payment:","$" + String.format("%.2f", payment));
		String change_string = String.format("%-11s%20s", "Change:", "$" + String.format("%.2f", change));
		line.add("");
		line.add("-------------------------------------------------------------------------------------");
		line.add(amountDue_string);
		line.add(payment_string);
		line.add(change_string);
	}
	/**
	 * 
	 * @param path
	 * @return
	 */
	public boolean printReceipt(String path){
		Scanner in = new Scanner(System.in);
		boolean fileFound = false;
		do{
			try{
				out = new PrintWriter(path);
				fileFound = true;
			}
			catch(FileNotFoundException exception){
				System.out.println("File not Found.");
				System.out.println("Please enter a new path or enter SKIP to print no receipt:");
				String path2 = in.next();
				if(path2.equals("SKIP")){
					break;
				}
				else{
					path = path2;
				}
				
			}
		}while(!fileFound);
		in.close();
		if(fileFound){
			for(String nline: line){
				out.println(nline);
			}
			out.close();
			return true;
		}
		else{
			return false;
		}
	}

}
