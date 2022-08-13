import java.util.Scanner;

//A record is a few different values in one variable but the values can be different types and they are distinguished by names (often called fields).)
public class apr5NOTES {
	//Declare a record called TemperatureSample with four fields, month,day,year, temperature
	class TemperatureSample{
		int month,day,year;
		double temperature;
	}
	public static void main (String[] args) throws Exception {
		String site = "http://academic.udayton.edu/kissock/http/Weather/gsod95-current/CALOSANG.txt";
		Scanner inFile = new Scanner((new java.net.URL(site).openStream()));
		
		TemperatureSample[] temp_db = new TemperatureSample[10000];
		
		int num_record;
		int i = 0;
		
		while(inFile.hasNextInt() && i<temp_db.length){
			TemperatureSample e = new TemperatureSample();
			e.month = inFile.nextInt();
			e.day = inFile.nextInt();
			e.year = inFile.nextInt();
			e.temperature = inFile.nextDouble();
			if(e.temperature == -99)
				continue;//skips the rest of the while body
		temp_db[i] = e;
		i++;
		}	
		num_record = i;
		inFile.close();
		System.out.println("The number of records in the data base is " + i);
		double total = 0, avg;
		int count = 0;
		for (i = 0; i < num_record; i++)
		{
			if (temp_db[i].month == 11){
				total+= temp_db[i].temperature;
				count++;
			}
		}
		avg = total/count;
		System.out.println("The average daily temperature for November is " + avg);
		/*//Exception is an error event that happens during the execution of a program that disruptss the normal flow 
		Scanner keyboard = new Scanner(System.in);
		double balance = 3000.0;
		System.out.println("Enter an amount to withdraw: ");
		double amount = keyboard.nextDouble();
		
		if (amount > balance)
		{
			throw new IllegalArgumentException("Amount exceeds balance");
		}
		balance = balance - amount;
		System.out.println("Your new balance is: " + balance);
		*/
	}

}
