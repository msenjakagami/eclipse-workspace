/**
 * Simulated model of a bug crawling up a pole
 * 
 * @author Gabe Espejo
 * @version 1.0
 * @since 2016-09-07
 * */
class Bug {
	private int height;
	/**
	* adds ten centimeters every time method is called
	* sets height to zero if equals 100
	*/
	public void up(){
		height = height + 10;
		if (height == 100){
			height = 0;
		}
	}
	
	/**
	* returns current height of Bug
	*/
	public int getPosition(){
		return height;
	}
}
public class BugTester {
	public static void main(String[] args)
	{
		Bug bugsy = new Bug();
		Bug itsyBitsy = new Bug();
		bugsy.up();
		bugsy.up();
		System.out.println(bugsy.getPosition());
		System.out.println("Expected: 20");
		itsyBitsy.up();
		itsyBitsy.up();
		itsyBitsy.up();
		System.out.println(itsyBitsy.getPosition());
		System.out.println("Expected: 30");
		for (int i = 1; i <= 8; i++) { 
			bugsy.up(); 
		}
		System.out.println(bugsy.getPosition());
		System.out.println("Expected: 0");
		bugsy.up();
		System.out.println(bugsy.getPosition());
		System.out.println("Expected: 10");
	}
}
