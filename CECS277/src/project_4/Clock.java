package project_4;
import java.time.LocalTime;
/**
 * Clock class. simulates a clock that returns strings for hour, minute, and the time and can store alarms
 * @author Gabriel
 *
 */

public class Clock {

	protected int hour;
	protected int min;
	private String alarmHour;
	private String alarmMin;
/**
 * Default constructor. Sets time to system time
 */
	public Clock(){
		LocalTime time = LocalTime.now();
		hour = time.getHour();
		min = time.getMinute();
		alarmHour = null;
		alarmMin = null;
	}
/**
 * Accessor method. Returns the hour as a string
 * @return hour
 */
	public String getHours(){
		return Integer.toString(hour);
	}
/**
 * Accessor method. Returns the minute as a string
 * @return min
 */
	public String getMinutes(){
		if(min < 10){
			return "0" + Integer.toString(min);
		}
		else{
			return Integer.toString(min);
		}

	}
/**
 * Accessor method. Returns the time as a string in a 12 hour am/pm format and whether or not the alarm went off
 * @return time
 */
	public String getTime(){
		String time = "";
		if(hour > 12){
			time = hour - 12 + ":" + getMinutes() + " pm";
		}
		else if(hour == 12){
			time = "12:" + getMinutes() + " pm";
		}
		else if(hour == 0){
			time = "12:" + getMinutes() + " am";
		}
		else{
			time = hour + ":" + getMinutes() + " am";
		}
		if(alarmHour != null){
			int tHour = Integer.parseInt(alarmHour);
			int tMin = Integer.parseInt(alarmMin);
			if( hour >= tHour && min >= tMin){
				time = time +  " !Alarm!";
				alarmHour = null;
				alarmMin = null;
			}
		}


		return time;
	}
/**
 * Mutator method. Sets the alarm to the hour and minute passed in 
 * @param hours parameter for the alarm's hour
 * @param minutes parameter for the alarm's min
 */
	public void setAlarm(int hours, int minutes){
		alarmHour = Integer.toString(hours);
		alarmMin = Integer.toString(minutes);
	}
}


