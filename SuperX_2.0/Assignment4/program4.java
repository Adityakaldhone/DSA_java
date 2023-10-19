/*
 Que 4 : WAP to print each reverse numbers in the given range
Input: start:25435
end: 25449
 */ 
import java.util.*;
class ReverseRange {
		
	static void fun(int start, int end){

		for(int i=start;i<=end;i++){
			int temp = 0 ;
			int y = i;
			int x = i;
			while(y!=0){
		
				int rem = y%10;
				temp = temp*10+rem;
				y = y/10;
			}
			if(temp==x)
				System.out.println(x);
		}
	}
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number");
		int start = sc.nextInt();
		System.out.println("Enter ending number");
		int end = sc.nextInt();

		fun(start,end);

	}
}
