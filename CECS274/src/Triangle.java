/**
 * Prints a right triangle given a width
 * @author Gabriel
 *
 */
public class Triangle {
	/**
	 * Prints each tier of the triangle
	 * @param l - length of row
	 */
	public static void printWidth(int l){
		if (l <= 0){
			System.out.println("");
		}
		else if (l == 1){
			System.out.println("[]");
		}
		else{
			System.out.print("[]");
			printWidth(l - 1);
		}
	}
	
	/**
	 * Prints full triangle 
	 * @param w - width of the triangle
	 */
	public static void printTriangle(int w){
		if(w <= 0){
			System.out.print("");
		}
		else if(w == 1){
			printWidth(w);
		}
		else{
			printTriangle(w - 1);
			printWidth(w);
			
		}
	}
	public static void main(String[] args){
		printTriangle(10);
		printTriangle(9);
		printTriangle(5);
		printTriangle(4);
//		printTriangle(0);
//		printTriangle(-1);
	}

}
