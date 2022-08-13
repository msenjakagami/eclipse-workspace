import java.util.Scanner;
import java.util.Arrays;
public class test {
public static void main(String[] args) {
	//Chapter 6: arrays
	//An array is a variable which stores a sequence of values all of the same data type
	Scanner keyboard = new Scanner(System.in);
	double[] numbers = {1.2, 2.1, -4, 7.6};
	
	System.out.println( numbers [2] + " " + numbers[1] );
	
	double[] values = new double[10];
	System.out.println(values[0]);
	
	values[0] = 23.1;
	System.out.println(values[0]);
	
	//System.out.println("How long do you want your array to be? ");
	//int l = keyboard.nextInt();
	//double[] y = new double[l];
	
	String [] cars = {"ford" , "chevy", "honda"};
	System.out.println(cars[1]);
	
	String[] more_cars = cars;
	more_cars[0] = "toyota";
	System.out.println(more_cars);
	System.out.println(cars[0]);
	/*
	double[] next_array = new double[5];
	int i = 0;
	System.out.println("Enter a number: ");
	while (keyboard.hasNextDouble()){
		double z = keyboard.nextDouble();
		
		while (i < 5){
		//	double z = keyboard.nextDouble();
			next_array[4] = z;
			i++;
		}
	}
*/	
	
	}
}
