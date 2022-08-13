package lab_6;
import java.util.*;

import lab_6.BinarySearchTree.Node;

public class Lab6 {
	
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String args[]) {
		BinarySearchTree tree =  new BinarySearchTree();
		boolean done = false;
		int x = 0;
		
		//1
		while(!done) {
			System.out.println("Enter a number(00 to end)");
			x = in.nextInt();
			if(x == 00) {
				done = true;
			}
			else {
				//2
				tree.add(x);
			}
			
		}
		//3
		tree.print(tree.getRoot());
		System.out.println();
		//4
		System.out.println("Enter a node to find");
		int y = 0;
		y = in.nextInt();
		if(tree.search(y) != null) {
			System.out.print("Successor:");
			//5
			Node temp = inOrderSuccessor(tree.search(y));
			System.out.println(temp.data);
			System.out.println();
		}
		else {
			System.out.println("Not found");
		}
		//6
		tree.tree_walk(tree.getRoot());
	}
	
	 public static Node inOrderSuccessor(Node n) {
		 
	        
	        if (n.right != null) {
	            return minValue(n.right);
	        }
	 
	        
	        Node p = n.parent;
	        while (p != null && n == p.right) {
	            n = p;
	            p = p.parent;
	        }
	        return p;
	        
	    }
	 
	 private static Node minValue(Node node) {
	        Node current = node;
	        while (current.left != null) {
	            current = current.left;
	        }
	        return current;
	    }
	 
	 
	
	
}
