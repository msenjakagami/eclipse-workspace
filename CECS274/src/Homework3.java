/**
 * Homework 3
 * @author Gabriel
 * @version 1.0
 * @since 2016-10-24
 *
 */
public class Homework3 {
	/**
	 * 
	 * 
	 * Tester
	 * @param args you know, I don't think I ever learned what this actually does
	 */
	public static void main(String args[]){
		System.out.println(find("",""));
		System.out.println("Expected: true\n");
		System.out.println(find("I love my CS courses!"," CS"));
		System.out.println("Expected: true\n");
		System.out.println(find("","Cookies."));
		System.out.println("Expected: false\n");
		System.out.println(find("Java","Python"));
		System.out.println("Expected: false\n");


		String string = "Today, Tuesday, March 22nd is going to be a wonderful day!";
		String str = "2nd";
		String str2 = "wonder";
		String str3 = " day!";
		String str4 = " Superman";
		
		System.out.println("\"" + str + "\"" + " was found at index " +indexOf(string, str) );
		System.out.println( "\"" + str2 + "\"" + " was found at index " + indexOf(string, str2) );
		System.out.println( "\"" + str3 + "\"" + " was found at index "+ indexOf(string, str3) );
		System.out.println("\"" + str4 + "\"" + " is not found.  Index is " + indexOf(string, str4));
	}
	/**
	 * Homework 3 Part 1
	 * @param text base text
	 * @param str substring 
	 * @return true of false or recursion
	 */
	public static boolean find(String text, String str){
		int subLen = str.length();
		if(subLen == text.length() && str.equals(text)){
			return true;
		}
		else if(text.length() < subLen){ 
			return false; 
		}
		else if(str.equals(text.substring(0, subLen))){ 
			return true; 
		}
		else{
			return find(text.substring(1), str);
		}
		
	}
	/**
	 * Homework 3 Part 2 
	 * @param text base text
	 * @param str substring
	 * @return true or false or recursion
	 */
	public static int indexOf(String text, String str){
		return indexPosOf(text, 0, str.length(), str);
	}
	
	private static int indexPosOf(String text, int startInd, int endInd, String str){
		if(endInd == text.length() + 1){
			return -1;
		}
		else if (str.equals(text.substring(startInd, endInd))){ 
			return startInd;
		}
		else{
			return indexPosOf(text, startInd + 1, endInd + 1, str);
		}
	}

}
