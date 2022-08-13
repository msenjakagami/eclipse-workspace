import java.util.Scanner;
public class CECS174HW2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//4
		System.out.println("Please enter two numbers");
		int x = keyboard.nextInt();
		int y = keyboard.nextInt();
		
		int sum = x + y;
		int difference = x - y;
		int product = x * y;
		int average = (x + y)/2;
		int distance = Math.abs(x - y);
		int min = Math.min(x, y);
		int max = Math.max(x, y);
		System.out.println("The sum is " + sum);
		System.out.println("The difference is " + difference);
		System.out.println("The product is " + product);
		System.out.println("The average is " + average);
		System.out.println("The distance is " + distance);
		System.out.println("The minimum is " + min);
		System.out.println("The maximum is " + max);
		System.out.println("==========================================================");
		//5
		System.out.println("Sum: 			" + sum);
		System.out.println("Difference:		" + difference);
		System.out.println("Product: 		" + product);
		System.out.println("Average: 		" + average);
		System.out.println("Distance: 		" + distance);
		System.out.println("Minimum: 		" + min);
		System.out.println("Maximum: 		" + max);
		System.out.println("==========================================================");
		//10
		int cost = keyboard.nextInt();
		int mpy = keyboard.nextInt();
		int gas = keyboard.nextInt();
		int efficiency = keyboard.nextInt();
		int resale = keyboard.nextInt();
		int total = cost +((mpy/efficiency) * 5 * gas) - resale;
		System.out.println("The total cost of the hybrid car is $" +total);
		System.out.println("==========================================================");
		//13
		System.out.println("Input an integer between 1,000 and 999,999 including the comma.");
		String number = keyboard.nextLine();
		int n = number.length();
		String sub1 = number.substring(0, n-4);
		String sub2 = number.substring(n-3);
		System.out.println(sub1 + sub2);
		System.out.println("==========================================================");
		//15
		String A = "+--+--+--+";
		String B = "|  |  |  |";
		System.out.println(A);
		System.out.println(B);
		System.out.println(A);
		System.out.println(B);
		System.out.println(A);
		System.out.println(B);
		System.out.println(A);
		System.out.println("==========================================================");
		//16
		System.out.println("Enter a five digit number ");
        int input = keyboard.nextInt();
        int digit1 = input % 10; 
        input /= 10;
        int digit2 = input % 10;
        input /= 10;
        int digit3 = input % 10;
        input /= 10;
        int digit4 = input % 10;
        int digit5 = input /  10;
        System.out.printf("%d %d %d %d %d", digit5 , digit4 , digit3 , digit2 , digit1);		
        System.out.println("==========================================================");
        //17
        final int minutestohour = 60;
        final int minutestoday = 24 * 60;     
        System.out.println("Input first time: ");
        int time1 = keyboard.nextInt();
        int firstTime = time1;
        int firstTimeInMinutes = firstTime / 100 * minutestohour + firstTime % 100;
        System.out.println("Input second time");
        int time2 = keyboard.nextInt();
        int secondTime = time2;
        int secondTimeInMinutes = secondTime / 100 * minutestohour + secondTime % 100;
        int minutes = secondTimeInMinutes - firstTimeInMinutes;
        minutes = (minutestoday + minutes) % minutestoday;
        int hours = minutes / 60;
        minutes %= 60;
        System.out.println(hours + " hours " + minutes + " minutes");
        System.out.println("==========================================================");
        //18
       
        //23
       
    }

}
