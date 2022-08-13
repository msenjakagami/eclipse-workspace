package edu.project_4;

public class DLPriorityQueueTester3 {
	public static void main(String[] args){
		DLPriorityQueue names = new DLPriorityQueue();
		
		Contact abby = new Contact("Abby Z.", "5555555551", null);
		Contact bob = new Contact("Bobby Z.", "5555555552", null);
		Contact carlos = new Contact("Carlos Z.", "5555555553", null);
		Contact carmen = new Contact("Carmen Z.", "5555555554", null);
		Contact zoe = new Contact("Zoe K.", "", "cello@gmail.com");
		Contact zoe2 =  new Contact("Zoe K.", "232", "");
		Contact zu = new Contact("Zu");
		names.add(carmen);
		names.add(carlos);
		names.add(bob);
		names.add(abby);
		names.add(zoe);
		names.add(zu);
		names.add(zoe2);
		
		
		System.out.println(names.remove() +"\n");
		System.out.println(names.remove() +"\n");
		System.out.println(names.remove() +"\n");
		System.out.println(names.remove() +"\n");
		System.out.println(names.remove() +"\n");
		System.out.println(names.remove() +"\n");

		System.out.println(names.peek() +"\n");
		names.remove();
		
		System.out.println("Illegal Peek: ");
		names.peek();
	}
}
