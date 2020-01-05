package com.geeksforgeeks.tree;

import java.util.Stack;

public class CheckIfTreesAreIdentical {



	Node root1; 
	Node root2; 
    public void checkIfTreesAreEqual()  {
    	
        boolean result = checkTrees(root1,root2);
    } 
  
    


	private boolean checkTrees(Node a, Node b) {
		 /*1. both empty */
        if (a == null && b == null) 
            return true; 
              
        /* 2. both non-empty -> compare them */
        if (a != null && b != null)  
            return (a.data == b.data 
                    && checkTrees(a.left, b.left) 
                    && checkTrees(a.right, b.right)); 
   
        /* 3. one empty, one not -> false */
        return false; 
		
		
	}




	/* Driver program to test above functions */
    public static void main(String args[]) 
    { 
    	CheckIfTreesAreIdentical tree = new CheckIfTreesAreIdentical(); 
    	 tree.root2 = new Node(1); 
         tree.root2.left = new Node(2); 
         tree.root2.right = new Node(3); 
         tree.root2.right.right = new Node(4); 

         tree.root2.right.left = new Node(5); 
         tree.root2.left.left = new Node(7); 
         tree.root2.left.right = new Node(6); 

        tree.checkIfTreesAreEqual();
    } 



}
