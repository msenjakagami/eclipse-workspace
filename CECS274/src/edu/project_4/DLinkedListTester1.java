package edu.project_4;


public class DLinkedListTester1 {
	
	public static void main(String[] args){
		DLinkedList list = new DLinkedList();		
		list.addLast("there");
		list.addLast("beautiful");
		list.addLast("list");
		list.addFirst("hello");
		

		System.out.println("Removing: " + list.removeFirst());
		System.out.println("Expected: hello\n");
		System.out.println("Removing: " + list.removeLast());
		System.out.println("Expected: list\n");
	
		System.out.println("Contains \"beautiful\": " +list.contains("beautiful"));
		System.out.println("Expected: true\n");
		System.out.println("Contains \"ther\": " + list.contains("ther"));
		System.out.println("Expected: false\n");

		list.addFirst("Is");
		list.addLast("solution?");
		
		System.out.println("First Element: " + list.getFirst());
		System.out.println("Expected: Is\n");
		
		System.out.println("Last Element: " + list.getLast());
		System.out.println("Expected: solution?\n");

	}

}