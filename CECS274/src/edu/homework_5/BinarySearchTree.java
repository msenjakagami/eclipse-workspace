package edu.homework_5;

import java.util.NoSuchElementException;
import java.util.Stack;


/**
 * This class implements a binary search tree whose
 * nodes hold objects that implement the Comparable
 * interface.
 * EDIT: Original code had min and max switched when using ints/doubles. When using Strings, Minimum was the one closest to "Z" 
 * while Maximum was the one closest to "A", which was incorrect when using Numbers
 * @author Gabriel
 * @version 2.1
 * @since 2016-12-12
 */
public class BinarySearchTree{  

	/**
	   A node of a tree stores a data item and references
	   to the left and right child nodes.
	 */
	class Node{  
		public Comparable<Object> data;
		public Node left;
		public Node right;

		/**
	      Inserts a new node as a descendant of this node.
	      @param newNode the node to insert
		 */
		public void addNode(Node newNode)
		{  
			int comp = newNode.data.compareTo(data);
			if (comp < 0){  
				if (left == null) { left = newNode; }
				else { left.addNode(newNode); }
			}
			else if (comp > 0){  
				if (right == null) { right = newNode; }
				else { right.addNode(newNode); }
			}
		}
	}

	private class InorderIterator implements BinaryTreeIterator{

		private Stack<Node> iter = new Stack<Node>();

		/**
		 * Default constructor. Adds the left tree Elements to the Stack object
		 */
		public InorderIterator(){
			Node temp = root;
			if(temp.left == null){iter.push(temp);}
			else{
				while(temp.left != null){
					iter.push(temp);
					temp = temp.left;
					if(temp != null && temp.left == null){
						iter.push(temp);
						break;
					}
				}
			}
		}

		/**
		 * Accessor method. Checks if the Stack object is empty, which would mean there are no more elements in the Binary Tree
		 * @return True if there are more elements in the stack, false if it's empty
		 */
		public boolean hasNext(){
			if(iter.isEmpty()){
				return false;
			}
			else{
				return true;
			}
		}
		/**
		 * Mutator method and Accessor method. Removes the top element from the stack, and then checks 
		 */
		public Comparable<Object> next() {
			if(hasNext()){
				Node temp = iter.pop();
				if(temp.right != null){
					Node temp2 = temp.right;
					if(temp2.left == null){iter.push(temp2);}
					else{
						while(temp2.left != null){
							iter.push(temp2);
							temp2 = temp2.left;
							if(temp2 != null && temp2.left == null){
								iter.push(temp2);
								break;
							}
						}
					}
				}
				return temp.data;
			}
			else{
				throw new NoSuchElementException();
			}

		}

	}

	private Node root;

	/**
   Constructs an empty tree.
	 */
	public BinarySearchTree(){  
		root = null;
	}

	/**
   Inserts a new node into the tree.
   @param obj the object to insert
	 */
	public void add(Comparable obj){  
		Node newNode = new Node();
		newNode.data = obj;
		newNode.left = null;
		newNode.right = null;
		if (root == null) { root = newNode; }
		else { root.addNode(newNode); }
	}

	/**
   Tries to find an object in the tree.
   @param obj the object to find
   @return true if the object is contained in the tree
	 */
	public boolean find(Comparable obj){
		Node current = root;
		while (current != null){
			int d = current.data.compareTo(obj);
			if (d == 0) { return true; }
			else if (d > 0) { current = current.left; }
			else { current = current.right; }
		}
		return false;
	}

	/**
   Tries to remove an object from the tree. Does nothing
   if the object is not contained in the tree.
   @param obj the object to remove
	 */
	public void remove(Comparable obj){
		// Find node to be removed

		Node toBeRemoved = root;
		Node parent = null;
		boolean found = false;
		while (!found && toBeRemoved != null){
			int d = toBeRemoved.data.compareTo(obj);
			if (d == 0) { found = true; }
			else{
				parent = toBeRemoved;
				if (d > 0) { toBeRemoved = toBeRemoved.left; }
				else { toBeRemoved = toBeRemoved.right; }
			}
		}

		if (!found) { return; }

		// toBeRemoved contains obj

		// If one of the children is empty, use the other

		if (toBeRemoved.left == null || toBeRemoved.right == null){
			Node newChild;
			if (toBeRemoved.left == null){
				newChild = toBeRemoved.right;
			}
			else{
				newChild = toBeRemoved.left;
			}

			if (parent == null){ // Found in root
				root = newChild;
			}
			else if (parent.left == toBeRemoved){
				parent.left = newChild;
			}
			else{
				parent.right = newChild;
			}
			return;
		}

		// Neither subtree is empty

		// Find smallest element of the right subtree

		Node smallestParent = toBeRemoved;
		Node smallest = toBeRemoved.right;
		while (smallest.left != null){
			smallestParent = smallest;
			smallest = smallest.left;
		}

		// smallest contains smallest child in right subtree

		// Move contents, unlink child

		toBeRemoved.data = smallest.data;
		if (smallestParent == toBeRemoved){
			smallestParent.right = smallest.right; 
		}
		else{
			smallestParent.left = smallest.right; 
		}
	}

	/**
	 * creates an iterator object to traverse the BinaryTree
	 * @return a new InorderIterator object
	 */
	public InorderIterator inOrderIterator(){
		return new InorderIterator();
	}

	/**
	 * Accessor method. Prints all elements in order in a list using an iterator
	 */
	public void printIter(){
		InorderIterator printIter = inOrderIterator();
		int i = 1;
		while(printIter.hasNext()){
			System.out.println(i + ". " + printIter.next());
			i++;
		}
	}
	/**
	 * Accessor method. Prints all elements in order on a single line
	 */
	public void print(){
		printHelp(root);
	}

	private void printHelp(Node current){
		if(current.left == null && current.right == null){
			System.out.print(current.data);
		}
		else if(current.left != null && current.right == null){
			printHelp(current.left);
			System.out.print(", "+  current.data); 
		}
		else if (current.right != null && current.left == null){
			System.out.print(current.data + ", ");
			printHelp(current.right);				
		}	
		else{
			printHelp(current.left);
			System.out.print(", "+ current.data + ", ");
			printHelp(current.right);

		}

	}

	/**
	 * Accessor method. Returns the highest value element
	 * @return the lowest value element/the element farthest to the right
	 */
	public Comparable<Object> findMax(){
		Node temp = root;
		while(temp.right != null){
			temp = temp.right;
		}
		return temp.data;
	}
	
	/**
	 * Accessor method. Returns the lowest value element
	 * @return the highest value element/the element farthest to the left
	 */
	public Comparable<Object> findMin(){
		Node temp = root;
		while(temp.left != null){
			temp = temp.left;
		}
		return temp.data;
	}
}



