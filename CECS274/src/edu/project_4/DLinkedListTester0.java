package edu.project_4;

public class DLinkedListTester0 {
	public static void main(String args[]){
		DLinkedList list = new DLinkedList();
		list.addLast("this");
		list.addLast("work");
		list.addFirst("won't");
		list.addFirst("Why");
		
		System.out.println(list.removeFirst());
		System.out.println(list.removeFirst());
		System.out.println(list.removeFirst());
		System.out.println(list.removeFirst());
		
		
//		ListIterator iter = list.listIterator();
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.hasPrevious());
//		System.out.println(iter.hasNext());
//		System.out.println(iter.previous());
//		System.out.println(iter.previous());
		
	}
}
