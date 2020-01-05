package com.geeksforgeeks.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.*; 

public class SortingElementByFrequency {

	public static void main(String[] args) {
		int array1[] = {  4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5  };
		List<Integer> val = sortElementByfrequency(array1);
		
	}

	/**
	 * @param array1
	 * @return
	 */
	private static List<Integer> sortElementByfrequency(int[] array1) {
		// TODO Auto-generated method stub
		List<Integer> outputArray = new ArrayList<>(); 
		int count = 0;
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < array1.length; i++) {
			hashmap.put(array1[i], hashmap.getOrDefault(array1[i], 0) + 1);
			  outputArray.add(array1[i]); 
		}
		/*
		 * // TreeMap to store values of HashMap TreeMap<Integer, Integer> sorted = new
		 * TreeMap<>();
		 * 
		 * // Copy all data from hashMap into TreeMap sorted.putAll(hashmap); for
		 * (Entry<Integer, Integer> entry : sorted.entrySet()) { int val
		 * =entry.getValue(); while (val>0) { outputArray[count++]=entry.getKey();
		 * val--; }
		 * 
		 * }
		 */
		hashmap.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue(Comparator.reverseOrder()))
				.map(Map.Entry::getKey).forEach(k -> {
					for (int i = 0; i < hashmap.get(k); i++) {
						System.out.print(k);
					}
				});
		

        // Compare the map by value 
        SortComparator comp = new SortComparator(hashmap); 
        // Sort the map using Collections CLass 
        Collections.sort(outputArray, comp); 
  
        // Final Output 
        for (Integer i : outputArray) { 
            System.out.print(i + " "); 
        } 
        
        
		return null;
	}
}
