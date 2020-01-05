package com.geeksforgeeks.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class PrintBinaryTreeInVerticalOrder {

	TreeNode root; 
   
    /* can give min and max value according to your code or 
    can write a function to find min and max value of tree. */
  
    /* returns true if given search tree is binary 
     search tree (efficient version) */
    public void printBottomView()  { 
    	//print bottom view the root is avilable
    	//create hd array and fill in the values in hashtable with key as hd value and values as nodes value
    	if (root == null) 
            return; 
  
        // Initialize a variable 'hd' with 0 for the root element. 
        int hd = 0; 
        // Using list to store data corresponding to vertical biew
        //List<List<Integer>> list = new LinkedList<>(); 
     // TreeMap which stores key value pair sorted on key value 
        Map<Integer, Integer> map = new TreeMap<>(); 
  
        
  
         // Queue to store tree nodes in level order traversal 
        Queue<TreeNode> queue = new LinkedList<TreeNode>(); 
        root.hd = hd;
        queue.add(root);
        while(!queue.isEmpty()) {
        	TreeNode temp = queue.remove();
        	hd = temp.hd;
        	// Put the dequeued tree node to TreeMap having key 
            // as horizontal distance. Every time we find a node 
            // having same horizontal distance we need to replace 
            // the data in the map. 
        	

            map.put(hd, temp.data); 
        	
            if(temp.left!=null) {
            	temp.left.hd = hd-1;
            	queue.add(temp.left);
            }
            if(temp.right!=null) {
            	temp.right.hd = hd+1;
            	queue.add(temp.right);
            }
        }
        
        
    } 
  
    
    /* Driver program to test above functions */
    public static void main(String args[]) 
    { 
    	PrintBinaryTreeInVerticalOrder tree = new PrintBinaryTreeInVerticalOrder(); 
        tree.root = new TreeNode(20); 
        tree.root.left = new TreeNode(8); 
        tree.root.right = new TreeNode(22); 
        tree.root.right.right = new TreeNode(25); 
        tree.root.left.left = new TreeNode(5); 
        tree.root.left.right = new TreeNode(3); 

        tree.root.right.left = new TreeNode(4); 
        tree.root.left.right.left = new TreeNode(10); 

        tree.root.left.right.right = new TreeNode(14); 
        tree.printBottomView();
    } 
}
