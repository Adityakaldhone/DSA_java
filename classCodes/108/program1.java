/*
 Given an array of size N
 total number of array possible
 arr[] = [1,2,3,4]
 */ 
class TotSubarray {

	public static void main(String[]args){
	
		int arr[] = new int[]{1,2,3,4};

		int size = arr.length+(arr.length+1)/2;
		System.out.println(size);
	}
}
