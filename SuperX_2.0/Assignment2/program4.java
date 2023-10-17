/*
Que 4 : WAP to print the odd numbers in the given range
Input: start:1
end:10
*/
import java.util.Scanner;
class Demo {

	static void fun(int start,int end) {

		if(start<=end){
		
			if(start%2==1)
				System.out.println(start);

			start++;
			fun(start,end);
		}
	}
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start");
		int start = sc.nextInt();
		System.out.println("Enter end");
		int end = sc.nextInt();

		fun(start,end);
	}
}
