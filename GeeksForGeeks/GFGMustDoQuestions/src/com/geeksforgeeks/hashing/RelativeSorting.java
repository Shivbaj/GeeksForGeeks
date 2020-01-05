package com.geeksforgeeks.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RelativeSorting {
	public static void main(String[] args) {
		int array1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
		int array2[] = {2, 1, 8, 3};
		relativeSorting(array1, array2);
	}

	private static void relativeSorting(int[] array1, int[] array2) {
		// TODO Auto-generated method stub
		int count=0;
		int times=0;
		HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
		int[] outputArray = new int[array1.length];
		for(int i=0;i<array1.length;i++) {
			hashmap.put(array1[i],hashmap.getOrDefault(array1[i], 0)+1);
		}
		//Loop through A2[], check if it is present in HashMap, if so, put in output array that many times and remove the number from HashMap.
		for(int j=0;j<array2.length;j++) {
			if(hashmap.containsKey(array2[j])) {
				int val = hashmap.get(array2[j]);
				while (val>0) {
				outputArray[count++]=array2[j];
				val--;
				}
			}
			hashmap.remove(array2[j]);
		}
		for (Entry<Integer, Integer> entry : hashmap.entrySet())  
			outputArray[count++] = entry.getKey();
		
		for(int k=0;k<outputArray.length;k++) {
			System.out.print(outputArray[k]);
		}
	}
}
