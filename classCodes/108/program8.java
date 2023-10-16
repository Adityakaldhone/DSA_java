class TotSum {

	public static void main(String[]args) {
	
		int arr[] = new int[]{2,4,3,1};
		int totSum = 0;
		
		for(int i=0;i<arr.length;i++) {
			int sum = 0;	
			for(int j=i;j<arr.length;j++) {
			
				sum = sum+arr[j];
			}
			totSum = sum+totSum;

			
		}
		System.out.println(totSum);
	}
}
