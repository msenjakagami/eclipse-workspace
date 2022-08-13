package lab_6;


import java.util.NoSuchElementException;
import java.util.Stack;



public class BinarySearchTree{  

	/**
	   A node of a tree stores a data item and references
	   to the left and right child nodes.
	 */
	class Node{  
		public int data;
		public Node left;
		public Node right;
		public Node parent;	
		/**
	      Inserts a new node as a descendant of this node.
	      @param newNode the node to insert
		 */
		public void addNode(Node newNode)
		{  
			Node current = root;
			Node temp = null;
			while(true){
				temp = current;
				if(newNode.data < current.data)
				{				
					current = current.left;
					if(current==null)
					{
						temp.left = newNode;
						newNode.parent = temp;
						return;
					}
				}
				else
				{
					current = current.right;
					if(current == null)
					{
						temp.right = newNode;
						newNode.parent = temp;
						return;
					}
				}
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
	public void add(int data){  
		Node newNode = new Node();
		newNode.data = data;
		newNode.left = null;
		newNode.right = null;
		if (root == null) { root = newNode; }
		else { root.addNode(newNode); }
	}
	public Node getRoot() {
		return root;
	}

	public void print(Node n) {
		if(n!=null)
		{
			print(n.left);
			System.out.print(" " + n.data);
			print(n.right);
		}
	}


	public Node search(int n){
		Node current = root;
		while(current!=null){
			if(current.data == n){
				return current;
			}
			else if(current.data > n){
				current = current.left;
			}
			else{
				current = current.right;
			}
		}
		return null;
	}

	public Node find_successor(Node n) {
		if (n.right != null) {
			return minValue(n.right);
		}
		else {
			Node p = n.parent;
			while (p != null && n == p.right) {
				n = p;
				p = p.parent;
			}
			return p;
		}
	}

	public void tree_walk(Node n) {
		Node current = n;
		if(current.left != null) {
			tree_walk(current.left);
		}
		System.out.print(current.data + ", ");
		if(current.right != null) {
			tree_walk(current.right);
		}
	}

	public Node minValue(Node node) {
		Node current = node;
		while (current.left != null) {
			current = current.left;
		}
		return current;
	}


}




