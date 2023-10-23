/*
 Given an array of size N
 find the maximum subarray count of length k
Input:
	Arr:[-3,4,-2,5,3,-2,8,2,1,4]
	k:4
Output: 7;
 */ 
//Approach1

import java.util.Scanner;
class SubarrayCountlength {

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[]{-3,4,-2,5,3,-2,8,2,1,4};
		System.out.println("Enter number of steps/length of k");
		int k = sc.nextInt();

		System.out.println(arr.length-k+1);
	}
}
