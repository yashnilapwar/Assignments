package com.dev.assignments;

public class StockBuySell {

	public static int profit(int[] Arr)
    {
        int diff = Integer.MIN_VALUE;
 
        int n = Arr.length;
        if (n == 0) {
            return diff;
        }
 
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++) {
                if (Arr[j] > Arr[i]) {
                    diff = Integer.max(diff, Arr[j] - Arr[i]);
                }
            }
        }
 
        return diff;
    }
 
    public static void main(String[] args)
    {
        int[] A = {7,1,5,3,6,4};
 
        int diff = profit(A);
        if (diff != Integer.MIN_VALUE) {
            System.out.print(diff);
        }else {
        	System.out.println("0");
        }
    }
}