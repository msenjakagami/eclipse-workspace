import java.util.ArrayList;
import java.util.Arrays;
public class mar9Notes {
	public static void main (String[] args) {
	
		double[] values = {1,2,3,5.3,0,-3, 8};
		int length = values.length;
		
		//Enhanced for loop
		// -enhanced for loops make calling/visiting every element in the array easier to code
		/*
		for (double element : values) {
			//System.out.println(element);
			System.out.println(element * element);
		}
		
		for (int i = 0; i < length; i++) {
			System.out.println(values[i] * values[i]);
		}
		*/
		//Removing an element in array when order does not matter
		/*int pos = 1;
		values[pos] = values[length - 1];
		length--;
		System.out.println(Arrays.toString(values));*/
		/*int pos = 3;
		for (int i = pos * 1; i < length; i++) {
			values[i - 1] = values[i];
			
		}
		length--;
		System.out.println(Arrays.toString(values));*/
		//Swap two elements in an array: swap position 1 and 5
		/*int pos = 5;
		double temp = values[pos];
		values[5] = values[1];
		values[1] = temp;
		System.out.println(Arrays.toString(values));*/
		
		//copying arrays
		
		/*double[] copy = Arrays.copyOf(values,length);
		System.out.println(Arrays.toString(copy));
		//copy[0[ = 1035.3;
		values[0] = -98;
		System.out.println(Arrays.toString(values));
		System.out.println(Arrays.toString(copy));
		*/
		
		//2D arrays
		
		int[][] counts = {
							{0, 1, -20},
							{-3,0,2}				
						};
		System.out.println(Arrays.toString(counts[0]));
		
		//Print each element in 2d array
		
		for (int i = 0; i <= 1; i++){
			for (int j = 0; j <= 2; j++){
				System.out.printf("%5d)", counts[i][j]);
			}
			System.out.println();
			
			//compute row totals
			
			for (int k = 0; k < 2; k++){
				int row_total = 0;
				for (int l = 0; l < 3; l++) {
					row_total += counts[k][l];  
				}
				
				System.out.println("The row total for row " + k + " is " + row_total);
			}
		}
		//Find sum for all the entries in 2d array
		int total = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				total += counts[i][j];
			}
		}
		System.out.println("The sum of all the elements is " + total);
		double[][] new_array = new double[3][3];
		System.out.println(new_array[1][1]);
	
		/*Array Lists have two advantages:
		 	1. Array lists can grow and shrink in size/length.
		 	2. The Array list class supplies methods for common task such as removing and inserting elements.
		 
		  	Syntax: ArrayList<data type> name = new ArrayList<data type>()
		  	ArrayList is called a generic class because you can replace data type with String, double, integer...
		  	
		*/
		ArrayList<String> names = new ArrayList<String>();
		names.add("Kevin");
		names.add("Bob");
		System.out.println(names.get(0));
		System.out.println(names.size());
		names.set(1, "Susan");
		System.out.println(names);
	
		//Enhanced for loops for ArrayList
		for (String element:names){
			System.out.println(element);
		}
	
	ArrayList<String> copy_names = new ArrayList<String>(names);
	
	System.out.println(copy_names);
	
	ArrayList<Double> x = new ArrayList<Double>();
	x.add(2.0);
	System.out.println(x);
	
	ArrayList<Double> values1 = new ArrayList<Double>(Arrays.asList(0.2,-9.3,20.0,13.0));
	System.out.println(values1);
	
	/*
	  In Java, you cannot directly insert primitive type values (numbers, chharacters, boolean) into array lists.
	  For example, you cannot form an ArrayList by using ArrayList<int> or ArrayList<double>. Instead, you must use one of the wrapper classes.
	  
	  byte		Byte
	  boolean 	Boolean
	  char		Character
	  double 	Double
	  float		Float
	  int		Integer
	  long 		Long
	  short 	Short
	  
	  Conversion between primitive types and the corresponding wrapper class is automatic. 
	  This process is called auto-boxing.
	  
	 
	 */
	}
}
