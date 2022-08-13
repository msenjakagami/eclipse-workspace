package lab_2;
import java.util.*;

import lab_3.ArrayUtil;
public class Lab2 {
	private static Scanner in = new Scanner(System.in);
	public static void main(String args[]) {
		//1
		System.out.print("Enter a number\n>>");
		int n = in.nextInt();
		//2	
		int[] a = ArrayUtil.randomIntArray(n);
//		for(int i: a) {
//			System.out.print(i + " ");
//		}
		System.out.println();
		//3
		int[] b = quick_sort(a,0,a.length-1);
//		for(int i:b) {
//			System.out.print(i + " ");
//		}
		System.out.println();
		//4
		int[] c = insertion_sort(a);
		//		for(int i:c) {
		//			System.out.print(i + " ");
		//		}
		System.out.println();
		//5
		//5a - average running time of quick sort
		long quickSortTotalTime = 0;
		long startTime = 0; 	
		long endTime = 0;
		int iter = 100;
		n = 10000;
		for(int i = 0; i < iter; i++)
		{
			a = ArrayUtil.randomIntArray(n);
			startTime = System.nanoTime();
			quick_sort(a,0,a.length-1);
			endTime = System.nanoTime();
			quickSortTotalTime += endTime - startTime;
		}
		long quickSortAverageTime = quickSortTotalTime/iter;
		System.out.println("Average quick sort running time: \t" + quickSortAverageTime + " nanoseconds");

		//5b - average running time of insertion sort
		long insertionSortTotalTime = 0;
		for(int i = 0; i < iter; i++)
		{
			a = ArrayUtil.randomIntArray(n);
			startTime = System.nanoTime();
			insertion_sort(a);
			endTime = System.nanoTime();
			insertionSortTotalTime += endTime - startTime;
		}
		long insertionSortAverageTime = insertionSortTotalTime/iter;
		System.out.println("Average insertion sort running time: \t" + insertionSortAverageTime + " nanoseconds");

		//7 - number of instructions in 1 second using insertion sort 
		double insertionSingle = insertionSortAverageTime/Math.pow(n, 2);
		double totalInstructions = (1/insertionSingle) * (Math.pow(10, 9));
		System.out.println("Total number of instructions in 1 second: " + totalInstructions + " instructions");
	}

	public static int[] insertion_sort(int[] a) {
		int size = a.length;
		for(int i = 1; i < size; i++) {
			int k = a[i];
			int j = i -1;
			while(j>=0 && a[j] > k) {
				a[j+1] = a[j];
				j = j-1;
			}
			a[j+1] = k;
		}
		return a;
	}

	public static int[] quick_sort(int a[], int low, int high){

		int size = high - low + 1;
		if (size <= 3) {
			//System.out.println("called");
			manual_sort(a, low, high);
		}
		else {
			int median = medianof3(a, low, high);
			int p = partition(a, low, high, median);
			quick_sort(a, low, p - 1);
			quick_sort(a, p + 1, high);
		}
		return a;
	}

	public static int partition(int a[], int low, int high, int median){

		int left = low;
		int right = high - 1;
		while(true) {
			while(a[++left] < median);
			while(a[--right] >  median);
			if(left >= right) {
				break;
			}
			else {
				ArrayUtil.swap(a, left, right);
			}	
		}
		ArrayUtil.swap(a, left, high - 1);
		return left;
	}

	public static int medianof3(int[] a, int low, int high) {
		int center = (low + high) / 2;
		if (a[low] > a[center]) {
			ArrayUtil.swap(a, low, center);
		}
		if (a[low] > a[high]) {
			ArrayUtil.swap(a, low, high);
		}
		if (a[center] > a[high]) {
			ArrayUtil.swap(a, center, high);
		}
		ArrayUtil.swap(a, center, high - 1);
		return a[high - 1];
	}
	public static void manual_sort(int[] a, int low, int high) {
		int size = high - low + 1;
		if (size <= 1)
			return;
		if (size == 2) {
			if (a[low] > a[high])
				ArrayUtil.swap(a, low, high);

		} 
		else {
			if (a[low] > a[high - 1])
				ArrayUtil.swap(a, low, high - 1);
			if (a[low] > a[high])
				ArrayUtil.swap(a, low, high);
			if (a[high - 1] > a[high])
				ArrayUtil.swap(a, high - 1, high);
		}
	}
}
