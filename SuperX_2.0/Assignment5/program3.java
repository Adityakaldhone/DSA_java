/*
 Que 3: WAP to find the factorial of a given number.
 */ 
import java.util.Scanner;
class Factorial {
	static int fact = 1;
	static int fun(int num){
		if(num>0){
			fact = fact*num;
			num--;
			fun(num);
		}
		return fact;
	}
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();

		int ret = fun(num);
		System.out.println("factorial = "+ret);
	}
}
