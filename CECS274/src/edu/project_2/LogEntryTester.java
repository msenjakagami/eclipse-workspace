package edu.project_2;

public class LogEntryTester {
	public static void main(String args[]){
		Call call1 = new Call("outgoing", "Jerry");
//		System.out.println(call1.getStatus());
//		System.out.println(call1.getName());
//		System.out.println(call1.getTime());
		LogEntry log1 = new LogEntry(call1);
		Call call2 = new Call("incoming", "Jerry");
		log1.addEntry(call2);
		Call call3 = new Call("outgoing", "911");
		LogEntry log2 = new LogEntry(call3);
		log1.displayEntry();
		log2.displayEntry();
	}

}
