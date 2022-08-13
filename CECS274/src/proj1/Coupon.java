package proj1;

public class Coupon {
	
	private int type;
	private Item item;
	
	public Coupon(Item item, int type){
		this.item = item;
		this.type = type;
	}
	
	public Item getItem(){
		return item;
	}
	
	public int getType(){
		return type;
	}

}
