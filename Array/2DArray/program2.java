/*Java 1-d and 2-d Array
 Given a integer n. We have n*n values of a 2-d array, and  n values of 1-d array. Task is to find the sum of the left diagonal values of the 2-d array and the max element of the 1-d array and print them with space in between.

Example 1:

â€‹Input : arr[][] = {{1,2,3}, {4,5,6}, {7, 8,9}} 
        and N = 3
brr[] = {3, 6, 9}
Output : 15 9
Explanation:
1 2 3
4 5 6
7 8 9
So, this sum of left diagonal (1+ 5 + 9) = 15
The maximum element in an array brr is 9
So, will return {15, 9} as an answer.
 */
import java.util.*;
class Complete
{
    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        int sum = 0;
        ArrayList<Integer> al = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]==a[j]){
                    sum = sum+a[i][j];

                }
            }
        }
        for(int i=0;i<b.length;i++){
            if(max<b[i]){
                 max = b[i];
            }
        }
        al.add(sum);
        al.add(max);
        return al;
    }
	public static void main(String[]args){

		int N = 3;
		int arr[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int brr[] = new int[]{3,6,9};
		
		System.out.println((Complete.array(arr,brr,N)));

	}
}
