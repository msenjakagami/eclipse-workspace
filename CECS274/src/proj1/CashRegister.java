package proj1;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Simulates a cash register that is able to remove, return, and add items to a purchase using the Item class
 * <p>
 * @author Kian
 * @since - 9/23/16
 * @version - 1.0
 * 
 */

public class CashRegister{
	
	private ArrayList<Item> items;
	private double total;
	private double savingsTotal;
	private static int couponNumber;
	
	/**
	 * constructs a CashRegister with a total of 0$ and an empty purchase
	 */
	public CashRegister(){
		items = new ArrayList<Item>();
		total = 0;
		savingsTotal = 0;
		couponNumber = 0;
		
	}
	
	/**
	 * constructs a CashRegister with a returned item and credit equal to its price added to the purchase 
	 * @param returnedItem - the item that is being added to the purchase as credit
	 */
	public CashRegister(Item returnedItem){
		items = new ArrayList<Item>();
		total = 0 - returnedItem.getPrice();
//		savingsTotal = 0;
		couponNumber = 0;
	}
	
	/**
	 * adds an item to the purchase and accounts for repeats of Items with the same name and size. Also adds the items price to the total
	 * @param itemPurchased - the Item being added to the purchase
	 */
	public void addItem(Item itemPurchased)throws FileNotFoundException{
		if(itemPurchased.getPrice() == 0){
			File inputFile = new File("C:\\Users\\Gabriel\\Desktop\\CECS274\\PriceList3.txt"); 
			Scanner in = new Scanner(inputFile);
			boolean match = false;
			String item = itemPurchased.getName() + itemPurchased.getWeight();
			String item_noSpace = item.replaceAll("\\s+", "");
			String line = "";
			while(in.hasNextLine()){
				line = in.nextLine();
				String line_noSpace = line.replaceAll("\\s+", "");
				if(line_noSpace.contains(item_noSpace)){
					match = true;
					break;
				}
			}
			if(match){
				line = line.trim();
				int i = line.length() - 2;
				while((line.substring(i, i + 1).equals("0")) || line.substring(i, i + 1).equals("1") || line.substring(i, i + 1).equals("2") || line.substring(i, i + 1).equals("3") || line.substring(i, i + 1).equals("4") || line.substring(i, i + 1).equals("5") || line.substring(i, i + 1).equals("6") || line.substring(i, i + 1).equals("7") || line.substring(i, i + 1).equals("8") || line.substring(i, i + 1).equals("9") || line.substring(i, i + 1).equals(".")){
					i--;
				}
				itemPurchased.setPrice(Double.parseDouble(line.substring(i + 1).trim()));
			}
			in.close();
		}
		if(items.size() > 0){
			boolean match = false;
			for(int i = 0; i < items.size(); i++){
				Item item = items.get(i); //these two items should reference the same item
				int itemQty = item.getQty();
				if(itemPurchased.getName().equals(item.getName()) && itemPurchased.getWeight().equals(item.getWeight())){
					itemQty++;
					item.setQty(itemQty); //should change the quantity of the original item
					match = true;
					break;
				}
			}
			if(!match){
				itemPurchased.setQty(itemPurchased.getQty() + 1);
				items.add(itemPurchased);
			}
		}
		else{
			int ItemQty = itemPurchased.getQty();
			ItemQty++;
			itemPurchased.setQty(ItemQty);
			items.add(itemPurchased);
		}

		total = total + itemPurchased.getPrice();
		Collections.sort(items);
	}
	
	/**
	 * removes a previously item added to the purchase and removes its price from the total.
	 * @param unwantedItem - the Item that is being removed from the purchase.
	 */
	public void voidItem(Item unwantedItem){
		boolean removed = false;
		for(int i = 0; i < items.size(); i++){
			Item item = items.get(i); //these two items should reference the same item
			int itemQty = item.getQty();
			if(unwantedItem.getName().equals(item.getName()) && unwantedItem.getWeight().equals(item.getWeight()) && item.getQty() > 1){
				itemQty--;
				item.setQty(itemQty); //should change the quantity of the original item
				total = total - unwantedItem.getPrice();
				removed = true;
				break;
			}
			else if(unwantedItem.getName().equals(item.getName()) && unwantedItem.getWeight().equals(item.getWeight()) && item.getQty() == 1){
				total = total - unwantedItem.getPrice();
				items.remove(i);
				removed = true;
				break;
			}
		}
		if(!removed){
			System.out.println("Item not found in purchase");
		}
	}
	
