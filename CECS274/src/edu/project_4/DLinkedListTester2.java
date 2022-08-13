package edu.project_4;

public class DLinkedListTester2 {
	public static void main(String[] args){
		DLinkedList list = new DLinkedList();
		list.addLast("There");
		list.addLast("is a new");
		list.addFirst("Hey you!");
		list.addLast("list in town.");
		

		
		ListIterator iter = list.listIterator();
		System.out.print("\nIterating Forward: \"");
		System.out.print(iter.next() + " " +iter.next() + " " + iter.next() + " " +iter.next() + "\"\n");
		System.out.println("Expected: \"Hey you! There is a new list in town.\"");
		
		
		System.out.print("\nIterating Backward: \"");
		System.out.print(iter.previous()+ " " + iter.previous()+" " + iter.previous() + "\"\n");
		System.out.println("Expected: \"is a new There Hey you!\"");
		
		System.out.println("\nRemoving: " + iter.remove());
		System.out.print("Expected: Hey you!");
		
		System.out.print("\nIterating Forward: \"");
		System.out.print(iter.next() + " " +iter.next() + " " + iter.next() + " " + "\"\n");
		
		System.out.println("\nRemoving: " + iter.remove());
		System.out.println("Expected: list in town.");
		
		System.out.println("\nIllegal Removal: ");
		System.out.println(iter.remove());
		

	}
}
