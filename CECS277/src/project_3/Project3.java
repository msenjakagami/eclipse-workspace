package project_3;
import java.util.Scanner;
public class Project3 {
	private static Scanner in = new Scanner(System.in);
	private static Circle [] Circles = new Circle [3];
	private static Rectangle [] Rectangles = new Rectangle [3];
	private static Square [] Squares = new Square [2];
	public static void main(String[] args) {

		Circles [0] = new Cylinder();
		Circles [1] = new Cone();
		Circles [2] = new Circle();
		Rectangles [0] = new Prism();
		Rectangles [1] = new Pyramid();
		Rectangles [2] = new Rectangle();
		Squares [0] = new Cube();
		Squares [1] = new Square();

		Shape n = shapeMenu();
		int animation = animationMenu();
		/*continue your code to animate your object
	 Output all your calculated information and the physical attributes
	 of your objects before and after animation*/
	}

	public static int animationMenu() {
		System.out.println( "Animation Menu" );
		System.out.println( "1. Up" );
		System.out.println( "2. Down" );
		System.out.println( "3. Right" );
		System.out.println( "4. Left" );
		System.out.println( "5. Exit" );
		return in.nextInt();
	}

	public static Shape shapeMenu(){
		boolean next = false;
		int choice = 0;
		Shape ret = new Circle();
		while(!next){
			System.out.println("Shapes");
			System.out.println("1. Circles");
			System.out.println("2. Rectangles");
			System.out.println("3. Squares");
			System.out.println("4. Back");
			System.out.print(">>");
			if(in.hasNextInt()){
				choice = in.nextInt();
				if (choice == 1){
					boolean next1 =false;
					while(!next1){
						System.out.println("Circles");
						System.out.println("1. Cylinder");
						System.out.println("2. Cone");
						System.out.println("3. Circle");
						System.out.println("4. Back");
						System.out.print(">>");
						if(in.hasNextInt()){
							choice = in.nextInt();
							if (choice == 1){ret = Circles[0];next1 = true;next = true;}
							else if(choice == 2){ret = Circles[1];next1 = true;next = true;}
							else if(choice == 3){ret = Circles[2];next1 = true; next = true;}
							else if(choice == 4){next1 = true;}
							else{next1 =false;}
						}
						else{in.next();}
					}
				}
				else if(choice == 2){
					boolean next2 = false;
					while(!next2){
						System.out.println("Rectangles");
						System.out.println("1. Prism");
						System.out.println("2. Pyramid");
						System.out.println("3. Square");
						System.out.println("4. Back");
						System.out.print(">>");
						if(in.hasNextInt()){
							choice = in.nextInt();
							if (choice == 1){ret = Rectangles[0];next2 =true; next = true;}
							else if(choice == 2){ret = Rectangles[1];next2 =true; next = true;}
							else if(choice == 3){ret = Rectangles[2];next2 =true; next = true;}
							else if(choice == 4){next2 = true;}
							else{next2 = false;}
						}
						else{in.next();next2 = false;}
					}
				}
				else if(choice == 3){
					boolean next3 =false;
					while(!next3){
						System.out.println("Squares");
						System.out.println("1. Cube");
						System.out.println("2. Square");
						System.out.println("3. Back");
						System.out.print(">>");
						if(in.hasNextInt()){
							choice = in.nextInt();
							if (choice == 1){ret = Squares[0];next3 = true; next = true;}
							else if(choice == 2){ret = Squares[1];next3 = true; next = true;}
							else if(choice == 3){next3 = true;}
							else{next3 =false;}
						}
						else{next3 =false;}
					}
				}
				else if(choice == 4){next = true;}
				else{in.next(); next = false;}
			}
			else{in.next();}
		}
		return ret;
	}

	public static void calculateMenu(Shape n){
		boolean next =false;
		int choice = 0;
		while(!next){
			System.out.println("Calculations");
			System.out.println("1. Dimensions and Color");
			System.out.println("2. Get Volume");
			System.out.println("3. Get Surface Area");
			System.out.println("4. Exit");
			System.out.print(">>");
			if(in.hasNextInt()){
				choice = in.nextInt();
			}
			else{in.next();}
		}
	}
}
