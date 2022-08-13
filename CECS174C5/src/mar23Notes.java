import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class mar23Notes {
	public static void main(String[] args) throws FileNotFoundException {
		File inputFile = new File("C:\\Users\\Gabriel\\Desktop\\pop_data.txt");
		
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter("C:\\Users\\Gabriel\\Desktop\\java_text.txt");
		
		while(in.hasNextLine()){
			String line = in.nextLine();
			//System.out.println(line);
			int i = 0;
			while(!Character.isDigit(line.charAt(i))){
				i++;
			}
			String country = line.substring(0,i);
			String population = line.substring(i);
			country = country.trim();
//			System.out.println(country);
//			System.out.println(population);
			out.printf("%s" + "%s", country, population);
			out.println();
			
		}
		in.close();
		out.close();
	}
}
