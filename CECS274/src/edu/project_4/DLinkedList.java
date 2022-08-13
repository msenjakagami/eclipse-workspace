package edu.project_4;

import java.util.*;

/**
 * Project 4. Creates a Doubly LinkedList using Node objects. Contains methods for accessing, adding, and removing the first and last Nodes in the list
 * 
 * @author Gabriel
 * @version 1.0
 * @since 2016-11-27
 *
 */
public class DLinkedList {
	/**
	 * Inner class. Creates object "Node" that holds a value for data, and references to a previous and next "Node"
	 * @author Gabriel
	 *
	 */
	class Node{
		/**
		 * Instance variable. Holds value for data
		 */
		public Object data;
		/**
		 * Instance variable. Holds reference to next Node
		 */
		public Node next; //points to next Node
		/**
		 * Instance variable. Holds reference to previous Node
		 */
		public Node previous; //points to previous Node
	}
	/**
	 * Inner class. Creates "LinkedListIterator" objects and implements the ListIterator interface. 
	 * @author Gabriel
	 *
	 */
	class LinkedListIterator implements ListIterator{
		private Node position; //points to next Node
		private Node previous; //points to previous Node

		private boolean calledNext;
		private boolean calledPrevious;
		/**
		 * Default constructor. Sets the position and previous pointers to null and both conditions to false
		 */
		public LinkedListIterator(){
			position = null;
			previous = null;
			calledNext = false;
			calledPrevious = false;
		}

		/**
		 * Accessor method. Checks if there is an element after the iterator position
		 * @return true if the LinkedList is not empty and false otherwise
		 */
		public boolean hasNext(){
			if(position == null){
				return first != null;
			}
			else{
				return position.next != null;
			}
		}
		/**
		 * Accessor method. Checks if there is an element before the iterator previous
		 * @return true if LinkedList is empty and false otherwise
		 */
		public boolean hasPrevious(){
			if(previous == null){
				return first != null;
			}
			else{
				return position.previous != null;
			}
		}
		/**
		 * Mutator and Accessor method. Moves iterator past the position element and returns the data from this elment
	Kaz* @return the data belonging to the new position Node 
		 */
		public Object next(){
			if(!hasNext()){ throw new NoSuchElementException();}
			previous = position;
			calledNext = true;
			if(position == null){
				position = first;
			}
			else{
				position = position.next;
			}
			return position.data;
		}
		/**
		 * Mutator and Accessor method. Moves iterator backwards behind the previous element and returns the data from this element
		 * @return the data belonging to the new position Node
		 */
		public Object previous(){
			if(!hasPrevious()){throw new NoSuchElementException();}
			position = previous;
			calledPrevious = true;
			if(previous == null){
				position = last;
			}
			else{
				previous = position.previous;
			}
			return position.data;
		}
		/**
		 * Mutator method. Adds an element before the iterator position and moves the iterator after the new element
		 * @param element the data to be added to the new Node
		 */
		public void add(Object element){
			if(!calledPrevious && !calledNext){throw new IllegalStateException();}
			if(position == null){
				addFirst(element);
				position = first;
			}
			else{
				Node newNode = new Node();
				newNode.data = element;
				newNode.next = position.next;
				newNode.previous = position;
				position.next = newNode;
				position = newNode;
			}
			calledNext = false;
			calledPrevious = false;
		}
		/**
		 * Mutator method. Changes the object's data to the inputed data
		 * @param the data to change the Node's to 
		 */
		public void set(Object element){
			if(!calledPrevious || !calledNext){throw new IllegalStateException();}
			position.data = element;
		}
		/**
		 * Mutator method. Removes the position element and changes the next and previous references of the other elemments
		 */
		public Object remove(){
			if(!calledNext && !calledPrevious){ throw new IllegalStateException();}
			
			Object element = position.data;
			if(position == first){
				removeFirst();
			}
			else if(position == last){
				removeLast();
			}
			else{
				previous.next = position.next;
				position.next.previous = position.previous;
			}
			position = previous;
			calledNext = false;
			calledPrevious = false;
			return element;
		}

	}

	private Node first;
	private Node last;

	/**
	 * Constructor creates an empty linkedlist with two nodes that are both null
	 */
	public DLinkedList(){
		first = null;
		last = null;
	}

	/**
	 * Mutator method Creates a new Node and sets its data to the element parameter and 
	 * @param element data to be added as the new first Node in the LinkedList
	 */
	public void addFirst(Object element){
		Node f1 = first;
		Node newnode = new Node();
		newnode.data = element;
		newnode.next = f1;
		first = newnode;
		if(f1 == null){
			last = newnode;
		}
		else{
			f1.previous = newnode;
		}
	}
	/**
	 * Accessor method
	 * @return the data from the first Node in the DLinkedList
	 */
	public Object getFirst(){
		if (first == null){throw new NoSuchElementException();}
		return first.data;
	}
	/**
	 * Mutator method
	 * @return the data from the former first Node
	 */
	public Object removeFirst(){
		if(first == null){throw new NoSuchElementException();}
		Object element = first.data;
		first = first.next;
		return element;
	}

	/**
	 * Mutator method
	 * @param element the data to be added to the new last node
	 */
	public void addLast(Object element){
		Node l0 = last;
		Node newnode = new Node();
		newnode.data = element;
		newnode.previous = l0;
		last = newnode;
		if(l0 == null){
			first = newnode;
		}
		else{
			l0.next = newnode;
		}
	}
	/**
	 * Accessor method
	 * @return the data from the last Node in the DLinkedList
	 */
	public Object getLast(){
		if (last == null){throw new NoSuchElementException();}
		return last.data;
	}
	/**
	 * Mutator method
	 * @return the data from the former last Node
	 */
	public Object removeLast(){
		if(last == null){throw new NoSuchElementException();}
		Object element = last.data;
		last = last.previous;
		last.next = null;
		return element;
	}

	/**
	 *Returns an iterator for iterating through the list 
	 * @return an iterator for iterating through the list
	 */
	public ListIterator listIterator(){
		return new LinkedListIterator();
	}

	/**
	 * Accessor method. checks whether a specified variable exists in the LinkedList
	 * @param data the data that the user wants to find
	 * @return true if the data was found, false if not
	 */
 	public boolean contains(Object data){
		ListIterator iterator = listIterator();
		while(iterator.hasNext()){
			if(iterator.next().equals(data)){
				return true;
			}
		}
		return false;
	}
}
