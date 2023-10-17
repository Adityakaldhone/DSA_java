/*
 Que 3 : WAP to check whether the given no is odd or even
 */ 
import java.util.Scanner;
class EvenOdd {

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		if(num%2==0)
			System.out.println("number "+num + " is " + "even");
		else
			System.out.println("number "+num +" is " +"odd");

	}
}

