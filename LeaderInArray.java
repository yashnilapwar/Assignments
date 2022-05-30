package com.dev.assignments;

public class LeaderInArray {

	public static void main(String[] args) {
		int[] array = {7, 10, 4, 10, 6, 5, 2};
		int n=7; 	//int n=array.length;
		Leader(array);
	}
	
	public static void Leader(int[] arr) {
		if (arr == null || arr.length == 0) {
            return;
        }
		int max= Integer.MIN_VALUE;
		 for (int i = arr.length - 1; i >= 0; i--)
	        {
	            if (arr[i] >= max)
	            {
	            	max = arr[i];
	                System.out.printf("%d ", arr[i]);
	            }
	        }
	    }
}