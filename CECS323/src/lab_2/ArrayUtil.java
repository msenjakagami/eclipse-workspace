package lab_2;

import java.util.Random;

public class ArrayUtil {
	private static Random rand = new Random();
	private static final int max = 7000;
	private static final int min = -7000;
	
	/**
	 * swaps the i-th and j-th elements of the array a
	 * @param a - an array of integers
	 * @param i - index of i-th element
	 * @param j - index of j-th element
	 * */
	public static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}
	
	/**
	 * generates an array of random integers of length len, with 
	 * max value of an element maxVal
	 * @param len - the desired length
	 * @param maxVal - the largest value of an element in the array
	 * @return an array of random integers of length len
	 * */
	public static int[] randomIntArray(int len){
		int[] random = new int[len];
		
		for(int i = 0; i < len; i++){
			//random[i] = rand.nextInt(maxVal);
			random[i] = rand.nextInt((max - min) + 1) + min;
			
		}		
		return random;
	}
	public static double[] randomDoubleArray(int len, int maxVal){
		double[] random = new double[len];
		
		for(int i = 0; i < len; i++){
			random[i] = rand.nextInt(maxVal);
		}
		return random;
	}
	


}
