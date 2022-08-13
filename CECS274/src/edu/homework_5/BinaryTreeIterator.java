package edu.homework_5;
/**
 * Interface to create a Binary Tree Iterator
 * @author Gabriel
 * @version 1.0
 * @since 2016-12-27
 */
public interface BinaryTreeIterator {
	/**
	 * Accessor method. Returns true if there are more elements, and false if there aren't
	 * @return true if 
	 */
	public boolean hasNext();
	/**
	 * Mutator method. Steps through Binary Tree object and returns the data from the Nodes
	 * @return the data from the Node
	 */
	public Comparable<Object> next();
}
