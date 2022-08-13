package edu.project_2;

import java.util.ArrayList;

/**
* simulates a recorded call history that holds objects of the LogEntry class
* @author Gabe, Kian
* @version - 1.0
* @since 10/12/16
*/

public class CallLog{
  	private ArrayList<LogEntry> history;
  
    /**
    * Default Constructor. creates and empty call history
    */
    public CallLog(){
        history = new ArrayList<LogEntry>();
    }

    /**
    * setter method. Adds a LogEntry object to the call history
    *@param entry - the LogEntry to be added
    */
    public void addEntry(Call call){
    	int pos = 0;
    	for(int i = 0; i < history.size(); i++){
    		LogEntry log_test = history.get(i);
    		if(call.getName().equals(log_test.getName())){
    			pos = i;
    			break;
    		}
    	}
    	if(pos == 0){
    		LogEntry newEntry = new LogEntry(call);
    		history.add(newEntry);
    	}
    	else{
    		history.get(pos).addEntry(call);
    	}
    }

   /**
    * displays entire call history
    */
    public void displayLog(){
    	int num = 1;
		for(LogEntry e : history){
			if (e.getNumCalls() == 1){
				System.out.println(num + ".------------------------------");
				System.out.printf("%-15s%15s", "Caller:", e.getName());
				System.out.println();
				System.out.printf("%-15s%15s", "Date:", e.getDate());
				System.out.println();
			}
			else{
				System.out.println(num + ".------------------------------");
				System.out.printf("%-15s%15s", "Caller:", e.getName());
				System.out.println();
				System.out.printf("%-15s%15s", "Times called:", e.getNumCalls());
				System.out.println();
				System.out.printf("%-15s%15s", "Date:", e.getDate());
				System.out.println();
			}
			num++;
		}
			
    } 	

}