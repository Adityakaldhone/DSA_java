/*
 int arr[] = new int[]{2,4,1,3}
 print the sum of every single subarray
 */ 
class SumOfEverySingleSubarray {

	public static void main(String[]args) {
	
		int arr[] = new int[]{2,4,1,3};
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
		
			for(int j=i;j<arr.length;j++) {
				 sum = 0;
				for(int k=i;k<=j;k++){
				
					sum = sum+arr[k];
				}
				System.out.println(sum);
			}
		}
	}
}
