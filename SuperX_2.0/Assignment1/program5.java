//Successive sum of the given number
import java.util.*;
class Reverse {

	static void fun(int num){

		int sum = 0;
		int temp1 = num;
		int count = 0;
		while(temp1!=0){
		
			count++;
			temp1 = temp1/10;
		}
		int arr[] = new int[count];
		int itr = 0;
		while(num!=0){
			int rem = num%10;
			arr[itr++] = rem;
			num = num/10;
		}
		for(int i=0;i<arr.length-1;i++){
		
			arr[i] = arr[i] + arr[i+1];
			System.out.print(arr[i]+", ");
		}
		System.out.print(arr[arr.length-1]);
		System.out.println();

	}
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		fun(num);
	}
}
