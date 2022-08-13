import java.util.Arrays;
public class mar14Lab {
	public static void main (String[] args) {
		double [][] labArray = new double [][]{
				{2, 	7, 		-3, 	4},
				{3, 	7,		0.2,	4},
				{2.1, 	-7.3, 	10, 	6},
				{1, 	-4.9, 	3.14, 	0},
				
		};
		sumArray(labArray);
		maxArray(labArray);
		avgArray(labArray);
		stdDevArray(labArray);
		sumArrayC(labArray);
		avgArrayC(labArray);
		stdDevArrayC(labArray);
		}
	public static void sumArray(double [][] labArray){
		for (int i = 0; i < 4; i++){
			double rowTotal = 0;
			for (int j = 0; j < 4; j++) {
				rowTotal += labArray[i][j];  
			}
			
			System.out.println("a. The row total for row " + i + " is " + rowTotal);
	
		}
	}
	public static void maxArray(double [][] labArray){
		for (int i = 0; i < 4; i++){
			double rowMax = 0;
			for (int j = 0; j < 4; j++) {
				if (labArray[i][j] > rowMax){
					rowMax = labArray[i][j];
				} 
			}
			System.out.println("b. The maximum value for row " + i + " is "+ rowMax);
		}
		
	}
	public static double avgArray(double[][] labArray) {
		double average= 0;
		double mean = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				mean += labArray[i][j];	
			}
			average = mean/4;
			System.out.println("c. The average value of row " + i + " is " + average);
		}
		return average;
	
	}
	
	public static void stdDevArray(double[][] labArray){
		for (int i = 0; i < 4; i++) {
			double average = 0;
			double std = 0;
			for (int j = 0; j < 4; j++){
				average += labArray[i][j]/4;
				std = Math.sqrt(Math.pow(labArray[i][j]- average, 2)/3);
			}
			System.out.println("d. The standard Deviation for row " + i + " is " + std);
		}
	}
	public static void sumArrayC(double [][] labArray){
		for (int i = 0; i < 4; i++){
			double rowTotal = 0;
			for (int j = 0; j < 4; j++) {
				rowTotal += labArray[j][i];  
			}
			
			System.out.println("e1. The row total for column " + i + " is " + rowTotal);
	
		}
	}		
	public static double avgArrayC(double[][] labArray) {
		double average= 0;
		double mean = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				mean += labArray[j][i];	
			}
			average = mean/4;
			System.out.println("e2. The average value of column " + i + " the array is " + average);
		}
		return average;
	
	}
	public static void stdDevArrayC(double[][] labArray){
		for (int i = 0; i < 4; i++) {
			double average = 0;
			double std = 0;
			for (int j = 0; j < 4; j++){
				average += labArray[j][i]/4;
				std = Math.sqrt(Math.pow(labArray[j][i]- average, 2)/3);
			}
			System.out.println("e3. The standard Deviation for row " + i + " is " + std);
		}	
	}
}