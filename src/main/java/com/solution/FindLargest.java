                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     package com.solution;

import java.util.Arrays;

public class FindLargest {
	
	
	 static int arr[] = {10, 324, 45, 90, 9808}; 
		
	 // with Java 7
	 
	 
		static int largest(int arr[] ) 
	    { 
	        int i; 
	          
	        // Initialize maximum element 
	        int max = arr[0]; 
	       
	        // Traverse array elements from second and 
	        // compare every element with current max   
	        for (i = 1; i < arr.length; i++) 
	            if (arr[i] > max) 
	                max = arr[i]; 
	       
	        return max; 
	    } 
		
		// with java 8
		
		static int largestJava8(int arr[])
		{
			return Arrays.stream(arr).max().getAsInt();
		}
		

	public static void main(String[] args) {
		int arrn[] = {10, 324, 45, 90, 9808,9955};
		 System.out.println("Largest in given array is " + largest(arrn)); 
		 System.out.println("Largest with java 8  " + largestJava8(arrn)); 
		
	}
	
	

}
