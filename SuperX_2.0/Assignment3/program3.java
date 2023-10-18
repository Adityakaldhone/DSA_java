/*
 Que 3 : WAP to check whether the given no is prime or composite
 */
import java.util.*;
class Solution {
	static int count = 0;
	int fun(int num ,int x){
	
		if(x<=num){
				
			if(num%x ==0){
				count++;
			}

			x++;
			fun(num,x);
			
			return count;
		}
		return 0;
	}
	public static void main(String[]args) {
		int x = 1;
		Solution obj = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int ret = obj.fun(num,x);
		if(ret==2){
		
			System.out.println("the number "+num+" is prime");

		}else if(ret>2){
			System.out.println("the number "+num+" is Composite");
		}
	}
}
