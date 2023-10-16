//count total number of subarrays in given array
class CountArray {

	public static void main(String[]args) {
	
		int count = 0;
		int arr[] = new int[]{4,2,10,3,12,-2,15};
		for(int i=0;i<arr.length;i++) {
		
			for(int j=i;j<arr.length;j++) {
			
				count++;
			}
			
		}
			System.out.println(count);
	}
}
