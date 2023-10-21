/*
 Que 3: WAP to check whether the given number is a strong number or not.
 */ 
import java.util.Scanner;
class Strong {
	
	static void fun(int num){
		int temp = num;
		int sum = 0;
		while(temp!=0){
			
			int fact = 1;
			int rem = temp%10;
			
			for(int i=1;i<=rem;i++){
			
				fact = fact*i;
			}
			temp = temp/10;
			sum = sum+fact;
		}
		if(sum==num)
			System.out.println("the given number is strong number");
		else
			System.out.println("the given number is not strong number");
	}

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");
		int num = sc.nextInt();

		fun(num);
	}
}
