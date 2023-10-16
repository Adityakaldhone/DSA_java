/*
arr:[2,4,1,3]
print the sum of every single subarray by using prefix sum
 */
class PrefixSum {

	public static void main(String[]args) {
	
		int arr[] = new int[]{2,4,3,1};
		int PrefixSum[] = new int[arr.length];
		PrefixSum[0] = arr[0];

		for(int i=1;i<arr.length;i++){
		
			PrefixSum[i] = PrefixSum[i-1] + arr[i];
		}
		for(int i=0;i<arr.length;i++) {
		
			for(int j=i;j<arr.length;j++){
				int sum = 0;
				if(i==0)
					sum = PrefixSum[j];
				else
					sum = PrefixSum[j] - PrefixSum[i-1];
				System.out.println(sum);
			}
		}
	}
}
