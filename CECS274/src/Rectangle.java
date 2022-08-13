
public class Rectangle {
	
	public static void main(String[] args){
		printRectangle(5, 5);
	}
	public static void printRectangle(int w, int h){
		
		
		
		if(w <= 0 || h <= 0){
			System.out.println("");
		}
		else if(h==1){
			printWidth(w);
		}
		else{
			printWidth(w);
			System.out.println();
			printRectangle(w, h-1);
		}
	}
	
	public static void printWidth(int w){
		if (w <= 0){
			System.out.println("");
		}
		else if(w == 1){
			System.out.print("[]");
		}
		else{
			System.out.print("[]");
			printWidth(w-1);
		}
	}
}
