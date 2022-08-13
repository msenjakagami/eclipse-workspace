import java.util.Scanner;
public class CECS174HW5 {
	public static void main(String[] args) {
		//8
		/*Scanner enter = new Scanner(System.in);
		System.out.println("Enter a word");
		String word= enter.nextLine();
		System.out.println("The scrambled word is " + scramble(word));
		//9
		Scanner enter00 = new Scanner(System.in);
		Scanner enter01 = new Scanner(System.in);
		System.out.println("Enter values for radius and height");
		double r = enter00.nextDouble();
		double h = enter01.nextDouble();
		
		System.out.println("Sphere volume = " + sphereVolume(r));
		System.out.println("Sphere Surface Area = " + sphereSurface(r));
		System.out.println("Cylinder Volume = " + cylinderVolume(r, h));
		System.out.println("Cylinder Surface Area = " + cylinderSurface(r, h));
		System.out.println("Cone Volume = " + coneVolume(r, h));
		System.out.println("Cone Surface Area = " + coneSurface(r, h));
		//15
		Scanner enter02 = new Scanner(System.in);
		System.out.println("Enter a word to be reversed ");
		String str = enter02.nextLine();
		System.out.println(reverse(str));
		//19
		Scanner enter03 = new Scanner(System.in);
		System.out.println("Enter a positive integer ");
		int n = enter03.nextInt();*/
		//30
		/*Scanner enter04 = new Scanner(System.in);
		Scanner enter05 = new Scanner (System.in);
		System.out.println("Enter a password");
		String password = enter04.nextLine();
		System.out.println("Reenter to confirm the password ");
		String confirmation = enter05.nextLine();
		boolean condition;
		condition = passwordVerify(password);
		while (password != confirmation && !condition) {
			System.out.println("Password invalid please reenter");
			String Password = enter04.nextLine();
			System.out.println("Reenter to confirm");
			String Confirmation = enter05.nextLine();
			
		}
		if (passwordVerify(password)) {
			System.out.println("Password verified");
		}*/
		
		//33
		/*Scanner enter06 = new Scanner(System.in);
		System.out.println("Enter a value for radius 1 ");
		double R1 = enter06.nextDouble();
		System.out.println("Enter a value for radius 2 ");
		double R2 = enter06.nextDouble();
		System.out.println("Enter a value for n ");
		double N = enter06.nextDouble();
		System.out.println("Enter a value for thickness");
		double D = enter06.nextDouble();
		System.out.println("The focal length is " + focalLength(R1, R2, N, D));*/
		
		//34
		Scanner enter07 = new Scanner(System.in);
		Scanner enter08 = new Scanner(System.in);
		Scanner enter09 = new Scanner(System.in);
		System.out.println("Enter a value for the height");
		double height = enter07.nextDouble();
		System.out.println("Enter a value for the 1st radius");
		double radius1 = enter08.nextDouble();
		System.out.println("Enter a value for the 2nd radius");
		double radius2 = enter09.nextDouble();
		System.out.println("The Volume is " + frustrumConeV(radius1, radius2, height));
		System.out.println("The Surface Area is " + frustrumConeS(radius1, radius2, height));
		
		//
	}
	//8
	public static String scramble(String word) {
		String scrambledWord = " ";
		int getWordLength = word.length();
		 if (getWordLength <= 3)
		 {
			 return word;	 
		 }
			 
		 else { 
		      for (int i = 0; i <= getWordLength-1; i++) 
			  {  
		    	  char letter = word.charAt(i);
			      if (i == (int)((getWordLength/2)-1))
			          {
			              scrambledWord=scrambledWord+word.charAt(i+1)+word.charAt(i);
			              letter=word.charAt(i++);   
			          }
			 
			      else
			         {
			          scrambledWord=scrambledWord+letter;
			         }			           
			  }
		 }

		return scrambledWord;
	}
	//9
	public static double sphereVolume(double r) {
		double sVolume = (4.0 / 3) * Math.PI * Math.pow(r, 3);
		return sVolume;
	}
	public static double sphereSurface(double r) {
		double sSurface = 4.0 * Math.PI * Math.pow(r, 2);
		return sSurface;
	}
	public static double cylinderVolume(double r, double h) {
		double cVolume = Math.PI * Math.pow(r, 2) * h;
		return cVolume;
	}
	public static double cylinderSurface(double r, double h) {
		double cSurface = (2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2));
		return cSurface;
	}
	public static double coneVolume(double r, double h) {
		double coVolume = Math.PI * Math.pow(r, 2) * h/3;
		return coVolume;
	}
	public static double coneSurface(double r, double h) {
		double coSurface = Math.PI * r * (r + Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2)));
		return coSurface;
	}
	//15
	public static String reverse(String str){
		  if (str.length() > 1) { 
	            return reverse(str.substring(1)) + str.charAt(0); 
	        } 
	        return str; 
	}
	//19
	public static int recursion(int n) {
		int recurse = 0;
		/*if (n == 1) {
			x = a;
		}
		*/
		return recurse;
	}
	//30
	public static boolean passwordVerify(String password) {
	    Boolean oneUpper = false;
	    Boolean oneLower = false;
	    Boolean oneDigit = false;

	    if (password.length() < 8) { 
	        return false;
	    }

	    for (int i = 0; i < password.length(); i++) { 
	        if (Character.isUpperCase(password.charAt(i))) {
	            oneUpper = true;
	        }
	        else if (Character.isLowerCase(password.charAt(i))) {
	            oneLower = true;
	        }
	        else if (Character.isDigit(password.charAt(i))) {
	            oneDigit = true;
	        }
	    }

	    return (oneUpper && oneLower && oneDigit); 
	}
	//33
	//33
	public static double focalLength(double R1, double R2, double N, double D){
		double f = 0;
		double focalL = 1/f;
		f = (N-1) * (1/R1 - 1/R2 + ((N-1) * D) / (N * R1 * R2) );
		return focalL;
	}
	//34
	public static double frustrumConeV(double radius1, double radius2, double height) {
		double Volume = 0;
		Volume = 1/3 * Math.PI * height * (Math.pow(radius1, 2) + Math.pow(radius2, 2) + radius1 * radius2);
		return Volume;
	}
	public static double frustrumConeS(double radius1, double radius2, double height) {
		double SurfaceArea = 0;
		SurfaceArea = Math.PI *(radius1 + radius2) * Math.sqrt(Math.pow((radius1 - radius2), 2) + Math.pow(height, 2) ) + Math.PI * Math.pow(radius1, 2);
		return SurfaceArea;
	}
}


