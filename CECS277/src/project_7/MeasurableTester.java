package project_7;

import java.util.ArrayList;
/**
 This program demonstrates a static method of the
 Measurable interface.
 */
public class MeasurableTester
{
	public static void main(String[] args)
	{
		// Calling the static largest method
		// with an ArrayList of BankAccount objects
		ArrayList<BankAccount> accounts = new ArrayList<>();
		accounts.add(new BankAccount(0));
		accounts.add(new BankAccount(10000));
		accounts.add(new BankAccount(2000));
		BankAccount largestAccount = Measurable.largest(accounts);
		System.out.println("Largest balance is : " + largestAccount.getBalance());
		System.out.println("Expected: 10000");
		// Calling the static largest method
		// with an ArrayList of Country objects

		ArrayList<Country> countries = new ArrayList<>();
		countries.add(new Country("Uruguay", 176220));
		countries.add(new Country("Thailand", 513120));
		countries.add(new Country("Belgium", 30510));
		Country largestCountry = Measurable.largest(countries);
		System.out.println("Largest area: " + largestCountry.getArea());
		System.out.println("Expected: 513120");
		System.out.println("Country name: " + largestCountry.getName());
		System.out.println("Expected: Thailand");
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Moto", "Zero"));
		students.add(new Student("Shin", "Tori"));
		students.add(new Student("Jin", "Hiro"));
		Student highestID = Measurable.largest(students);
		System.out.println("Highest ID: " + highestID.getID());
		System.out.println("Expected: 1002");
		System.out.println("Student name: " + highestID.getlast());
		System.out.println("Expected: Hiro");
	
		ArrayList<SavingsAccount> accounts2 = new ArrayList<>();
		accounts2.add(new SavingsAccount(0, 5));
		accounts2.add(new SavingsAccount(10000, 5));
		accounts2.add(new SavingsAccount(2000, 5));
		BankAccount largestAccount2 = Measurable.largest(accounts2);
		System.out.println("Largest balance is : " + largestAccount2.getBalance());
		System.out.println("Expected: 0.0");
	}
	
}
