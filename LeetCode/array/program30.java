/*
 Product array puzzle
Company: Flipkart, Morgan Stanley, Accolite, Amazon, Microsoft, D-E-Shaw, Intuit,
Opera
Platform: GFG
Description:
Given an array nums[] of size n, construct a Product Array P (of same size n)
such that P[i] is equal to the product of all the elements of nums except nums[i].

Example 1:

Input:
n = 5
nums[] = {10, 3, 5, 6, 2}
Output:
180 600 360 300 900
Explanation:
For i=0, P[i] = 3*5*6*2 = 180.
For i=1, P[i] = 10*5*6*2 = 600.
For i=2, P[i] = 10*3*6*2 = 360.
For i=3, P[i] = 10*3*5*2 = 300.
For i=4, P[i] = 10*3*5*6 = 900.

Example 2:
Input:
n = 2
nums[] = {12,0}
Output:
0 12
Your Task:
You do not have to read input. Your task is to complete the function
productExceptSelf() that takes array nums[] and n as input parameters and
returns a list of n integers denoting the product array P. If the array has only one
element the returned list should should contains one value i.e {1}
Note: Try to solve this problem without using the division operation.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 <= n <= 1000
0 <= nums <= 200
Array may contain duplicates.
 */ 
class Solution
{
	public static long[] productExceptSelf(int nums[], int n)
	{
        long arr[] = new long[nums.length];

        for(int i=0;i<nums.length;i++) {
            long product = 1;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }else{

                    product = product*nums[j];

                }
            }
            arr[i] = product;
        }
        return arr;
	}
}
