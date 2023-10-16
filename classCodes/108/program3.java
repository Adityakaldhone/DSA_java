/*
 print all the elements in the given subarray from start to end
 arr[] = {-2,1,-3,4,-1,2,1,-5,4}
 start = 3
 end = 7
 */ 
class RangePrint {

	public static void main(String[]args) {
	
 		int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int start = 3;
		int end = 7;
		for(int i=start;i<=end;i++) {
			if(i!=end)	
			System.out.print(i+", ");
			else
			System.out.print(i);
		}
		System.out.println();
	}
}
