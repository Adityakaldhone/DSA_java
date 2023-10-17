//Subarray maxsum using prefix array
class Solution {

	public static void main(String[]args) {
	
		int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int Psum[] = new int[arr.length];
		int max_sum = Integer.MIN_VALUE;
		int sum = 0;
		Psum[0] = arr[0];
		for(int i=1;i<arr.length;i++){
		
			Psum[i] = Psum[i-1] + arr[i]; 
		}
		for(int i=0;i<arr.length;i++){
			sum = 0;
			for(int j=i;j<arr.length;j++){
			
				if(i==0)
					sum = Psum[j];
				else
					sum = Psum[j] - Psum[i-1];

				if(sum>max_sum)
					max_sum = sum;
			}
		}
		System.out.println(max_sum);
	}
}
