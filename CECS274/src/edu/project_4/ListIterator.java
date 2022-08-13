package edu.project_4;


/**
 * Interface to be implemented by an iterator object
 * @author Gabriel
 *
 */

public interface ListIterator {
	/**
	 * Accessor method. Checks if there is an element after the iterator position
	 * @return true if the LinkedList is not empty and false otherwise
	 */
	boolean hasNext();
	/**
	 * Accessor method. Checks if there is an element before the iterator previous
	 * @return true if LinkedList is empty and false otherwise
	 */
	boolean hasPrevious();
	/**
	 * Mutator method. Adds an element before the iterator position and moves the iterator after the new element
	 * @param element the data to be added to the new Node
	 */
	void add(Object element);
	/**
	 * Mutator method. Changes the object's data to the inputed data
	 * @param the data to change the Node's to 
	 */
	void set(Object element);
	/**
	 * Mutator method. Removes the position element and changes the next and previous references of the other elemments
	 */
	Object remove();
	/**
	 * Mutator and Accessor method. Moves iterator past the position element and returns the data from this elment
	 * @return the data belonging to the new position Node 
	 */
	Object next();
	/**
	 * Mutator and Accessor method. Moves iterator backwards behind the previous element and returns the data from this element
	 * @return the data belonging to the new position Node
	 */
	Object previous();
}
