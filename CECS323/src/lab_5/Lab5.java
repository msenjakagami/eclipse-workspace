package lab_5;

import lab_2.Lab2;
import lab_3.ArrayUtil;

import java.util.*;
public class Lab5 {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		
		System.out.print("Enter a number\n>>");
		int n = in.nextInt();
		int[] a = ArrayUtil.randomIntArray(n);
		for(int i: a) {
			System.out.print(i + ", ");
		}
		heap_sort(a);
		System.out.println();
		for(int i: a) {
			System.out.print(i + ", ");
		}
		int momo = 100;
		n = 100000;
		long time1a = System.nanoTime();
		for(int i = 0; i < momo; i++) {
			a = ArrayUtil.randomIntArray(n);
			heap_sort(a);
		}
		long time1b = System.nanoTime();
		double heapavg = (time1b - time1a)/momo;
		System.out.println("\n");
		System.out.println("Heap Sort Avg running time: " + heapavg);
		
		long time2a = System.nanoTime();
		for(int i = 0; i < momo; i++) {
			a = ArrayUtil.randomIntArray(n);
			Lab2.quick_sort(a, 0, a.length-1);
		}
		long time2b = System.nanoTime();
		double quickavg = (time2b - time2a)/momo;
		System.out.println();
		System.out.println("Quick Sort Avg running time: " + quickavg);
		
		long time3a = System.nanoTime();
		for(int i = 0; i < momo; i++) {
			a = ArrayUtil.randomIntArray(n);
			SelectionSorter.sort(a);
		}
		long time3b = System.nanoTime();
		double selectavg = (time3b - time3a)/momo;
		System.out.println();
		System.out.println("Selection Sort Avg running time: " + selectavg);
		in.close();
	}
	
	public static void heap_sort(int[] a) {
		build_MaxHeap(a);
		for(int i = a.length-1; i >= 0; i--) {
			ArrayUtil.swap(a, 0, i);
			maxHeapify(a, i, 0);
		}
		
	}
	public static void build_MaxHeap(int[] a) {
		
		for(int i = a.length/2-1; i >= 0; i--) { //max heapify starting from the middle of the array to the beginning index
			//System.out.print(i + ", ");
			maxHeapify(a, a.length, i);
		}
		
	}
	
	public static void maxHeapify(int[] a, int n, int i) {
		int maxi = i; //max value is initialized as the root
		int lefti = 2 * i + 1; //left child is initialized as futher into the array
		int righti = 2 * i + 2; //right child is initialized as somewhere further into the array
		
		if(lefti < n && a[lefti] > a[maxi]) {//if left child is larger than maxvalue/root
			maxi = lefti; //switch largest value with left child
		}
		if(righti < n && a[righti] > a[maxi]) {//if right child is larger than maxvalue
			maxi = righti;//switch largest value with right child
		}
		if(maxi != i) {//if largest is not the root
			ArrayUtil.swap(a, i, maxi);
			//recusively heapify
			maxHeapify(a,n, maxi);
		}
	}
	
	
	
}
