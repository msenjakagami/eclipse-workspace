package edu.project_2;
import java.util.ArrayList;
/**
 * LogEntry aggregates objects of the call class into an ArrayList\
 * <p>
 * 
 * @author Gabriel
 * @version 1.0
 * @since 2016-10-15
 */
public class LogEntry {
	private ArrayList<Call> calls;
	private String name;
	private int num;
	private String date;
	
	/**
	 * Overloaded constructor. Takes in the name of the caller and assigns it to the logEntry
	 * @param Call - call object
	 */
	public LogEntry(Call call){
		name = call.getName();
		calls = new ArrayList<Call>();
		calls.add(call);
		num = calls.size();
		date = call.getDate();
	}
	
	/**
	 * Accessor method. returns the LogEntry's caller name
	 * @return name - caller name
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * Accessor method. Displays the entire log entry
	 */
	public void displayEntry(){
		int num = 1;
    System.out.println(name + ":");
		for (Call i: calls){
			System.out.println("\t"+ num + ".------------------------------");
			System.out.print("\t");
			System.out.printf("%-15s%15s", "Status: ",  i.getStatus());
			System.out.print("\n\t");
			System.out.printf("%-15s%15s", "Time: ", i.getTime());
			System.out.println();
			num++;
		}
	}
	
	/**
	 * Mutator method. Adds a call to the ArrayList
	 * @param newCall - new Call object
	 */
	public void addEntry(Call newCall){
		calls.add(newCall);
		num = calls.size();
	}
	
	/**
	 * Accessor method. Returns the number of calls in the LogEntry
	 * @return
	 */
	public int getNumCalls(){
		return num;
	}
	
	/**
	 * Accessor method. Returns the date of the LogEntry
	 * @return date
	 */
	public String getDate(){
    	return date;
    }
}
