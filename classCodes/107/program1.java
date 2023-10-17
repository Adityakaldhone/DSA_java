/*
 Maximum Subarray
 given an integer array of size N
 find the contigous subarray(Containing at least one number)which has largest sum
 and return its sum
Input:[-2,1,-3,4,-1,2,1,-5,4]
output:6
A] maximum subarray Bruteforce approach
 */ 
class Solution {

	public static void main(String[]args) {
	
		int arr[] = new int[]{4,-1,2,1};
		int max_Sum = Integer.MIN_VALUE;
		int sum = 0;

		for(int i=0;i<arr.length;i++){
		
			for(int j=i;j<arr.length;j++){
				sum = 0;	
				for(int k=i;k<arr.length;k++){
				
					sum = sum+arr[k];
				}
				
				if(max_Sum<sum){
				
					max_Sum = sum;
				}
			}
		}
		System.out.println("Sum = "+max_Sum);
	}
}

