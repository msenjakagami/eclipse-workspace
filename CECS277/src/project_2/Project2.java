package project_2;
/**
 * @author Gabriel Espejo 014487796
 * @since 15-2-2017
 * @version 1.0
 */
import java.util.Scanner;

public class Project2 {
	
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		menu();
	}
	public static void menu()
	{
		boolean cont = false;
		while(!cont)
		{
			System.out.println("1. Calculate a Parallel Resonant Circuit");
			System.out.println("2. Calculate a Series Resonant Circuit");
			System.out.println("3. Exit program");
			System.out.print(">>");
			if(in.hasNextInt())
			{
				int choice = in.nextInt();
				if(choice == 1)
				{
					menu1(); //leads to sub-menu 1
				}
				else if(choice == 2)
				{
					menu2(); //leads to sub-menu 2
				}
				else if(choice == 3)
				{
					cont = true; //exits program
				}
				else //Verifies choice validity
				{
					System.out.println("Error. Try again");
					cont = false;
				}
			}
			else
			{
				System.out.println("Error. Try again");
				in.next();
			}
		}
	}
	
	public static void menu1()
	{
		boolean cont = false;
		boolean cont2 = false;
		boolean cont3 = false;
		double freq = 0;
		double band = 0;
		double gain = 0;
		while(!cont)
		{
			System.out.println("Please enter a Resonant Frequency");
			System.out.print(">>");
			if(in.hasNextDouble())
			{
				freq = in.nextDouble();
				cont = true;
			}
			else{System.out.println("Error. Try again");in.next();}
		}
		System.out.println("Entering Resonant Frequency of " + freq + " Hz...");
		while(!cont2)
		{
			System.out.println("Please enter a Bandwidth");
			System.out.print(">>");
			if(in.hasNextDouble())
			{
				band = in.nextDouble();
				cont2 = true;
			}
			else{System.out.println("Error. Try again");in.next();}
		}
		System.out.println("Entering Bandwidth of " + band + " Hz...");
		while(!cont3)
		{
			System.out.println("Please enter a Gain");
			System.out.print(">>");
			if(in.hasNextDouble())
			{
				gain = in.nextDouble();
				cont3 = true;
			}
			else{System.out.println("Error. Try again");in.next();}
		}
		System.out.println("Entering Gain of " + freq + " dB...");
		System.out.println();
		ResonantCircuit circuit = new ParallelResonantCircuit(freq, band, gain);
		System.out.println(circuit.toString());
	}
	
	public static void menu2()
	{
		boolean cont = false;
		boolean cont2 = false;
		boolean cont3 = false;
		double freq = 0;
		double band = 0;
		double gain = 0;
		while(!cont)
		{
			System.out.println("Please enter a Resonant Frequency");
			System.out.print(">>");
			if(in.hasNextDouble())
			{
				freq = in.nextDouble();
				cont = true;
			}
			else{System.out.println("Error. Try again");in.next();}
		}
		System.out.println("Entering Resonant Frequency of " + freq + " Hz...");
		while(!cont2)
		{
			System.out.println("Please enter a Bandwidth");
			System.out.print(">>");
			if(in.hasNextDouble())
			{
				band = in.nextDouble();
				cont2 = true;
			}
			else{System.out.println("Error. Try again");in.next();}
		}
		System.out.println("Entering Bandwidth of " + band + " Hz...");
		while(!cont3)
		{
			System.out.println("Please enter a Gain");
			System.out.print(">>");
			if(in.hasNextDouble())
			{
				gain = in.nextDouble();
				cont3 = true;
			}
			else{System.out.println("Error. Try again");in.next();}
		}
		System.out.println("Entering Gain of " + freq + " dB...");
		System.out.println();
		ResonantCircuit circuit = new SeriesResonantCircuit(freq, band, gain);
		System.out.println(circuit.toString());
	}
}
