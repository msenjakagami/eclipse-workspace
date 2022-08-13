import java.util.Scanner;
import java.util.Arrays;
public class mar7LAB {
	public static void main(String[] args){
		typeArray();
	}	
	public static int typeArray () {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How long do you want the array? ");
		int l = keyboard.nextInt();
		double[] typeArray = new double[l];
		//double average = 0;
		
		
//		System.out.println("Enter a set of numbers to fill the array ");
		//int i = 0;
		typeArray[0] = 1;
		typeArray[1] = 2;
		typeArray[2] = 3;
		System.out.println(Arrays.toString(typeArray));
		/*
		while (i < l){
			double number = keyboard.nextDouble();
			typeArray[i] = number;
			i++;
			
		}
		System.out.println(typeArray[l]);
		*/
		sumArray(typeArray, l);
		averageArray(typeArray, l);
		maxArray(typeArray, l);
		standardDeviation(typeArray,l);
		
		return l;
	}
	public static void sumArray (double[] typeArray, int l){
		double sum = 0;
		for (int i = 0; i < l; i++) {
			sum +=typeArray[i];
		}
		System.out.println("The sum of the contents of the array is " + sum);

	}
	public static double averageArray (double[] typeArray, int l) {
		double average= 0;
		double mean = 0;
		for (int i = 0; i < l; i++) {
			mean += typeArray[i];
		}
		average = mean/typeArray.length;
		System.out.println("The average of the contents of the array is " + average);
		return average;
		
	}
	public static void maxArray (double[] typeArray, int l) {
		double maximum = typeArray[0];
		for (int i = 0; i < l; i++) {
			 maximum = typeArray[i];
		}
		System.out.println("The maximum value of the array is " + maximum);
	}
	public static void standardDeviation (double[] typeArray, int l) {
		averageArray(typeArray, l);
		double stdDev = 0;
		double[] differenceArray = new double[l];
		double[] squareArray = new double[l];
		for (int i = 0; i < l; i++) {
			differenceArray[i] = Math.abs(typeArray[i] - averageArray(typeArray, l));
			squareArray[i] = (int) Math.pow(differenceArray[i], 2);
		}
		double square = 0;
		for (int c = 0; c < l; c++) {
			square += squareArray[c];
			
		}
		double variance = square/l;
		stdDev = (int) Math.sqrt(variance);
		System.out.println("The standard deviation is " + stdDev);
	}

}
