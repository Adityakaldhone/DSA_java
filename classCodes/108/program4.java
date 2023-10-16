//print all subarrays in given subarray
//arr:[4,2,1,3]
class PrintAllSubarrays {

	public static void main(String[]args) {
	
		int arr[] = new int[]{4,2,3,1};

		for(int i=0;i<arr.length;i++) {
		
			for(int j=i;j<arr.length;j++) {
				
				for(int k=i;k<=j;k++){
				
					System.out.print(arr[k]);
				}
				System.out.println();
			}
		}
	}
}
