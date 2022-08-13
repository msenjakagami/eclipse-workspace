package proj1;
/**
 * Represents an item and its properties (name, price, weight, and its quantity)
 * <p>
 * @author Kian
 * @version - 1.0
 * @since - 9/22/16
 * 
 *
 */
public class Item implements Comparable<Object>{
	
	private String name;
	private String weight;
	private int quantity;
	private double price;
	
	/**
	 * constructs an item w/ no name, weight, price, or quantity
	 */
	public Item(){
		
		name = " ";
		weight = " ";
		quantity = 0;
		price = 0;
		
	}
	
	/**
	 * constructs an item with a name, weight, price, and a quantity of 1 
	 * @param name - the name of the item
	 * @param weight - the weight/size of the item
	 * @param price - the price of the item
	 */
	public Item(String name, String weight, double price){
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.quantity = 0; 
	}
	
	/**
	 * sets the name of an item
	 * @param name - the name of the item
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * sets the weight/size of the item
	 * @param weight - the weight of the item
	 */
	public void setWeight(String weight){
		this.weight = weight;
	}
	
	/**
	 * sets the quantity of the item
	 * @param quantity - the quantity of the item
	 */
	public void setQty(int quantity){
		this.quantity = quantity;
	}
	
	/**
	 * sets the price of the item
	 * @param price - the price of the item
	 */
	public void setPrice(double price){
		this.price = price;
	}
	
	/**
	 * gets the name of the current item
	 * @return - the item's name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * gets the weight/size of the item
	 * @return - the weight of the item
	 */
	public String getWeight(){
		return weight;
	}
	
	/**
	 * gets the quantity of the item
	 * @return - the quantity of the item
	 */
	public int getQty(){
		return quantity;
	}
	
	/**
	 * gets the price of the item
	 * @return - the items price
	 */
	public double getPrice(){
		return price;
	}
	
	public int compareTo(Object otherObject){
		Item otherItem = (Item) otherObject;
		return this.name.compareTo(otherItem.name);
//		if(this.name < otherItem.name){return -1;}
	}

}
