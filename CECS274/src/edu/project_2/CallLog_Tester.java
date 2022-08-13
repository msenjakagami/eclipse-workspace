package edu.project_2;

public class CallLog_Tester {
	public static void main(String args[]){
		CallLog log = new CallLog();
		Call call1 = new Call("outgoing", "Jerry");
		//LogEntry log1 = new LogEntry(call1);
		Call call2 = new Call("incoming", "Jerry");
		//log1.addEntry(call2);
		//log.addEntry(log1);
		Call call3 = new Call("outgoing", "911");
		//LogEntry log2 = new LogEntry(call3);
		log.addEntry(call1);
		log.addEntry(call2);
		log.addEntry(call3);
		log.displayLog();
		
	}
}
