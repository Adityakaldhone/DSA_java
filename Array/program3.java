/*
 given an array of size N
 return the count of pairs(i,j) with Arr[i]+Arr[j]==k
 N = 10;
 k = 10;
Note:i!=j
 */ 
class Demo{

	public static void main(String[]args){
		int count = 0;
		int N = 10;
		int K = 10;
		int arr[] = new int[]{3,5,2,1,-3,7,8,15,6,13};

		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<N;j++){
		
			if(i!=j){
			
				if(arr[i]+arr[j]==K){
				
					count++;
				}
			}
		}
		}
		System.out.println(count);
	}
}
