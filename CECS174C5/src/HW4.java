import java.util.Scanner;
public class HW4 {
	public static void main(String[] args){
	double evenSum = 0;
	for (int i = 0; i < 101; i += 2) {
	    evenSum += i;
	}
	System.out.println("Sum of all evens: " + evenSum);
	
	double squareSum = 0;
	for (int i = 1; i < 101; i++) {
	    squareSum += i * i;	    
	}
	System.out.println("Sum of squares: " + squareSum);
	
	double powersSum = 0;
	for (int i = 0; i < 21; i++) {
	    powersSum 	+= Math.pow(2, i);
	}
	System.out.println("Sum of powers of 2: " + powersSum);
	
	
	Scanner input0 = new Scanner(System.in);
	System.out.print("Range a: ");
	int aRange = input0.nextInt();
	System.out.print("Range b: ");
	int bRange = input0.nextInt();
	double oddSum = 0;
	for (int i = aRange; i <= bRange; i++) {
	    if (i % 2 == 0) {
		oddSum += i;
	    }
	}
	System.out.println("Odd numbers in range a-b sum: " + oddSum);
	
	System.out.print("Number: ");
	int number = input0.nextInt();
	int oddDigitsSum = 0;
	while (number > 0) {
	    int digit = number % 10;
	    if (digit % 2 != 0) {
		oddDigitsSum += digit;
	    }
	    number /= 10;
	}
	System.out.printf("Sum of"  + number + "'s odd digits: " + oddDigitsSum);
	//
	}
}
