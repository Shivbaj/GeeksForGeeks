package com.geeksforgeeks.arrays;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class SubArrayWithGivenSum {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
		    int n=s.nextInt();
		    int sum=s.nextInt();
		    int[]a=new int[n];
		    for(int i=0;i<n;i++)
		     a[i]=s.nextInt();
		     
		     int[] r= compute(a,n,sum);
		        if(r[0]==0 && r[1]==0){
		        System.out.println(-1);
		    }
		    System.out.println(r[0]+" "+r[1]);
		    t--;
		}
	}
	
	
	public static int[] compute(int[]a,int n,int sum){
	        
		int[] indexArray = new int[2];
		int finalInt =0;
		for(int i=0;i<a.length;i++)
		{
			int matchSum=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				matchSum= matchSum + a[j];
				if(matchSum == sum)
				{
					indexArray[0]=i+1;
					indexArray[1]=j+1;
				   return indexArray;
				}
			}
		}
		return indexArray;
	}
}