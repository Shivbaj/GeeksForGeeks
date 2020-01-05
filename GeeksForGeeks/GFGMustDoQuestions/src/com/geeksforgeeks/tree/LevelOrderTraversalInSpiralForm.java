package com.geeksforgeeks.tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
//using two stacks
public class LevelOrderTraversalInSpiralForm {


	Node root; 
    public void levelOrderInSpiral()  {
    	callLevelOrder(root,0);
        
    } 
  
    
    private void callLevelOrder(Node root, int level) {
    	Stack<Node> stack1 = new Stack<Node>();
    	Stack<Node> stack2 = new Stack<Node>();
    	if(root ==null)
    		return;
    	stack1.add(root);
    	while(!stack1.isEmpty() || !stack2.isEmpty()) {
    		while(!stack1.isEmpty())
    		{
    		root = stack1.pop();
    		System.out.print(root.data);
    		if(root.left!=null)
    			stack2.push(root.left);
    		if(root.right!=null)
    			stack2.push(root.right);
    		}
    		while(!stack2.isEmpty()) {
        		root = stack2.pop();
        		System.out.print(root.data);
        		if(root.right!=null)
        			stack1.push(root.right);
        		if(root.left!=null)
        			stack1.push(root.left);
    		}
    	}
    	
    }


	/* Driver program to test above functions */
    public static void main(String args[]) 
    { 
    	LevelOrderTraversalInSpiralForm tree = new LevelOrderTraversalInSpiralForm(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.right.right = new Node(4); 

        tree.root.right.left = new Node(5); 
        tree.root.left.left = new Node(7); 
        tree.root.left.right = new Node(6); 

        tree.levelOrderInSpiral();
    } 

}
