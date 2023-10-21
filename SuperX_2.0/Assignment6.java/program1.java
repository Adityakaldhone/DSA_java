/*
 Que 1: WAP to print the factorial of digits in a given range.
Input: 1-10
 */ 
import java.util.Scanner;
class RangeFact {

	static void fun(int start,int end) {
	
		for(int i=start;i<=end;i++){
			int fact = 1;
			for(int j=1;j<=i;j++){
			
				fact = fact*j;
			}
			System.out.println("Factorial of " +i+ " = " +fact);
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
