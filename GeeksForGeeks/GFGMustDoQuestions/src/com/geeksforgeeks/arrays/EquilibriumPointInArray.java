package com.geeksforgeeks.arrays;

public class EquilibriumPointInArray {

//Please read optimized solution as well
	
	public static void main (String[] args) 
{ 
    int [] array = {1, 3, 5, 2, 2}; 
   // int value =equilibriumPoint(array); 
    //optimized soluton
   int value = equilibrium(array,array.length);
    System.out.print(value);
    
   
}

	private static int equilibriumPoint(int[] array) {
		for(int i=0;i<array.length;i++) {
			int sumToTheLeftOfArray = calculateSum(0,i,array);
			int sumToTheRightOfArray = calculateSum(i+1,array.length,array);
			if(sumToTheLeftOfArray==sumToTheRightOfArray)
				return i+1;
			else 
				continue;
		
		}
		return 1;
	}

	private static int calculateSum(int start, int end,int[] array) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=start;i<end;i++) {
			sum+=array[i];
		}
		return sum;
	}

	private static int equilibrium(int arr[], int n) 
    { 
        int sum = 0; // initialize sum of whole array 
        int leftsum = 0; // initialize leftsum 
  
        /* Find sum of the whole array */
        for (int i = 0; i < n; ++i) 
            sum += arr[i]; 
  
        for (int i = 0; i < n; ++i) { 
            sum -= arr[i]; // sum is now right sum for index i 
  
            if (leftsum == sum) 
                return i; 
  
            leftsum += arr[i]; 
        } 
  
        /* If no equilibrium index found, then return 0 */
        return -1; 
    } 
  

}
