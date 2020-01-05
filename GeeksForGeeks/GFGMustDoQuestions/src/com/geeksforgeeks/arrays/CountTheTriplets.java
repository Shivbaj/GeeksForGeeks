package com.geeksforgeeks.arrays;

/*package whatever //do not write package name here */

import java.util.*;
public class CountTheTriplets {

	
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int countOfTesCase = sc.nextInt();
	    for(int p = 0; p < countOfTesCase; p++){
	        int size = sc.nextInt();
	        int array[] = new int[size];
	        for(int i=0; i<size; i++){
	            array[i] = sc.nextInt();
	            
	        }
	        countTriplets(array,size);
	   
	    
	    }
	    sc.close();
	}
	

	 static void countTriplets(int a[],int size){
		  int tripletCounter = 0;
		  Map< Integer,Integer> inputMap =  new HashMap< Integer,Integer>(); 
		  for(int i = 0;i < size ; i++){
			  inputMap.put(a[i],i);
	       }
		  for(int i = 0; i < size-1; i++){
		        for(int j = i+1; j < size; j++){
		            if(inputMap.containsKey(a[i]+a[j]))
		               tripletCounter++;
		           
		        }
		    }
		     
		   if(tripletCounter == 0) 
		       System.out.println("-1");
		   else 
	          System.out.println(tripletCounter);
		  
	 }
}
