//program to find number is armstrong or not 
import java.util.Scanner;
class Armstrong {

	static void fun(int num){
	
		int count = 0;
		int temp1 = num;
		int temp2 = num;
		int sum = 0;

		while(temp1!=0){
		
			count++;
			temp1 = temp1/10;
		}
		for(int i=1;i<=count;i++) {
			int fact  =1;
			int rem = num%10;
			for(int j=1;j<=count;j++){
			
				fact = fact*rem;
			}
			num = num/10;
			sum = sum+fact;
		}
		if(temp2==sum){
		
			System.out.println("Armstrong number");
		}else{
		
			System.out.println("Not Armstrong number");
		}

	}
	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		fun(num);

	}
}
