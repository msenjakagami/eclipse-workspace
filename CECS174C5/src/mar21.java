import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class mar21 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner keyboard = new Scanner(System.in);
		
		//Construct a variable that holds the name of the file
		System.out.println("Enter input file name: ");
		String inputFileName = keyboard.next();
		
		//Construct a variable that holds the name of the output file
		
		System.out.println("Enter output file name: ");
		String outputFileName = keyboard.next();
		
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		//in.useDelimiter("[^A-Za-z-0-9]+");
		in.useDelimiter("");
		PrintWriter out = new PrintWriter(outputFileName);
		
		/*double total = 0;
		while(in.hasNextDouble())
		{
			double value = in.nextDouble();
			out.printf("%15.2f\n", value);
			total = total + value;
		}
		out.printf("Total: %8.2f\n", total);*/
		
		while(in.hasNext())
		{
			String word = in.next();
			out.println(word);
		}
		
		in.close();
		out.close();
	}

}
