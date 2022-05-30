package com.dev.assignments;

public class XorSum {

	public int allXorSum(int[] nums) {
		int sum1=0;
		for(int i=0;i<Math.pow(2,nums.length);i++)
		{
		int sum=0;
		for(int j=0;j<nums.length;j++)
		{
		if((i & 1<<j)>0)
		sum^=nums[j];
		}
		sum1+=sum;
		}
		return sum1;
		}
	public static void main(String[] args) {
		XorSum obj=new XorSum();
		int[] array= {5,1,6};
		int ans= obj.allXorSum(array);
		
		System.out.println(ans);
	}
}
