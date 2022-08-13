package project_4;
/**
 * Sub-class of the clock class. Creates a clock based on an time offset from the system clock
 * @author Gabriel
 *
 */
public class WorldClock extends Clock {
/**
 * constructor. creates a world clock with the offset
 * @param offset 
 */
	public WorldClock(int offset){
		super();
		hour = hour + offset;
		int c = 0;
		if(hour > 23){
			for(int i = hour; i > 24; i--){
				c++;
			}
			hour = c;
		}
	}
}
