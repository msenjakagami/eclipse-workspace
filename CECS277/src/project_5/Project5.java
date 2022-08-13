package project_5;
import java.io.File;
import java.io.PrintWriter;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 * Project 5 CECS 277
 * @author Gabriel
 *
 */
public class Project5 {

	static 	Scanner in = new Scanner(System.in);
	static char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	static int[] counts = new int[26];
	static int[] counts1 = new int[26];
	static PrintWriter out;
	static PrintWriter out1;
/**
 * main function
 * @param args
 * @throws FileNotFoundException
 */
	public static void main(String[] args) throws FileNotFoundException{
		System.out.print("Enter the file name\n>>");
		String fileName = "C:\\Users\\gespe\\OneDrive\\Desktop\\CECS\\CECS\\CECS277\\";
		fileName = fileName + in.next() + ".txt";
		File inputFile = new File(fileName);
		String fileContent = new Scanner(inputFile).useDelimiter("\\Z").next();
		System.out.println(fileContent);
		System.out.println();
		int wordCount = fileContent.split("\\w+").length;
		System.out.println("Word count: " + wordCount);
		for(int i = 0; i < alphabet.length; i++){
			counts[i] = regex(fileContent, alphabet[i]);
		}
		System.out.println();
		for(int i = 0; i < counts.length; i++){
			System.out.println(alphabet[i] + " = " + counts[i]);
		}
		System.out.println(fileContent.length());
		int[] asciiN = encryption(fileContent);
		printOutput(fileContent, asciiN);
		decryptermain();

	}
/**
 * method to encrypt a file
 * @param fileContent the contents of the file to encrypt
 * @return int array
 */
	public static int[] encryption(String fileContent){
		boolean run = false;
		int key = 0;
		while(!run){
			System.out.print("Enter an encryption key\n>>");
			if(in.hasNextInt()){
				key = in.nextInt();
				if(key > 0 || key <= 0){
					run = true;
				}
				else{
					in.next();
					System.out.println("Invalid key");
				}
			}
			else{
				in.next();
				System.out.println("Invalid key");
			}
		}
		int[] asciiNumbers = new int[fileContent.length()];
		for (int i = 0; i < fileContent.length(); i++){
			asciiNumbers[i] = (int) fileContent.charAt(i);
		}
		final int limit = 122;
		final int start = 96;
		final int limit1 = 90;
		final int start1 = 64;
		for (int i = 0; i < fileContent.length(); i++ ){
			if(asciiNumbers[i] + key > limit || (asciiNumbers[i] + key > limit1 && asciiNumbers[i] + key < start))
			{
				int temp = 0;
				if(asciiNumbers[i] + key > limit){
					temp = limit - asciiNumbers[i];
					asciiNumbers[i] = start - temp + key;
				}
				else{
					temp = limit1 - asciiNumbers[i];
					asciiNumbers[i] = start1 - temp + key;
				}
			}

			else if(asciiNumbers[i] < start1 || (asciiNumbers[i] < start && asciiNumbers[i] > limit1)){
				asciiNumbers[i] = asciiNumbers[i];
			}
			else{
				asciiNumbers[i] = (asciiNumbers[i] + key);
			}
		}
		return asciiNumbers;
	}
/**
 * Printing encrypted file. Also creates encrypted file
 * @param fileContent 
 * @param asciiN
 * @throws FileNotFoundException
 */
	public static void printOutput(String fileContent, int[] asciiN)throws FileNotFoundException {
		System.out.print("Enter a file name\n>>");
		String path = "C:\\Users\\gespe\\OneDrive\\Desktop\\CECS\\CECS\\CECS277\\" + in.next() + ".txt";
		out = new PrintWriter(path);
		String[] asciiC = new String[fileContent.length()];
		for (int index = 0; index < fileContent.length(); index++){
			asciiC[index] = Character.toString((char) asciiN[index]);
			System.out.print(asciiC[index]);
			out.print(asciiC[index]);
		}
		System.out.println();
		out.close();
	}
	public static void printOutput1(String fileContent, int[] asciiN)throws FileNotFoundException {
		System.out.print("Enter a file name\n>>");
		String path = "C:\\Users\\gespe\\OneDrive\\Desktop\\CECS\\CECS\\CECS277\\" + in.next() + ".txt";
		out1 = new PrintWriter(path);
		String[] asciiC = new String[fileContent.length()];
		for (int index = 0; index < fileContent.length(); index++){
			asciiC[index] = Character.toString((char) asciiN[index]);
			System.out.print(asciiC[index]);
			out1.print(asciiC[index]);
		}
		System.out.println();
		out1.close();
	}
/**
 * 
 * @throws FileNotFoundException
 */
	public static void decryptermain() throws FileNotFoundException{
		System.out.print("Enter the file name\n>>");
		String fileName = "C:\\Users\\gespe\\OneDrive\\Desktop\\CECS\\CECS\\CECS277\\";
		fileName = fileName + in.next() + ".txt";
		File inputFile = new File(fileName);
		String fileContent = new Scanner(inputFile).useDelimiter("\\Z").next();
		System.out.println(fileContent);
		System.out.println();
		for(int i = 0; i < alphabet.length; i++){
			counts1[i] = regex(fileContent, alphabet[i]);
		}
		int[] asciiN = decryption(fileContent);
		String[] asciiC = new String[fileContent.length()];
		for (int index = 0; index < fileContent.length(); index++){
			asciiC[index] = Character.toString((char) asciiN[index]);
			System.out.print(asciiC[index]);
		}
		System.out.println();
		printOutput1(fileContent, asciiN);
	}
	/**
	 * 
	 * @param fileDe
	 * @return
	 */
	public static int[] decryption(String fileDe){
		boolean run = false;
		int key = 0;
		int neh = 0;
		for(int i = 0; i < counts1.length; i++){
			if(neh < counts1[i]){
				key = i;
				neh = counts1[i];
			}
		}
		key = key - 4;
		System.out.println();
		int[] asciiNumbers = new int[fileDe.length()];
		for (int i = 0; i < fileDe.length(); i++){
			asciiNumbers[i] = (int) fileDe.charAt(i);
		}
		final int limit = 123;
		final int start = 97;
		final int limit1 = 91;
		final int start1 = 65;
		key = -key;
		for (int i = 0; i < fileDe.length(); i++ ){

			if(asciiNumbers[i] + key < start1 && asciiNumbers[i] >= start1  || (asciiNumbers[i] + key > limit1 && asciiNumbers[i] + key < start))
			{ 	
				int temp = 0;
				if(asciiNumbers[i] + key < start1){ 
					temp = asciiNumbers[i] - start1;
					asciiNumbers[i] = limit1 + key + temp;
				}
				else{
					temp = asciiNumbers[i] - start; 
					asciiNumbers[i] = limit + key + temp;
				}
			}

			else if(asciiNumbers[i] < start1 || (asciiNumbers[i] < start && asciiNumbers[i] > limit1)){
				asciiNumbers[i] = asciiNumbers[i];
			}
			else{
				asciiNumbers[i] = (asciiNumbers[i] + key);
			}

		}
		return asciiNumbers;
	}

	private static int regex (String line, char alpha){ 
		line = line.toLowerCase();
		String regularExpr = String.valueOf(alpha); 
		Pattern pattern = Pattern.compile(regularExpr);
		Matcher m = pattern.matcher(line); 
		int count = 0;
		while(m.find()){
			count++;
		}
		return count;
	}	
	
}
