package lab_5;

import java.util.Arrays;


public class SelectionSorter {
	
	public static void main(String[] args){
		


	}
	
	public static void sort(double[] a){
		
		for(int i = 0; i < a.length; i++){
			//Find the position of minimum element beginning at i
			int minPos = minimumPosition(a, i);
			//Swap the i-th element with the minimum element
			swap(a, minPos, i);

		}
	}
	
	/**
	 * Returns the position of the minimum element
	 * */
	private static int minimumPosition(double[] a, int startingIdx){
		int minPos = startingIdx;
		for(int i = startingIdx+1; i < a.length; i++){
			if(a[minPos] > a[i]){
				minPos = i;
			}
		}
		return minPos;
	}

	public static void swap(double[] a, int i, int j){
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}

	
	public static void sort(int[] a){
		
		for(int i = 0; i < a.length; i++){
			//Find the position of minimum element beginning at i
			int minPos = minimumPosition(a, i);
			//Swap the i-th element with the minimum element
			swap(a, minPos, i);

		}
	}
	
	/**
	 * Returns the position of the minimum element
	 * */
	private static int minimumPosition(int[] a, int startingIdx){
		int minPos = startingIdx;
		for(int i = startingIdx+1; i < a.length; i++){
			if(a[minPos] > a[i]){
				minPos = i;
			}
		}
		return minPos;
	}

	public static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}

}
