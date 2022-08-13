
public class apr4NOTES {
	public static void main(String[] args){
		double balance = 2000.0;
		
		for (String s: args){
			Double amount = Double.parseDouble(s);
			if (amount > balance) {
				System.out.println("You don't have enough money ");
				break;
			}
			else
			{
				balance = balance - amount;
			}
			System.out.println(balance);
		}
	}
}
