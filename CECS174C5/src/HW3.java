import java.util.Scanner;
public class HW3 {
	public static void main(String[] args) {
		//3
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number to find out how many digits it has");
		int input1 = input.nextInt();
		if (input1 < 0) {
			input1 = input1 * -1;
		}
		if (input1 >= 10 && input1 < 100) {
			System.out.println("The number has two digits");
		}
		else if (input1 >= 0 && input1 < 10){
			System.out.println("The number has one digit");
		}
		else if (input1 >= 100 && input1 < 1000){
			System.out.println("The number has three digits");
		}
		else if (input1 >= 1000 && input1 < 10000){
			System.out.println("The number has four digits");
		}
		else if (input1 >= 10000 && input1 < 100000){
			System.out.println("The number has five digits");
		}
		else if (input1 >= 100000 && input1 < 1000000){
			System.out.println("The number has six digits");
		}
		else if (input1 >= 1000000 && input1 < 10000000){
			System.out.println("The number has seven digits");
		}
		else if (input1 >= 10000000 && input1 < 100000000){
			System.out.println("The number has eight digits");
		}
		else if (input1 >= 100000000 && input1 < 1000000000){
			System.out.println("The number has nine digits");
		}
		else if (input1 >= 1000000000){
			System.out.println("The number has ten digits");
		}
		else {
			System.out.println("The number has eleven digits");
		}
		//8
		System.out.println("Enter four numbers");
		Scanner input_1 = new Scanner (System.in);
		int x1 = input_1.nextInt();
		int x2 = input_1.nextInt();
		int x3 = input_1.nextInt();
		int x4 = input_1.nextInt();
		if (x1 == x2 && x3 == x4) {
			System.out.println(x1 +" "+ x2+" "+ x3 +" " + x4 + " Two pairs");
		}
		else if (x1 == x4 && x2 == x3){
			System.out.println(x1 +" "+ x2+" "+ x3 +" " + x4 + " Two pairs");
		}
		else {
			System.out.println(x1 +" "+ x2+" "+ x3 +" " + x4 + " Not two pairs");
		}
		//9
		System.out.println("Enter a tempature");
		Scanner input_2 = new Scanner (System.in);
		double temperature = input_2.nextDouble();
		System.out.println("Enter the temperature unit (C/F)");
		String temperature_unit = input_2.next();
		if (temperature_unit.equals("C")) {
			if (temperature >= 0 && temperature <= 100) {
				System.out.println("Water");
			}
			else if (temperature > 100) {
				System.out.println("Water vapor");
			}
			else {
				System.out.println("Ice");
			}
		}
		else if (temperature_unit.equals("F")) {
			if (temperature >= 32 && temperature <= 212) {
				System.out.println("Water");
			}
			else if (temperature > 212) {
				System.out.println("Water vapor");
			}
			else {
				System.out.println("Ice");
			}
		}
		//12
		Scanner input_3 = new Scanner (System.in);
		final double A = 4.0;
		final double B = 3.0;
		final double C = 2.0;
		final double D = 1.0;
		final double F = 0.0;
		final double adjustment = 0.3;
		System.out.println("Enter a letter grade");
		String grade = input_3.nextLine();
		double numericGrade = F;
		if (grade.charAt(0) == 'A') {
			numericGrade = A;
		} 
		else if (grade.charAt(0) == 'B') {
			numericGrade = B;
		} 
		else if (grade.charAt(0) == 'C') {
			numericGrade = C;
		} 
		else if (grade.charAt(0) == 'D') {
			numericGrade = D;
		} 
		else {
			numericGrade = F;
		} 
		if (grade.charAt(1) == '+') {
			numericGrade += adjustment;
		} 
		else if (grade.charAt(1) == '-') {
			numericGrade -= adjustment;
		}
		else if (grade.charAt(1) == ' ') {
			numericGrade = numericGrade * 1;
		}
		System.out.printf("Letter grade"+ grade + " = " + numericGrade); 
		//13
		Scanner input_4 = new Scanner(System.in);
		System.out.print("Enter a numeric grade between 0.0 - 4.0 ");
		double numericGrade1 = input_4.nextDouble();
		String letterGrade = "F"; 
		if (numericGrade1 == 4 || numericGrade1 >= 3.85) {
			letterGrade = "A";
		} 
		else if (numericGrade1 > 3.7) {
			letterGrade = "A-";
		} 
		else if (numericGrade1 > 3) {
			letterGrade = "B+";
		} 
		else if (numericGrade1 >= 2.85) {
			letterGrade = "B";
		} 
		else if (numericGrade1 >= 2.7) {
			letterGrade = "B-";
		} 
		else if (numericGrade1 > 2) {
			letterGrade = "C+";
		} 
		else if (numericGrade1 >= 1.85) {
			letterGrade = "C";
		} 
		else if (numericGrade1 >= 1.7) {
			letterGrade = "C-";
		} 
		else if (numericGrade1 > 1) {
			letterGrade = "D+";
		} 
		else if (numericGrade1 >= 0.85) {
			letterGrade = "D";
		} 
		else if (numericGrade1 >= 0.7) {
			letterGrade = "D-";
		} 
		else {
			letterGrade = "F";
		}
		System.out.println("Your grade is: " + letterGrade);
	//19
		Scanner input_5 = new Scanner(System.in);
		System.out.println("Enter the first number ");
		double number1 = input_5.nextDouble();
		System.out.println("Enter the second number ");
		double number2 = input_5.nextDouble();
		
		if (Math.abs(number1 - number2) <= 0.01) {
		    System.out.println("They're the same");
		}
		else {
		    System.out.println("They're different");
		}
		//22
		Scanner input_6 = new Scanner(System.in);
		final double rate1 = .10;
		final double rate2 = .15;
		final double rate3 = .25;
		double tax = 0;
				
		System.out.print("What is your income? ");
		double income = input_6.nextDouble();
		
		System.out.print("What is your status? Enter m for married, s for single: ");
		String status  = input_6.next();
		
		if (status.equals("s")) {
			if (income <= 8000 ) {
				tax = rate1 * income;
				
			}
			else if (income <= 32000){
				tax = (rate2 * income) + 800;
			}
			else {
				tax = (income * rate3) + 4400;
			}
		}
		else if (status.equals("m")) {
			if(income <= 16000) {
				tax = rate1 * income;	
			}
			else if (income <= 64000) {
				tax = (income * rate2) + 1600;
			}
			else {
				tax = (rate3 * income) + 8800; 
				
			}
		}
		System.out.println("The total tax is: $" + tax);
		//27
		Scanner input_7 = new Scanner(System.in);
		System.out.println("Enter a numerical month (1 for January, 12 for December");
		int month = input_7.nextInt();
		if (month == 2) {
			System.out.println("28 or 29 days");
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("30 days");
		}
		else {
			System.out.println("31 days");
		}
		//32
		Scanner input_8 = new Scanner(System.in);
		final int PIN = 1234;
		int tries = 3; 
		boolean correct = false;
		System.out.println("Enter the user pin ");
		int input9 = input_8.nextInt();
		while (tries > 1) {
			if (input9 == PIN) {
				correct = true;
			}
			System.out.println("Invalid pin. Try again");
			tries -= 1; 
			input9 = input_8.nextInt();
		}
		if (correct) {
			System.out.println("Correct PIN code");
		}
		else {
			System.out.println("Your card has been blocked");
		}
		//35
		Scanner input_9 = new Scanner(System.in);
	     double radioWave = 0.1;
	     double radioFrequency = Math.pow(3, 9) ;
	     double microWave = .001;
	     double microFrequency = Math.pow(3, 11);
	     double infraredWave = .0000001;
	     double infraredFrequency = Math.pow(4, 14);
	     double visibleWave = Math.pow(4, -7);
	     double visibleFrequency = Math.pow(7.5, 14);
	     double ultraRay = Math.pow(10, -8);
	     double ultraFrequency = Math.pow(3, 16);
	     double xRay = Math.pow(10, -11);
	     double xFrequency = Math.pow(3, 19);
	     double gammaRay = Math.pow(10, -11);
	     double gammaFrequency = Math.pow(3, 19);
	     System.out.println("Enter the wavelength: ");

	     double Wave = input_9.nextDouble();
	     double Frequency = 0;
	     String Type = "";
	     
	     if ( Wave >= radioWave){
	       Frequency = radioFrequency;
	       Type = "Radio";
	     }
	     else if ( Wave >= microWave ){
	       Frequency = microFrequency;
	       Type = "Micro";
	     }
	     else if ( Wave >= infraredWave){
	       Frequency = infraredFrequency;
	       Type = "Infrared"; 
	     }
	     else if ( Wave >= visibleWave){
	       Frequency = visibleFrequency;
	       Type = "Visible";
	     }
	     else if ( Wave >= ultraRay){
	       Frequency = ultraFrequency;
	       Type = "Ultra";
	     }
	     else if ( Wave >= xRay){
	       Frequency = xFrequency;
	       Type = "X-Ray";
	     }
	     else if ( Wave < gammaRay){
	       Frequency = gammaFrequency;
	       Type = "Gamma";
	     }
	     
	     System.out.printf("The wavelength is " + Wave + ": it is a " + Type + " wave with a frequency of "+ Frequency); 
	}
}