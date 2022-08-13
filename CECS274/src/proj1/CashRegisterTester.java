package proj1;
import java.io.FileNotFoundException;

public class CashRegisterTester {
	public static void main(String args[])throws FileNotFoundException{
		//test w/o constructor arguments
		CashRegister register1 = new CashRegister(); 
		System.out.println(register1.getTotal());
		System.out.println("Expected: 0");
		System.out.println("");
		
		Item item1 = new Item();
		item1.setName("Ravioli Beef");
		item1.setWeight("15");
		register1.addItem(item1);
     	System.out.println(register1.getTotal());
    	System.out.println("Expected: 1");
    	System.out.println("");
    	
    	Item item2 = new Item();
    	item2.setName("Zero Mixed Berry");
    	item2.setWeight("32");
    	register1.addItem(item2);
    	System.out.println(register1.getTotal());
    	System.out.println("Expected: 1.89");
    	System.out.println("");
    	
    	Item item3 = new Item();
    	item3.setName("Almond Breeze Milk");
    	item3.setWeight("64");
    	register1.addItem(item3);
    	System.out.println(register1.getTotal());
    	System.out.println("Expected: 4.88");
    	System.out.println("");
    	
    	register1.voidItem(item2);
    	System.out.println(register1.getTotal());
    	System.out.println("Expected: 3.99");
    	System.out.println("");
    	
//    	Item itemReturn = new Item();
//    	itemReturn.setName("Lunchmakers Bologna");
//    	itemReturn.setWeight("1.3");
//    	register1.returnItem(itemReturn);
//    	System.out.println(register1.getTotal());
//    	System.out.println("Expected: 3.24");
//    	System.out.println("");
    	
    	//test coupon
    	Coupon coupon1 = new Coupon(item3, 4);
    	register1.addCoupon(coupon1);
    	System.out.println(register1.getTotal());
    	System.out.println("Expected: .25");
    	System.out.println("");
    	
//    	register1.clear();
//    	System.out.println(register1.getTotal());
//    	System.out.println("Expected: 0");
		
    	//test coupon
    	Coupon coupon2 = new Coupon(item1, 3);
    	register1.addCoupon(coupon2);
    	System.out.println(register1.getTotal());
    	System.out.println("Expected: -.25");
    	System.out.println("");
		
	//	Test receipt
		Receipt receipt = register1.getReceipt();
		
		double payment = 20.0;
		double change = payment - register1.getTotal();
		receipt.addTotals(register1.getTotal(), payment, change);
		boolean receipt_Status = receipt.printReceipt("C:\\Users\\Gabriel\\Desktop\\Receipts\\Receipt.txt");
		System.out.println(receipt_Status);
		
		
	}

}