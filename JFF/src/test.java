import java.util.Scanner;
public class test {
	static Scanner in = new Scanner(System.in);
	public static void main(String args[]) {
		String x = "";
		String y = "";
		boolean cont = false;
		while(!cont){
			System.out.println("1. ");
			System.out.println("2. ");
			System.out.println("3. ");
			if(in.hasNextInt()){
				int choice = in.nextInt();
				if(choice == 1){
					System.out.println(in.toString());
					System.out.println("Enter x");
					x = in.nextLine();
					System.out.println(in.toString());
					System.out.println(x);
					System.out.println("Enter y");
					y = in.nextLine();
					System.out.println(y);
					System.out.println(in.toString());
				}
				else if(choice == 3){
					cont = true;
					
				}
			}
			else{
				in.next();
			}
		}
		
		
	}

}
