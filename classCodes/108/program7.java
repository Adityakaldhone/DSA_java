//print the sum of every single subarray with TC O(N) without using extra space
class SumOFSubArrayCarryForward {

	public static void main(String[]args) {
	
		int arr[] = new int[]{2,4,1,3};

		for(int i=0;i<arr.length;i++) {
			
			int sum = 0;
			for(int j=i;j<arr.length;j++){
			
				sum = sum+arr[j];
				System.out.println(sum);
			}
		}
	}
}
