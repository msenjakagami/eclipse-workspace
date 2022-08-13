package project_7;
public class BankAccount implements Measurable<BankAccount>
{
	private double balance;
	public BankAccount(double initial) { balance = initial; }
	public void deposit(double amt) { balance += amt; }
	public void withdraw(double amt) { balance -= amt; }
	public double getBalance() { return balance; }
	public double getMeasure() { return balance; }
}