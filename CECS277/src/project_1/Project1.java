package project_1;
/**
 * @author Gabriel Espejo 014487796
 * @since 16-1-2017
 * @version 1.0
 */
import java.util.Scanner;
import java.util.Random;

public class Project1 
{

	private static Scanner in = new Scanner(System.in);

	public static void main(String args[])
	{
		menu();
	}

	/**
	 * First/Main menu. Choices to translate a bar code into a zip code, translate a zip code into a bar code, 
	 * or exit the program
	 */
	public static void menu()
	{
		boolean cont = false;
		while(!cont)
		{
			System.out.println("1. Read a bar code");
			System.out.println("2. Read a zip code");
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

	/**
	 * Second menu. Choices to generate a random bar code to translate, enter a bar code to translate, or return to
	 * previous menu
	 */
	public static void menu1()
	{
		boolean cont = false;
		while(!cont)
		{

			System.out.println("1. Generate Random Bar Code");
			System.out.println("2. Enter Bar Code");
			System.out.println("3. Back");
			System.out.print(">>");
			if(in.hasNextInt())
			{
				int choice = in.nextInt();
				if(choice == 1) //doesn't work
				{
					Random random = new Random();
					String randomBar = "|";
					for(int i = 0; i < 30; i++)
					{
						int randomChar = random.nextInt(2);
						if(randomChar == 0)
						{
							randomBar = randomBar + ":";
						}
						else
						{
							randomBar = randomBar + "|";
						}
					}
					randomBar = randomBar + "|";
					System.out.println("Printed: " + randomBar);
					printZip(randomBar); //function 
					System.out.println();
				}
				else if(choice == 2)//asks user to enter a specific bar code
				{   
					in.nextLine();
					System.out.println("Enter Bar code");
					System.out.print(">>");
					String inBar = in.nextLine();
					System.out.println("Printed: " + inBar);
					printZip(inBar); //function 
					System.out.println();
				}
				else if
				(choice == 3){ //returns to previous menu, breaks loop
					cont = true;
				}
				else //keeps loop running if invalid input
				{
					System.out.println("Error. Try again");
				}
			}
			else
			{
				System.out.println("Error. Try again");
				in.next();
			}
		}
	}

	/**
	 * Third menu. Choices to generate a random zip code to translate, enter a zip code to translate
	 * or return to previous menu
	 */
	public static void menu2()
	{
		boolean cont = false;
		final int LOW = 10000; //lowest possible 5-digit zipcode
		final int HIGH = 99999; //highest possible 5-digit zipcode

		while(!cont)
		{
			System.out.println("1. Generate Random Zip Code");
			System.out.println("2. Enter Zip Code");
			System.out.println("3. Back");
			System.out.print(">>");
			if(in.hasNextInt())
			{
				int choice = in.nextInt();
				if(choice == 1)
				{
					Random random = new Random(); //random objcet
					long range =(long)HIGH - (long)LOW +1;
					long fraction = (long)(range * random.nextDouble());
					int randomZip = (int)(fraction + LOW);
					System.out.print("Printed: " + randomZip);
					printBar(randomZip);
					System.out.println();
				}
				else if(choice == 2)
				{
					System.out.println("Enter ZIP code");
					System.out.print(">>");
					int inZip = in.nextInt(); //input for zip code
					if(inZip > HIGH)
					{
						System.out.println("Invalid");
					}
					else
					{
						System.out.print("Printed: " + inZip);
						printBar(inZip);
						System.out.println();
					}
				}
				else if(choice == 3) //returns to previous menu, breaks loop
				{
					cont = true;
				}
				else // keeps loop running if invalid input
				{
					System.out.println("Error. Try again");
				}
			}
			else
			{
				System.out.println("Error. Try again");
				in.next();
			}
		}
	}

	/**
	 * Method to translate a single digit into a barcode string
	 * @param d the digit to translate
	 */
	public static void printDigit(int d)
	{
		if(d == 1){System.out.print(":::||");}
		else if(d == 2){System.out.print("::|:|");}
		else if(d == 3){System.out.print("::||:");}
		else if(d == 4){System.out.print(":|::|");}
		else if(d == 5){System.out.print(":|:|:");}
		else if(d == 6){System.out.print(":||::");}
		else if(d == 7){System.out.print("|:::|");}
		else if(d == 8){System.out.print("|::|:");}
		else if(d == 9){System.out.print("|:|::");}
		else if(d == 0){System.out.print("||:::");}
		else{System.out.println("Error");} //prints this if the integer entered is not a single digit number
	}

	/**
	 * Method to translate a single bar string into a digit
	 * @param code the string to translate
	 */
	public static void printBar(String code)
	{
		if(code.equals(":::||")){System.out.print("1");}
		else if(code.equals("::|:|")){System.out.print("2");}
		else if(code.equals("::||:")){System.out.print("3");}
		else if(code.equals(":|::|")){System.out.print("4");}
		else if(code.equals(":|:|:")){System.out.print("5");}
		else if(code.equals(":||::")){System.out.print("6");}
		else if(code.equals("|:::|")){System.out.print("7");}
		else if(code.equals("|::|:")){System.out.print("8");}
		else if(code.equals("|:|::")){System.out.print("9");}
		else if(code.equals("||:::")){System.out.print("0");}
		else{System.out.println("Error");} //prints this if the entered bar code doesn't match one of numbers
	}

	/**
	 * Method to convert a bar code into a zip code and the print it
	 * @param barCode the bar code that will be converted into a digit zip code
	 */
	public static void printZip(String barCode)
	{
		final int LIMIT = 5;
		String[] codeArray = barCode.substring(1).split("(?<=\\G.....)"); //divides the barcode string into 5 sections starting after the first character
		for(int i = 0; i < LIMIT; i++)
		{
			printBar(codeArray[i]);
		}
	}
	/**
	 * Method to convert a zip code into a barcode string
	 * @param zipCode the zip code that will be converted into a bar code
	 */
	public static void printBar(int zipCode)
	{
		String zip = Integer.toString(zipCode);
		int total = 0;
		for(int i = 0; i < zip.length(); i++) // for loop finds the added value of all the individual digits
		{
			char temp = zip.charAt(i);
			int tempDigit = Integer.parseInt(String.valueOf(temp));
			total = total + tempDigit;
		}
		System.out.println();
		System.out.print("|");
		for(int i = 0; i < zip.length(); i++) //for loop prints bar codes for individual digits
		{
			char temp = zip.charAt(i);
			int tempDigit = Integer.parseInt(String.valueOf(temp));
			printDigit(tempDigit);
		}
		if(total%10 != 0) //uses if the total added value of digits is not divisible by 10
		{
			printDigit(10 - total%10);
		}
		else //uses if total added value of digits is divisible by 10
		{
			printDigit(0);
		}
		System.out.print("|");
	}
}
