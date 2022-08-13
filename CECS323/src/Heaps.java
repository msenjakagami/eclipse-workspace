import java.util.*;

import lab_3.ArrayUtil;
public class Heaps {
	public static void main(String[] args) {
		Random num = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
		{
			int randomnum = num.nextInt(10000 + 1 + 10000)-10000;
			a[i] = randomnum;
		}
		for(int i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
		heap_sort(a);
		System.out.println();
		for(int i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
	}

	
	public static void heap_sort(int[] array)
	{
		int length = array.length;
		build_heap(array);
		
		for(int i = length-1; i >= 0 ; i--)
		{
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			max_heapify(array,i,0);
		}
		
	
	}
	
	public static void build_heap(int[] array)
	{
		int n = array.length;
		if(n > array.length) {
            n = array.length;
        }
		for(int i = n/2-1; i >= 0 ; i--)
		{
			max_heapify(array,i,n);
		}
		

	}
	
	public static void max_heapify(int[] array,int newsize,int i)
	{
		int max_index = i;
		int left_index = 2*i+1;
		int right_index = 2*i+2;
		if(left_index < newsize && array[left_index] > array[max_index])
		{
			max_index = left_index;
		}
		if(right_index < newsize && array[right_index] > array[max_index])
		{
			max_index = right_index;	
		}
		if(max_index != i)
		{
			int temp = array[max_index];
			array[max_index] = array[i];
			array[i] = temp;
			max_heapify(array,max_index,newsize);
		}
		
		/*
		 * 
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
		 */
		 /* int l = index * 2;
	        int r = l + 1;
	        int largest;

	        if(l <= heapSize && array[l - 1] > array[index - 1]) {
	            largest = l;
	        } else {
	            largest = index;
	        }

	        if(r <= heapSize && array[r - 1] > array[largest - 1]) {
	            largest = r;
	        }

	        if(largest != index) {
	            int temp = array[index - 1];
	            array[index - 1] = array[largest - 1];
	            array[largest - 1] = temp;
	            maxHeapify(array, largest, heapSize);
	        }*/
	}/*
	private static void heap_sort(int[] array) {
        int length = array.length;

        buildMaxHeap(array);
        for(int i = length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            maxHeapify(array, 1, i);
        }
    }

    private static void buildMaxHeap(int[] array) {
    	int heapSize = array.length;
        if(array == null) {
            throw new NullPointerException("null");
        }
        if(array.length <=0 || heapSize <= 0) {
            throw new IllegalArgumentException("illegal");
        }
        if(heapSize > array.length) {
            heapSize = array.length;
        }

        for(int i = heapSize/2; i > 0; i--) {
            maxHeapify(array, i, heapSize);
        }
    }

    private static void maxHeapify(int[] array, int index, int heapSize) {
        int l = index * 2;
        int r = l + 1;
        int largest;

        if(l <= heapSize && array[l - 1] > array[index - 1]) {
            largest = l;
        } else {
            largest = index;
        }

        if(r <= heapSize && array[r - 1] > array[largest - 1]) {
            largest = r;
        }

        if(largest != index) {
            int temp = array[index - 1];
            array[index - 1] = array[largest - 1];
            array[largest - 1] = temp;
            maxHeapify(array, largest, heapSize);
        }
    }*/
}
