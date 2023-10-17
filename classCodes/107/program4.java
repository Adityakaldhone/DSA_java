//Kadane's algorithm
class KadanesAlgorithm {

	public static void main(String[]args) {
		
		int sum = 0;
		int max_Sum = Integer.MIN_VALUE;
		int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		for(int i=0;i<arr.length;i++){
		
			sum = sum+arr[i];
			if(sum>max_Sum)
				max_Sum = sum;
			
			if(sum<0)
				sum = 0;
		}
		System.out.println(max_Sum);
	}
}
