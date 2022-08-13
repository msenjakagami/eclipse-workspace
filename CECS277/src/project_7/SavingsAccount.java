package project_7;

public class SavingsAccount extends BankAccount {
	private double interestRate;
	public SavingsAccount(double initial, double rate)
	{
		super(initial);
		interestRate = rate;
	}
	public void monthEnd() { 
		interestRate = interestRate * 0.05;
	}
	
	@Override
	public double getMeasure(){
		return interestRate;
	}
}
