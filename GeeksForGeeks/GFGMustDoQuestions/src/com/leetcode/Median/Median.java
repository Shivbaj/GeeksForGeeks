package com.leetcode.Median;

import java.util.Arrays;
import java.util.List;

public class Median {
	

	public static void main(String[] args) {
		int[] array1 = {1, 3};
		int[] array2 = {2};
		
		double result = findMedianSortedArrays(array1,array2);
		System.out.print(result);
	}

	private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len = nums1.length+nums2.length;
        int[] finalArray = new int[len];
        for(int i=0;i<nums1.length;i++){
            finalArray[i]= nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            finalArray[j+nums1.length]= nums2[j];
        }
        Arrays.sort(finalArray);
        if(len%2==0){
            //find two middle elements and return avergae of it
            int index = (len)/2;
            int prev = index-1;
            int next = index;
            double average = (finalArray[prev]+finalArray[next])/2.0;
            return average;
        
        }
        else
        {
        	double middle;
        	if(finalArray.length==1)
        		middle = finalArray[0];
        	else
                middle =finalArray[0]+finalArray[len-1]/2.0;
            return middle;
        }
	}
	 
}
