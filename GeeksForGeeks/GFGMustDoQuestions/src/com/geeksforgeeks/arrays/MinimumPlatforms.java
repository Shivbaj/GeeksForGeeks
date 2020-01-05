package com.geeksforgeeks.arrays;

import java.math.BigDecimal;
import java.util.Arrays;

public class MinimumPlatforms {

public static void main (String[] args) { 

    int arrivaltime[] = {900, 940, 950, 1100, 1500, 1800}; 
    int departuretime[] = {910, 1200, 1120, 1130, 1900, 2000}; 
    int noOfTrains =6;
    minimunPlatforms(arrivaltime,departuretime,noOfTrains);
}

	private static void minimunPlatforms(int[] arrivaltime, int[] departuretime, int noOfTrains) {
		

		   // Sort arrival and departure arrays 
		   Arrays.sort(arrivaltime); 
		   Arrays.sort(departuretime); 
		   
		   
		
		// plat_needed indicates number of platforms 
		   // needed at a time 
		   int plat_needed = 1, result = 1; 
		   int i = 1, j = 0; 
		   
		   // Similar to merge in merge sort to process  
		   // all events in sorted order 
		   while (i < noOfTrains && j < noOfTrains) 
		   { 
		      // If next event in sorted order is arrival,  
		      // increment count of platforms needed 
		      if (arrivaltime[i] <= departuretime[j]) 
		      { 
		          plat_needed++; 
		          i++; 
		   
		          // Update result if needed  
		          if (plat_needed > result)  
		              result = plat_needed; 
		      } 
		   
		      // Else decrement count of platforms needed 
		      else
		      { 
		          plat_needed--; 
		          j++; 
		      } 
		   } 
		   
		System.out.print(result);
		
	} 




}
