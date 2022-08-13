package lab_1;
import java.util.*;

import lab_3.ArrayUtil;
public class Lab1 {
	private static Scanner in = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.print("Enter a number\n>>");
		int n = in.nextInt();
		int[] a = ArrayUtil.randomIntArray(n);


		MergeSorter.sort(a);
		boolean linear = false;
		long time1a = System.nanoTime();
		for(int i = 0; i < 500; i++) {
			Random rand = new Random();
			int num = rand.nextInt((n-0) + 1) + 0;
			int key = a[num];
			linear = linearSearch(a, key);
		}
		long time1b = System.nanoTime();
		double linearAvg = (time1b - time1a)/500;

		System.out.println(linear);
		System.out.println("Avg Running Time Linear: " + linearAvg);
		boolean binary = false;
		long time2a = System.nanoTime();
		for(int i = 0; i < 500; i++) {
			Random rand = new Random();
			int num = rand.nextInt((n-0) + 1) + 0;
			int key = a[num];
			binary = binarySearch(a, key);
		}
		long time2b = System.nanoTime();
		double binaryAvg = (time2b - time2a)/500;
		System.out.println(binary);
		System.out.println("Avg Running Time Binary: " + binaryAvg);
		main2();
	}

	//Part B
	public static void main2() {
		System.out.print("Enter a number\n>>");
		int n = in.nextInt();
		int[] a = ArrayUtil.randomIntArray(n);
		MergeSorter.sort(a);
		int key = 5000;
		long time1a = System.nanoTime();
		boolean linear = linearSearch(a, key);
		long time1b = System.nanoTime();
		double linearWorst = (time1b - time1a);
		System.out.println(linear);
		System.out.println("Worst Running Time Linear: " + linearWorst);
		double linearstep = linearWorst/n;
		System.out.println("Time for one step Linear: " + linearstep);
		long time2a = System.nanoTime();
		boolean binary = binarySearch(a, key);
		long time2b = System.nanoTime();
		double binaryWorst = (time2b - time2a);
		System.out.println(binary);
		System.out.println("Worst Running Time Binary: " + binaryWorst);
		double log = Math.log(n)/Math.log(2);
		double binarystep = binaryWorst/log;
		System.out.println("Time for one step Binary: " + binarystep);

		System.out.print("Enter another number\n>>");
		int n1 = in.nextInt();
	
		
		double estLinearWorst = n1 * (linearstep);
		double log1 = Math.log(n1)/Math.log(2);
		double estBinaryWorst = log1 * binarystep;
		System.out.println("Estimated time for linear search: " + estLinearWorst);
		System.out.println("Estimated time for binary search: " + estBinaryWorst);
		
		int[] a1 = ArrayUtil.randomIntArray(n1);
		MergeSorter.sort(a1);
		int key1 = 5000;
		long time1a1 = System.nanoTime();
		boolean linear1 = linearSearch(a1, key1);
		long time1b1 = System.nanoTime();
		double actuallinearWorst = (time1b1 - time1a1);
		//System.out.println(linear1);
		System.out.println("Actual Running Time Linear: \t" + actuallinearWorst);
		
		long time2a1 = System.nanoTime();
		boolean binary1 = binarySearch(a1, key1);
		long time2b1 = System.nanoTime();
		double actualbinaryWorst = (time2b1 - time2a1);
		//System.out.println(binary1);
		System.out.println("Actual Running Time Binary: \t" + actualbinaryWorst);
	}
	public static boolean linearSearch(int[] a, int key) {
		for(int i = 0; i < a.length; i++) {
			if(key == a[i]) {
				return true;
			}
		}
		return false;
	}
	public static boolean binarySearch(int[] a, int key) {
		int l = 0;
		int length = a.length -1;
		while(l <= length) {
			int mid = (l+length)/2;
			if(a[mid] < key) {
				l = mid + 1;
			}
			else if(a[mid] > key) {
				length = mid - 1;
			}
			else if(a[mid] == key){
				return true;
			}
			else {
				break;
			}
		}
		return false;

	}

	/**
	 * sorts an array of integers
	 * @param a - an array of integers
	 * */
	public static void sort(int[] a){
		// Base case: 
		// Don't do anything
		if(a.length <= 1){ return; }
		// Recursive step:
		// Split the array in half, sort the halves, merge the result
		else{ 

			int halfLength = a.length/2;
			int[] firstHalf = new int[halfLength];
			int[] secondHalf = new int[a.length - firstHalf.length];

			// Copying the elements of first half
			for(int i =0 ; i < firstHalf.length; i++){	
				firstHalf[i] = a[i];
			}

			// Copying elements of second half
			for(int i = 0 ; i <secondHalf.length; i++){
				secondHalf[i] = a[halfLength + i];
			}
			// Sort the first half
			sort(firstHalf);
			// Sort the second half
			sort(secondHalf);
			// Merge the sorted halves
			merge(firstHalf, secondHalf, a);
		}
	}

	/*
	 * private helper method that merges the arrays b and c into a
	 */
	private static void merge(int[] b, int[] c, int[] a){

		// Defining integer indices 
		int i = 0;		// index of array a
		int jFH = 0;	// index of array b
		int jSH = 0; 	// index of array c

		// Merging while the indices of b and c do not exceed the length
		while(jFH < b.length && jSH < c.length){
			if(b[jFH] < c[jSH]){
				a[i] = b[jFH];
				jFH++;
			}
			else{
				a[i] = c[jSH];
				jSH++;
			}
			i++;
		}

		// Merging any remaining elements in b
		while(jFH < b.length){
			a[i] = b[jFH];
			jFH++;
			i++;
		}

		// Merging any remaining elements in c
		while(jSH < c.length){
			a[i] = c[jSH];
			jSH++;
			i++;
		}
	}
}
