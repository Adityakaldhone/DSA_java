/*
 Take the size of the array from the user create 2 arrays of that size initialize all second array element size zero for the first array take all elements from user check if the elements in the first array are even or not if its even then replace the value of second array of that index with one and print both the array
I/P size = 10;
 Array1 elements [4 2 3 6 8 7 1 0 9 5]
Output:
 Array1 elements [4 2 3 6 8 7 1 0 9 5]
 Array2 elements [1 1 0 1 1 0 0  1 0 ]
 */
import java.util.*;
class EvenOdd {

	void fun(int arr[]) {
	
		int arr2[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {

			if(arr[i]%2==0){
			
				arr2[i] = 1;
			}
			System.out.print(arr[i]+", ");

		}
		System.out.println();
		for(int i=0;i<arr2.length;i++){

			System.out.print(arr2[i]+", ");
		}
		System.out.println("\n");
	}
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		EvenOdd obj = new EvenOdd();
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array Elements");
		for(int i=0;i<arr.length;i++) {
		
			arr[i] = sc.nextInt();
		}
		obj.fun(arr);
	}
}
