/*
 Q3. Range Sum Query

Problem Description
- You are given an integer array A of length N.
- You are also given a 2D integer array B with dimensions M x 2, where

each row

denotes a [L, R] query.
- For each query, you have to find the sum of all elements from L to R

indices

in A (0 - indexed).
- More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each
query.

Problem Constraints
1 <= N, M <= 103
1 <= A[i] <= 105
0 <= L <= R < N

Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = [[0, 3], [1, 2]]
Input 2:
A = [2, 2, 2]
B = [[0, 0], [1, 2]]

Example Output
Output 1:
[10, 5]

Output 2:
[2, 4]

Example Explanation
Explanation 1:
The sum of all elements of A[0 ... 3] = 1 + 2 + 3 + 4 = 10.
The sum of all elements of A[1 ... 2] = 2 + 3 = 5.
Explanation 2:
The sum of all elements of A[0 ... 0] = 2 = 2.
The sum of all elements of A[1 ... 2] = 2 + 2 = 4.
 */ 
import java.util.*;

class Demo{

	static void queryRangeSum(int arr[], int Query){
		
		Scanner sc = new Scanner(System.in);
		int Psarr[] = new int[arr.length];
		Psarr[0] = arr[0];
		for(int i=1;i<arr.length;i++){
		
			Psarr[i] = Psarr[i-1] + arr[i];
		}
		for(int i=1;i<=Query;i++){
		
			System.out.println("Enter start");
			int start = sc.nextInt();
			System.out.println("Enter End");
			int end = sc.nextInt();
			if(start == 0 && end ==0){
			
				System.out.println(arr[0]);
			}else if(start==0){
			
				System.out.println(arr[end]-arr[start]);
			}else{

				System.out.println(arr[end]-arr[start-1]);
			}
		}
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
		System.out.println("Enter number of Queries");
		int Query = sc.nextInt();

		queryRangeSum(arr,Query);

	}
}
