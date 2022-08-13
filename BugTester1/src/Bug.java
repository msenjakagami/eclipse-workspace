/**
 * Simulated model of a bug crawling up a pole
 * 
 * @author Gabe Espejo
 * @version 1.0
 * @since 2016-09-07
 * */
public class Bug {
	private int height;
	/**
	* adds ten centimeters every time method is called
	* Or sets height to zero if equals 100
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
		/**
		 * @return returns integer height of bug
		 */
	}
}