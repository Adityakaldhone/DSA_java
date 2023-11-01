//Binary_Search with recursive call
import java.util.Scanner;

class BinarySearch_Recursion {
	
	static int target = 0;
	static int start = 0;
	static int Binary(int arr[],int end){
		
		if(start<=end){
		
			int mid = ((start+end)/2);

			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target){
			
				start = mid+1;
			}else if(arr[mid]>target){
			
				end = mid-1;
			}

			return Binary(arr,end);
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
		target = sc.nextInt();


		int ret = Binary(arr,arr.length-1);


		if(ret == -1){
		
			System.out.println("Element not found");
		}else{
			System.out.println("Element found at index "+ret);
		}
	}
}
