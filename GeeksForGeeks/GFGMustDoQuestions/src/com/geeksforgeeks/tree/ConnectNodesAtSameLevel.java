package com.geeksforgeeks.tree;

import java.util.Stack;

class NodeWithnext
{
    int data;
    NodeWithnext left, right, nextRight;
    NodeWithnext(int x)
    {
        this.data = x;
        left = right = nextRight = null;
    }
    
    
}
public class ConnectNodesAtSameLevel {



	NodeWithnext root; 
   


	/* Driver program to test above functions */
    public static void main(String args[]) 
    { 
    	ConnectNodesAtSameLevel tree = new ConnectNodesAtSameLevel(); 
        tree.root = new NodeWithnext(1); 
        tree.root.left = new NodeWithnext(2); 
        tree.root.right = new NodeWithnext(3); 
        tree.root.right.right = new NodeWithnext(4); 

        tree.root.right.left = new NodeWithnext(5); 
        tree.root.left.left = new NodeWithnext(7); 
        tree.root.left.right = new NodeWithnext(6); 

        //tree.levelOrderInSpiral();
    } 



}
