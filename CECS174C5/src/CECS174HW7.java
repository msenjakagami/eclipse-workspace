import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class CECS174HW7 {
	public static void main (String[] args) throws FileNotFoundException{
		
		//1 =======================================================
		System.out.println("1 =======================================================");
		File inputFile = new File("C:\\Users\\Gabriel\\Desktop\\hello.txt");
		String str = "Hello, World!";
		PrintWriter outputFile = new PrintWriter("C:\\Users\\Gabriel\\Desktop\\hello.txt");
		outputFile.println(str);
		outputFile.close();
		
		File ReadFile = new File("C:\\Users\\Gabriel\\Desktop\\hello.txt");
		Scanner read = new Scanner(ReadFile);
		String txt = read.nextLine();
		System.out.println(txt);
		
		//2 =======================================================
		System.out.println("2 =======================================================");
		System.out.println("Enter a directory path to find the file to read");
		Scanner keyboard = new Scanner(System.in);
		String readFile = keyboard.nextLine();
		//"C:\\Users\\Gabriel\\Desktop\\lamb.txt"
		File lambFile = new File(readFile);
		PrintWriter out = new PrintWriter("C:\\Users\\Gabriel\\Desktop\\lamb1.txt");
		Scanner in = new Scanner(lambFile);
		
		int i = 1; 
		String newLine = "";
		
		while(in.hasNextLine()){
			newLine = in.nextLine();
			out.println("/* " + i + "*/" + newLine);
			i++;
		}
		out.close();
		in.close();
		//3 ======================================================
		System.out.println("3 =======================================================");
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
		out1.close();
		in1.close();
		//4 =======================================================
		System.out.println("4 =======================================================");
		System.out.println("Enter a directory path to find the file to read ");
		Scanner in4 = new Scanner(System.in);
		String cFileName = in4.next();
		File cFile = new File(cFileName);	
		Scanner readcFile = new Scanner(cFile);
		double cFileNum = 0;
		double cTotal1 = 0;
		double cTotal2 = 0;
		while (readcFile.hasNextLine()) {
			String num = readcFile.nextLine();
			cFileNum++;
			for (int k= 0; k < num.length(); k++){
				if(Character.isSpaceChar(num.charAt(k)) && Character.isDigit(num.charAt(k-1))){
					String number = num.substring(0,k);
					cTotal1 += Double.parseDouble(number);
				}
				else if (Character.isSpaceChar(num.charAt(k)) && Character.isDigit(num.charAt(k+1))) {
					String number2 = num.substring(k, num.length());
					cTotal2 += Double.parseDouble(number2);
				}
			}
		}
		System.out.println("Column 1 average = " + cTotal1/cFileNum);
		System.out.println("Column 2 average = " + cTotal2/cFileNum);
		//5 =======================================================
		System.out.println("5 =======================================================");
		System.out.println("Enter a directory path to find the file to read ");
		Scanner in5 = new Scanner(System.in);
		//String counterFileName = in5.next();
		String counterFileName = "C:\\Users\\Gabriel\\Desktop\\lamb.txt";
		File counterFile = new File(counterFileName);	
		Scanner readCounterFile = new Scanner(counterFile);
		int lines = 0;
		int characters = 0;
		int words = 0;
		while (readCounterFile.hasNextLine()) {
			lines++;
			String line = readCounterFile.nextLine();
			line = line.trim();
			characters += line.length();
			String[] words1 = line.split("\\s+");
			words = words1.length;
			System.out.println();
			in5.close();
			readCounterFile.close();
		}
		System.out.println("words: " + words);
		System.out.println("lines: " + lines);
		System.out.println("characters: " + characters);
		
		//8 =======================================================
		System.out.println("8 =======================================================");
		//System.out.println("Enter a directory path to find the file to read ");
		Scanner in8 = new Scanner(System.in);
		Scanner in81 = new Scanner(System.in);
		String reversalName = in8.next();
		//String reversalName = "C:\\Users\\Gabriel\\Desktop\\Hello Printer.txt";
		File originalFile = new File(reversalName);	
		Scanner readoriginalFile = new Scanner(originalFile);		
		String reversedName = in81.next();
		//String reversedName = "C:\\Users\\Gabriel\\Desktop\\retnirP olleH.txt";
		PrintWriter reversedOutput = new PrintWriter(reversedName);
		while (readoriginalFile.hasNextLine()) {
			String reversedLine = readoriginalFile.nextLine();
			StringBuilder changeLine = new StringBuilder(reversedLine);
			reversedOutput.println(changeLine.reverse());
			}
		readoriginalFile.close();
		reversedOutput.close();
		//9 =======================================================
		System.out.println("9 =======================================================");
		System.out.println("Enter a directory path to find the file to read ");
		Scanner in9 = new Scanner(System.in);
		//String counterFileName = in9.next();
		String swaplineFileName = "C:\\Users\\Gabriel\\Desktop\\lamb.txt";
		File lineswapFile = new File(swaplineFileName);	
		Scanner readlineswapFile = new Scanner(lineswapFile);
		while (readlineswapFile.hasNextLine()) {
			
		}
		//19=======================================================
		Scanner keyboard1 = new Scanner(System.in);
		
		File powerFile = new File("C:\\Users\\Gabriel\\Desktop\\params.txt");
		Scanner readelectricityFile = new Scanner(powerFile);
		PrintWriter outputelectricityFile = new PrintWriter("C:\\Users\\Gabriel\\Desktop\\rc.txt");
		ArrayList<Double> array = new ArrayList<Double>();
		while (readelectricityFile.hasNextDouble()){
			double params = readelectricityFile.nextDouble();
			array.add(params);
		}
		// Start value is 0, end value is 1000
		for (int p = 0; p < array.get(4); p++){
			double voltage = array.get(0) * (1 - Math.pow(Math.E, -p/(array.get(1)*array.get(2))));
			outputelectricityFile.println(p + " " + voltage);
		}
		readelectricityFile.close();
		outputelectricityFile.close();
	
		//20=======================================================
	}
}
