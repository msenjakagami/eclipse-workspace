package project__3;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSorter {


	public static void main(String[] args){
		String response;
		do{
			System.out.println("Enter the size of the array: ");

			Scanner in = new Scanner(System.in);
			int size = Integer.parseInt(in.nextLine().trim());
			double[] r = ArrayUtil.randomDoubleArray(size, 10);
			System.out.println("Unsorted: "+Arrays.toString(r));
			MergeSorter.sort(r);
			System.out.println("Sorted: " + Arrays.toString(r));
			System.out.println("Try again? (Y/N)");
			response = in.nextLine().trim();
		}while(response.equalsIgnoreCase("Y"));

	}

	/**
	 * sorts an array of integers
	 * @param a - an array of integers
	 * */
	public static void sort(double[] a){
		// Base case: 
		// Don't do anything
		if(a.length <= 1){ return; }
		// Recursive step:
		// Split the array in half, sort the halves, merge the result
		else{ 

			int halfLength = a.length/2;
			double[] firstHalf = new double[halfLength];
			double[] secondHalf = new double[a.length - firstHalf.length];

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
	private static void merge(double[] b, double[] c, double[] a){

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
