/*
 Problem 1:
Given an array containing n integers. The problem is to find the sum of the
elements of the contiguous subarray having the smallest(minimum) sum.
Examples:
Input : arr[] = {3, -4, 2, -3, -1, 7, -5}
Output : -6
Subarray is {-4, 2, -3, -1} = -6
Input : arr = {2, 6, 8, 1, 4}
Output : 1
 */ 
import java.util.Scanner;
class MinimumSum {

	static int fun(int arr[]) {
			
		int minSum = Integer.MAX_VALUE;
		int currSum = 0;

		for(int i=0;i<arr.length;i++) {
		
			currSum = currSum + arr[i];
			if(currSum<minSum) {
			
				minSum = currSum;
			}
			if(currSum>0){
			
				currSum = 0;
			}
		}
		return minSum;
	}
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++) {
		
			arr[i] = sc.nextInt();
		}
		System.out.println(fun(arr));
	}
}
