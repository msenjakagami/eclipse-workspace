package edu.project_4;

public class DLinkedListTester4 {

	public static void main(String[] args){
		DLinkedList list = new DLinkedList();
		list.addLast("There");
		list.addLast("is a new");
		list.addFirst("Hey you!");
		list.addLast("list in town.");

		ListIterator iter = list.listIterator();
		iter.next(); iter.next(); iter.next(); iter.next();
		iter.previous(); iter.previous(); iter.previous();	
		iter.remove();
		iter.next(); iter.next(); iter.next();
		iter.remove();	
		iter.previous();
		iter.add("element in town.");
		
		//Printing the list
		iter = list.listIterator();	
		System.out.print("\nList Contents: [" + iter.next());
		while(iter.hasNext()){
			System.out.print(", " + iter.next());
		}
		System.out.println("]");
		System.out.println("\nExpected: [There, is a new, element in town.]");
		
		//Replacing the second element
		iter.previous();
		iter.set("is an old");
		
		//Printing the list
		iter = list.listIterator();
		System.out.print("\nList Contents: [" + iter.next());
		while(iter.hasNext()){
			System.out.print(", " + iter.next());
		}
		System.out.println("]");
		System.out.println("\nExpected: [There, is an old, element in town.]");
				
	}
}
