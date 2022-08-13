import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CECS174HW7B {
	public static void main(String[] args) throws FileNotFoundException {
	//3 ======================================================
			String input;
			String output;
			if (args.length != 2){
			System.out.println("Enter a directory path to find the file to read ");
			Scanner keyboardIn = new Scanner(System.in);
			input = keyboardIn.next();
			System.out.println("Enter a directory path to find the file to rewrite");
			Scanner keyboardOut = new Scanner(System.in);
			output = keyboardOut.next();
			keyboardIn.close();
			keyboardOut.close();
			}
			else {
				input = args[0];
				
				output = args[1];
			}
			File lambFile2 = new File(input);
			Scanner in1 = new Scanner(lambFile2);
			PrintWriter out1 = new PrintWriter(output);
			
			int j = 1; 
			String newLine1 = "";
			
			while(in1.hasNextLine()){
				newLine1 = in1.nextLine();
				out1.println("/* " + j + "*/" + newLine1);
				j++;
			}
			//
			//
			out1.close();
			in1.close();
	}
}
