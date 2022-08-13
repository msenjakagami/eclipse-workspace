package edu.project_2;
import java.util.Calendar;
/**
* a model that creates a 'call' object, assigning it the time of calling, the caller name, and whether it was incoming or outgoing
* <p>
* @author Gabe, Kian
* @version - 1.0
* @since 10/15/2016
*
*/

public class Call{
	
	private Calendar callTime;
  	private String status;
  	private String amPm;
  	private String name;
	private int hour;
  	private int minute;
  	private int month;
	private int day;
	private int year;
	
  	/**
  	 * Constructs a call for a number/contact with the current time and a status of incoming or outgoing.
  	 * @param status - contains if the call is incoming or outgoing.
  	 * @param name - the name or number of the call.
  	 */
    public Call(String status, String name){
    	this.status = status;
    	this.name = name;
      	callTime = Calendar.getInstance();
      	hour = callTime.get(Calendar.HOUR);
      	minute = callTime.get(Calendar.MINUTE);
      	month = callTime.get(Calendar.MONTH) + 1; //January is Calendar month 0  
		day = callTime.get(Calendar.DAY_OF_MONTH); 
		year = callTime.get(Calendar.YEAR);
      	if(callTime.get(Calendar.AM_PM) == 0){
      		amPm = "AM";
      	} 
		else{
			amPm = "PM";
		}
    }
    
    /**
     * returns the hour and minute the call was made
     * @return time - the time of the call.
     */
    public String getTime(){
    	String time = "";
    	if(minute < 10){
    		time = hour + ":"+ "0" + minute + " "+ amPm;
    	}
    	else{
    		time = hour + ":"+  minute + " "+ amPm;
    	}
	  
    	return time;
    }
    
    /**
     * Returns if the call was incoming or outgoing
     * @return status - the status of the call.
     */
    public String getStatus(){
    	return status;
    }
    
    /**
     * Returns the name attached to the call
     * @return name - the name of the call.
     */
    public String getName(){
    	return name;
    }
    
    /**
     * Returns the date of the call
     * @return - date the date the call was made
     */
    public String getDate(){
    	String date = "";
    	if(month < 10 && day < 10){
    		date = year + "-0" + month +"-0" + day;  //printing 0 in front of months 1 - 9
		}
		else if(month < 10){
			date = year + "-0" + month +"-" + day;
		}
		else if(day < 10){
			date = year + "-" + month +"-0" + day;
		}
		else{
			date = year + "-" + month +"-" + day;
		}
    	return date;
    }
  
}
