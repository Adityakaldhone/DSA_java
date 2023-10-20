/*
 Que 4: WAP to print the sum of digits in a given range.
Input: 1 to 10
Input: 21 to 30
 */
import java.util.*;
class Demo {

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Start");
		int start = sc.nextInt();
		System.out.println("Enter End");
		int End = sc.nextInt();
		int sum = 0;
		for(int i=start;i<=End;i++){
		
			sum = sum+i;
		}
		System.out.println(sum);
	}
}
