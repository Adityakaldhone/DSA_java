//Binary_Search
import java.util.Scanner;

class BinarySearch {
	
	static int Binary(int arr[],int target){
	
		int start = 0;
		int end = arr.length-1;
	
		while(start<=end){
		
			int mid = ((start+end)/2);

			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target){
			
				start = mid+1;
			}else if(arr[mid]>target){
			
				end = mid-1;
			}
		}
		return -1;
	}

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter array elements");

		for(int i=0;i<arr.length;i++){
		
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter target element");
		int target = sc.nextInt();


		int ret = Binary(arr,target);


		if(ret == -1){
		
			System.out.println("Element not found");
		}else{
			System.out.println("Element found at index "+ret);
		}
	}
}
