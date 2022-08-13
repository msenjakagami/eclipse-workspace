package edu.project_4;

import java.util.NoSuchElementException;
/**
 * Object to model a priority queue using a doubly linked list
 * @author Gabriel
 * @version 1.0
 * @since 2016-11-28
 */
public class DLPriorityQueue {
	/**
	 * Inner class for a Node object. Holds references to the next and previous nodes, and the data that can be compared
	 * @author Gabriel
	 *
	 */
	class Node{
		Comparable data;
		Node next;
		Node previous;
	}
	
	private Node first;
	private Node last;
	
	/**
	 * Default constructor
	 */
	public DLPriorityQueue(){
		first = null;
		last = null;
	}
	
	/**
	 * Add method. Adds the data inputed into the priority queue. Compares data values to determine priority in queue
	 * @param dataY the data to be added to the Priority queue
	 */
	public void add(Comparable dataY){
		
		Node newNode = new Node();
		newNode.data = dataY;
		
		//CASE 1: Empty list
		if(first == null){
			newNode.next = first;
			first = newNode;
			last = newNode;
			//ENDS
		}
		//Case 2: Non-empty list
		else{
			Comparable dataA = first.data;
			//Case 2.1: Element should have highest priority
			if(dataA.compareTo(dataY) > 0){
				newNode.next = first;
				first.previous = newNode;
				if(last == first){last = newNode.next;}
				first = newNode;
			}
			//Case 2.2: Element has a lower priority than the first Element
			else{
				//Case 2.2.1: List only has one Element. Should only be called once
				if(first == last){ 
					newNode.previous = first;
					first.next = newNode;
					last = newNode;
				}
				Node current = first;
				while(current.next != null){
					Comparable dataX = current.data;
					Comparable dataZ = current.next.data;
					//Case 2.2.2: Element as a lower priority than the current element, but a higher priority than the next element
					if(dataX.compareTo(dataY) < 0 && dataZ.compareTo(dataY) >= 0){
						newNode.next = current.next;
						newNode.previous = current;
						current.next = newNode;
						break;
					}
					//Case 2.2.3: Element has a lower priority than the last element
					else if(current.next == last && dataZ.compareTo(dataY) < 0){
						newNode.previous = current.next;
						newNode.next = null;
						current.next.next = newNode;
						last.next = newNode;
						last = newNode;
						break;
					}
					current = current.next;
				}
			}
		}
	}
	/**
	 * Mutator and Accessor method. Sets next element to first element
	 * @return the first element in the priority queue
	 */
	public Object remove(){
		if (first == null) {throw new NoSuchElementException();}
		Object element = first.data;
		first = first.next;
		return element;
	}
	/**
	 * Accessor method. Returns data from first element
	 * @return the data from the first element
	 */
	public Object peek(){
		if (first == null){throw new NoSuchElementException();}
		return first.data;
	}
}
