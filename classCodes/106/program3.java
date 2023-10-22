/*
 Equilibrium index of an array
 Given a sequence arr[] of size n, Write a function int equilibrium(int[] arr, int n) that returns an equilibrium index (if any) or -1 if no equilibrium index exists.

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

Examples:

Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
Output: 3
Input: A[] = {1, 2, 3}
Output: -1
 */ 
class EquilibriumIndex {

	static int fun(int arr[]){
		
		for(int i = 0; i < arr.length; i++){
			int count = 0;
			int count1 = 0;
			for(int j = 0; j < arr.length; j++){
			
				if(i < j){
				
					count = count+arr[j];
				} else if(j < i){
				
					count1 = count1+arr[j];
				}
			}
			//System.out.println(count);	
			//System.out.println(count1);	
			if(count == count1){
			
				return i;
			}
		}
		return -1;
	}
	public static void main(String[]args){
	
		int arr[] = new int[]{-7,1,5,2,-4,3,0};

		System.out.println(fun(arr));
	}
}
