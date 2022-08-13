import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class mar21LAB {
	public static void main(String[] args ) throws FileNotFoundException{
		conversion();
	}
	public static ArrayList<Double> conversion() throws FileNotFoundException {
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter input file name: ");
		String inputFileName = keyboard.next();	
		System.out.println("Enter output file name: ");
		String outputFileName = keyboard.next();
		
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		in.useDelimiter("[^A-Za-z-0-9]+");
		PrintWriter out = new PrintWriter(outputFileName);
		ArrayList<Double> numArray = new ArrayList<Double>();
		while(in.hasNextDouble())
		{
			double value = in.nextDouble();
			numArray.add(value);
		}
		System.out.println(numArray);
		int l = numArray.size();
		
		
		double sum= sumArray(numArray, l);
		System.out.println("The sum of the contents of the array is " + sum);
		System.out.println();
		double average = averageArray(numArray, l);
		System.out.println("The average of the contents of the array is " + average);
		System.out.println();
		double maximum = maxArray(numArray, l);
		System.out.println("The maximum value of the array is " + maximum);
		System.out.println();
		double stdDev  = standardDeviation(numArray, average, l);
		System.out.println("The standard deviation of the array is " + stdDev);
		System.out.println();
		out.println("The sum of the contents of the array is " + sum);
		System.out.println();
		out.println("The average of the contents of the array is " + average);
		System.out.println();
		out.println("The maximum value of the array is " + maximum);
		System.out.println();
		out.println("The standard deviation of the array is " + stdDev);
		System.out.println();
		
		in.close();
		out.close();
		return numArray;
	}
	public static double sumArray (ArrayList<Double> numArray, int l)
	{
	  double sum = 0;
	  for (int i = 0; i < l; i++) 
	  {
	   sum +=numArray.get(i);
	  }
	
	  return sum;
	}
	public static double averageArray (ArrayList<Double> numArray, double d) {
		  double average= 0;
		  double mean = 0;
		  for (int i = 0; i < d; i++) {
		   mean += numArray.get(i);
		  }
		  average = mean/d;
		  
		  return average;
		  
		 }
	public static double maxArray (ArrayList<Double> numArray, int l) {
		  double maximum = 0.0;
		  for (int i = 0; i < l; i++) {
			  if (numArray.get(i) > maximum) {
				  maximum = numArray.get(i);
			  }  
		  }
		 
		  return maximum;
		 }
	public static double standardDeviation (ArrayList<Double> numArray, double average, int l) {
		 double stdSum = 0; 

		 for (int i = 0; i < l; i++){ 

		 stdSum = Math.pow((numArray.get(i) - average), 2); 

		 } 

		 double stdDev= Math.sqrt(stdSum / (l - 1) ); 

		 
		 return stdDev;
	}
}