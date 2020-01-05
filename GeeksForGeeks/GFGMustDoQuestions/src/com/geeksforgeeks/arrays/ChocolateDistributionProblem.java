package com.geeksforgeeks.arrays;

import java.util.Arrays;

public class ChocolateDistributionProblem {
	

	
	public static void main (String[] args) 
{ 
    int [] array = {3, 4, 1, 9, 56, 7, 9, 12}; 
    int numberOfStudents=5;
    int num = chocolateDistribution(array,numberOfStudents); 
    System.out.print(num);
}

	private static int chocolateDistribution(int[] array, int numberOfStudents) {
		Arrays.sort(array);
		  // Number of students cannot be 
        // more than number of packets 
        if (array.length< numberOfStudents) 
           return -1; 
       

        // Largest number of chocolates 
        int min_diff = Integer.MAX_VALUE; 
       
        // Find the subarray of size m  
        // such that difference between  
        // last (maximum in case of  
        // sorted) and first (minimum in 
        // case of sorted) elements of  
        // subarray is minimum. 
        int first = 0, last = 0; 
        for (int i = 0; i + numberOfStudents - 1 < array.length; i++) 
        { 
            int diff = array[i+numberOfStudents-1] - array[i]; 
            if (diff < min_diff) 
            { 
                min_diff = diff; 
                first = i; 
                last = i + numberOfStudents - 1; 
            } 
        } 
        return (array[last] - array[first]); 
	} 
	
	

}
