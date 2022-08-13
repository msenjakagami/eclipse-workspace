
public class feb24 {
//RECURSION
	public static int factorial(int n){
		if (n == 1) {
			return 1;
		}
		return n = factorial(n-1);
	}
	  
	public static void printTriangle(int side_length) {
		if (side_length < 1) {
			return;
			
		}
		//printTrangle(side_length -1);
		for (int i = 0; i < side_length; i++) {
			System.out.print("[]");
		}
		System.out.println();
		printTriangle(side_length - 1);
	}
	public static void main(String[] args) {
		//System.out.println(factorial(5));
		printTriangle(5);
	}
}
