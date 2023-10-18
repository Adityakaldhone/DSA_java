/*
 Que 4 : WAP to print the composite numbers in the given range
Input: start:1
end:100
 */
import java.util.*;
class Solution {

	int fun(int start,int end){
		int count = 0;
		for(int i=start;i<=end;i++) {
			for(int j=1;j<=i;j++){
		
				if(i%j==0){
			
					count++;
				}

			}
			if(count>2){
				System.out.println(i);
			}
			count = 0;
			
		}
		return 0;
	}
	public static void main(String[]args) {
	
		Solution obj = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start");
		int start = sc.nextInt();
		System.out.println("Enter End");
		int end = sc.nextInt();
		obj.fun(start,end);
		
	}
}
