/*
 Q2. Linear Search - Multiple Occurences
Problem Description
Given an array A and an integer B, find the number of occurrences

of B in A.

Problem Constraints
1 <= B, Ai <= 109
1 <= length(A) <= 105

Example Input
Input 1:
A = [1, 2, 2], B = 2
Input 2:
A = [1, 2, 1], B = 3

Example Output
Output 1:
2
Output 2:
0

Example Explanation
Explanation 1:
Element at index 2, 3 is equal to 2 hence count is 2.
Explanation 2:
There is no element equal to 3 in the array.
 */ 
import java.util.*;
class Solution {
    static int count(int[] arr, int x) {
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                count++;
            }
        }
        return count;
    }
    	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");
		int size = sc.nextInt();
		
		int arr[] = new int[size];

		System.out.println("Enter Array elements");
		for(int i=0;i<arr.length;i++){
		
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter target element ");
		int target = sc.nextInt();

		int ret = count(arr,target);
		System.out.println("count = "+ret);

	}
}
