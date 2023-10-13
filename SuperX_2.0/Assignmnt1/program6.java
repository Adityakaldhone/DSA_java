//WAP to print prime numbers in a range take range from user.
import java.util.Scanner;
class PrimeNum {

	static void fun(int start , int end) {
	
		for(int i=start;i<=end;i++) {
			int count = 0;
			for(int j=1;j<=i;j++) {
				
				if(i%j==0){
				
					count++;
				}
				if(j>i){
				
					break;
				}
			}
			if(count==2) {
			
				System.out.println(i);
			}
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