	/**
	 * returns an item not previously added to the purchase and updates the total. 
	 * @param unwantedItem - the item being returned.
	 * @throws FileNotFoundException
	 */
	public void returnItem(Item unwantedItem)throws FileNotFoundException{
		File inputFile = new File("C:\\Users\\Gabriel\\Desktop\\CECS274\\PriceList3.txt");
		Scanner in = new Scanner(inputFile);
		boolean match = false;
		String item = unwantedItem.getName() + " " + unwantedItem.getWeight();
		String line = "";
		String itemName = "";
		String itemWeight = "";
		String fullName = "";
		double itemPrice = 0;
		while(in.hasNextLine()){
			line = in.nextLine();
			Matcher m = regex(line);
			if (m.find()){
				itemName = m.group(1).trim()+ " " + m.group(2);
				itemWeight = m.group(3).trim();
				fullName = itemName + " " + itemWeight;
				itemPrice = Double.parseDouble(m.group(4).trim());
				if(item.equals(fullName)){ 
					match = true;
					break;
				}
				else{
					continue;
				}
			}
		}
		if(match){
			unwantedItem.setPrice(itemPrice * -1);
			unwantedItem.setQty(1);
			unwantedItem.setName("    " + unwantedItem.getName());
			items.add(unwantedItem);
			total = total + unwantedItem.getPrice();
		}
		else{
			System.out.println("Item is not found in inventory");
		}
		in.close();
	}
	
	/**
	 * removes all items from the purchase and sets the total to 0.
	 */
	public void clear(){
		while(items.size() > 0){
			items.remove(items.size() - 1);
		}
		total = 0;
	}
	
	/**
	 * returns the total of the purchase.
	 * @return total - the total of the purchase.
	 */
	public double getTotal(){
		//double x = total -savingsTotal;
		String n = String.format("%.2f", total);
		total = Double.parseDouble(n);
		//savingsTotal = 0;
		return total;
	}
	
	/**
	 * Returns a receipt object carrying all the items in the purchase. 
	 * @return receipt - returns the receipt carrying all the items in the purchase
	 * @throws FileNotFoundException
	 */
	
	public Receipt getReceipt()throws FileNotFoundException{
		Receipt receipt = new Receipt();
		
		for(Item i: items){
			receipt.addLineItem(i);
		}
		return receipt;
	}
	/**
	 * Adds a coupon object to the cashregister. Converts the Coupon object into an Item object
	 * @param coupon - the coupon object
	 */
	public void addCoupon(Coupon coupon){
		//check if coupon item is in cart
		Item itemCoupon = new Item(coupon.getItem().getName(), coupon.getItem().getWeight(), coupon.getItem().getPrice());
		boolean inCart = false;
		int i = 0;
		for(i = 0; i < items.size(); i++){
			if(items.get(i).getName().equals(itemCoupon.getName()) && items.get(i).getWeight().equals(itemCoupon.getWeight())){
				inCart = true;
				break;
			}
		}
		if(inCart){
			String couponName = "    coupon" + (couponNumber + coupon.getType());
			itemCoupon.setName(couponName);
//			if(coupon.getType() == 1){
//				coupon.getItem().setQty(coupon.getItem().getQty() + 1);
//				itemCoupon.setPrice(itemCoupon.getPrice());
//				itemCoupon.setQty(1);
//				items.add(i + 1, itemCoupon);
//				savingsTotal -= itemCoupon.getPrice();
//			}
//			if(coupon.getType() == 2){
//				coupon.getItem().setQty(coupon.getItem().getQty() + 1);
//				itemCoupon.setPrice(itemCoupon.getPrice() * .5);
//				itemCoupon.setQty(1);
//				items.add(i + 1, itemCoupon);
//				savingsTotal -= itemCoupon.getPrice();
//			}
			if(coupon.getType() == 3){
				itemCoupon.setPrice(itemCoupon.getPrice() * .5 * -1);
				itemCoupon.setQty(1);
				items.add(i + 1, itemCoupon);
				total += itemCoupon.getPrice();
			}
			
			if(coupon.getType() == 4){
				itemCoupon.setPrice(itemCoupon.getPrice() * -1);
				itemCoupon.setQty(1);
				items.add(i + 1, itemCoupon);
				total += itemCoupon.getPrice();
			}
		}
	}
	/**
	 * Helper method. Takes line from txt file and reformats using regex
	 * @param line - the line from the txt file 
	 * @return m - returns the matcher from the regular expression
	 */
	private Matcher regex (String line){ 
		String myString = line.replace("\t", " "); 
		String regularExpr = "([\\w]+)\\s+([\\w]+)\\s+([\\d.\\d)]+)[\\D]+([\\d.\\d]+)"; 
		Pattern pattern = Pattern.compile(regularExpr);
		Matcher m = pattern.matcher(myString); 
		return m;
	}	
	
	
}
