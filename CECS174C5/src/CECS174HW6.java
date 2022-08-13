/*
RQ 1:
a. int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
b. int[] numbers = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
c. int[] numbers = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
d. int[] numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
e. int[] numbers = {1, 4, 9, 16, 9, 7, 4, 9, 11};
f. int[] numbers = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
g. int[] numbers = {0, 1, 2, 3, 4, 0, 1, 2, 3, 4};

RQ 3:
a. int[] a = {1, 1, 1, 1, 1, 1, 1, 1, 1};
b. int[] a = {1, 2, 3, 4, 5, 4, 3, 2, 1};
c. int[] a = {2, 3, 4, 5, 4, 3, 2, 1, 0};
d. int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0};
e. int[] a = {3, 6, 10, 15, 19, 22, 24, 25, 25};
f. int[] a = {0, 0, 0, 0, 0};
g. int[] a = {1, 2, 3, 4, 5};
h. int[] a = {1, 2, 3, 4};

RQ 6:
a. i <= 10 should be i < 10.
b. The array values aren't initialized, and there are no elements.

RQ 8:
a. for (int i = 0; i < values.length; i++) { total = total + x; }
b. for (int i = 0; i < values.length; i++) { if (x == target) { return true; } }
c. for (int i = 0; i < values.length; i++) { values[i] = 2 * x; }

Review Question 9:
a. for (double x : values) { total = total + values[i]; i++; }
b. int i = 1;
for (double x : values) { total = total + values[i]; }
c. for (double x : values) { if (values[i] == target) { return i;} }

RQ 25:
The variable values are not declared or initialized in the code. Assuming the programmer meant 
to initialize the array values to the array numbers in the for loop, they would've had to use correct 
syntax.*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class CECS174HW6 {
	public static void main(String[] args) 
	{
		//2
		//A
		int[] Array1 = {0, 1, 2 ,3 };
		arrayA(Array1);	
		//B
		int[] Array2 = {2, 4, 7, 9};
		arrayB(Array2);
		//C
		int[] Array3 = {3, 4, 9, 6, 5, 7};
		arrayC(Array3);
		//D
		int[]Array4 = { 1, 4, 5, 4, 6, 7};
		arrayD(Array4);
		//E
		int[]Array5 = {1, 3, 5, 7, 9};
		arrayE(Array5);
		
		
		//6
		alternateSum();
		
		//7
		reverseArray();
		
		//14
	        System.out.println("The Random Numbers are: ");
	        for (int i = 0; i < 20 ; i++) 
	        {
	        	ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList());
	        	int random = (int) (Math.random() * 99 + 1);
	            array1.add(random);
	            System.out.println(array1);            
	        }  
	    //34
	        Scanner keyboard = new Scanner(System.in);
	        int i = 0;
	        System.out.println("Enter a size for an array: ");
	        int size = keyboard.nextInt();
	        double[] values = new double[size];
	        System.out.println("Enter values for the array: ");
	        while (i < size){
	        	values[i] = keyboard.nextDouble();
	        	i++;
	        }

	        smooth(values, size);
	}
	//2
	public static void arrayA(int[] Array1){
		
		int pos = Array1.length - 1 ;
		int temp = Array1[pos];
		Array1[pos] = Array1[0];
		Array1[0] = temp;
		System.out.println(Arrays.toString(Array1));
	}
	public static void arrayB(int[] Array2){
		//should move all elements to the right by one
		//inputed {2 4 7 9}
		//should get {9 2 4 7}
		int last = Array2[Array2.length-1];
		
		for(int i = Array2.length -2; i >= 0; i--){
			
			Array2[i+1] = Array2[i];
		}
		Array2[0] = last;
		System.out.println(Arrays.toString(Array2));
	}
	public static void arrayC(int[] Array3){
		//c
		//replace all even elements with 0
		for(int i = 0; i < Array3.length ; i++){
			if(Array3[i]%2 == 0){
				Array3[i] = 0;
			}
		}
		System.out.println(Arrays.toString(Array3));
	}
	public static void arrayD(int[] Array4){
		//replace each element, except for first and last, with its larger neighbor.
		for(int i = 1; i < Array4.length - 1 ; i++){
			if (Array4[i] < Array4[i + 1])
			{
				Array4[i] = Array4[i + 1];
			}
			else if(Array4[i] < Array4[i - 1])
			{
				Array4[i] = Array4[i-1];
			}
		}
		System.out.println(Arrays.toString(Array4));
	}
	public static void arrayE(int[] Array5){
		int length = Array5.length;
		if(length%2 == 0){
			int pos = (Array5.length/2);
			int other_pos = (Array5.length/ 2) -1;
			
		}
		else if(length%2 != 0){ //for odd
			int pos = length/2;
			for (int i = pos +1; i < length; i++){
				Array5[i -1] = Array5[i];
			}
			length = length -1;
		}
		
		System.out.println(Arrays.toString(Array5));
	}	

	public static void removeMin(int[] array){
		int minimum = 0;
		for (int i = 1; i < array.length; i++){
			if (array[i] < array[minimum]){
				minimum = i;
			}
			int pos = i;
			array[pos] = array[array.length - 1];
		}
		System.out.println(Arrays.toString(array));
	}

	//6
	public static void alternateSum() {
		 int[] altsum = {1, 4, 9, 16, 9, 7, 4, 9, 11};
		 int fullaSum = altsum[0] - altsum[1] + altsum[2] - altsum[3] + altsum[4] - altsum[5] + altsum[6] - altsum[7] + altsum[8];
		 System.out.println("The alternating sum is: ");
		 System.out.println(fullaSum);
	}
	//7
	public static void reverseArray () {
		int[] values = {1, 4, 9, 16, 9, 7, 4, 9, 11};
		int l = values.length;
		for (int i = 0; i < l/2; i++) 
		{
			int temp = values[i];
		    values[i] = values[l - i - 1];
		    values[l - i - 1] = temp;
		}
		System.out.println("The reversed array is");
		System.out.println(Arrays.toString(values));
	}
	//34
	public static void smooth(double[] values, int size){
		for (int i = 0; i < size; i++){
		if (i == 0){
			values[i] = (values[i] + values[i + 1]) / 2;
		}
		else if (i == (size - 1)){
			values[i] = (values[i - 1] + values[i]) / 2;
		}
		else {
			values[i] = (values[i - 1] + values[i] + values [i + 1]) / 3;
		}
		System.out.println(values[i]);
		}
	}
}
