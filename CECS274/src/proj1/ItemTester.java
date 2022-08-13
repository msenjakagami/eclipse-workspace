package proj1;

public class ItemTester {
	public static void main(String args[]){
		//Without constructor
		Item item1 = new Item();
		item1.setName("Milk");
		System.out.println(item1.getName());
		System.out.println("Expected: Milk");
		
		
		item1.setWeight("1");
		System.out.println(item1.getWeight());
		System.out.println("Expected: 1");
		
		item1.setQty(2);
		System.out.println(item1.getQty());
		System.out.println("Expected: 2");
		
		item1.setPrice(3.50);
		System.out.println(item1.getPrice());
		System.out.println("Expected: 3.50");
		
		System.out.println(" ");
		
		//with constructor
		Item item2 = new Item("Apple", "7", 1.50);
		System.out.println(item2.getName());
		System.out.println("Expected: Apple");
		
		
		System.out.println(item2.getWeight());
		System.out.println("Expected: 7");
		
		System.out.println(item2.getQty());
		System.out.println("Expected: 1");
		
		System.out.println(item2.getPrice());
		System.out.println("Expected: 1.50");
		
	}

}
