package lab_3;
import java.util.*;

public class Lab3 {
	private static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Enter a number\n>>");
		int n = in.nextInt();
		int[] a = ArrayUtil.randomIntArray(n);
		
		System.out.println("Random array:");
		for(int i: a) {
			System.out.print(i + " ");
		}
		//A
		System.out.println("Enter k:");
		int k = in.nextInt();
		System.out.println("Kth least element: " + quick_select(a, 0, n-1, k));
		
		System.out.print("Enter a number\n>>");
		n = in.nextInt();
		a = ArrayUtil.randomIntArray(n);
		
		System.out.println("Random array:");
		for(int i: a) {
			System.out.print(i + " ");
		}
		//B
		System.out.println("Enter k:");
		k = in.nextInt();
		
		System.out.println("K max elements: ");
		int[] max = maxK(a, k);
		for(int i: max) {
			System.out.print(i + " ");
		}
	}
	
	public static int quick_select(int a[], int left_index, int right_index, int k)
    {
		//System.out.print(k + " ");
		if (k > 0 && k <= right_index - left_index + 1) {
			int pivot_index = partition(a, left_index, right_index);//find pivot using median of 3
			//System.out.print(pivot + " " );
            if (pivot_index - left_index == k - 1) {
                return a[pivot_index];//if k found
            }
            if (pivot_index - left_index > k - 1) {
                return quick_select(a, left_index, pivot_index - 1, k);//if k is in left subarray 
            }
            int c = k - pivot_index + left_index - 1; //change index of k
            return quick_select(a, pivot_index + 1, right_index, c);//if k is in right subarray
		}
		return 0;//if k is greater than the array length
    }

    public static int partition(int a[], int left_index, int right_index){
    	int pivot_value = medianof3(a, left_index, right_index); //initialize the pivot as the value that is the median of the values at the far left, center, and far right
        int i = left_index;//initialize i as the index on the far left
        int pivot_index = right_index - 1;//index of pivot/median
        //System.out.println();
        for (int j = left_index; j <= pivot_index; j++) //step through loop from the start of the array to the index of the pivot
        {												//pivot index should be at the right - 1  
        	//System.out.print(i + " ");
        	//System.out.print(" [" + j + "] ");
        	
        	if (a[j] <= pivot_value){ 	
        		//System.out.print(" called ");
                ArrayUtil.swap(a, i, j);
                i++;
            }
        }
        
        ArrayUtil.swap(a, i, right_index);
        return i;
    }
    
    public static int medianof3(int[] a, int left_index, int right_index) {
		int center_index = (left_index + right_index) / 2;
		if (a[left_index] > a[center_index]) { //if value at far left is greater than value at center
			ArrayUtil.swap(a, left_index, center_index);
		}
		if (a[left_index] > a[right_index]) {//if value at far left is greater than value at far right
			ArrayUtil.swap(a, left_index, right_index);
		}
		if (a[center_index] > a[right_index]) {//if value at center is greater than value at far right
			ArrayUtil.swap(a, center_index, right_index);
		}
		ArrayUtil.swap(a, center_index, right_index - 1);//swaps median for value at far right minus 1
		return a[right_index - 1];
	}
    
    public static int[] maxK(int[] a, int k) {
    	int[] max = new int[k];
    	heap_sort(a);
    	int j = a.length - 1;
    	for(int i = 0; i < k; i++) {
    		max[i] = a[j];
    		j--;
    	}
    	return max;
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
