/*
 Que 2 : WAP to print the following pattern
Take row input from user
1
2 4
3 6 9
4 8 12 16
 */ 
class Solution {

	public static void main(String[]args) {
	
		for(int i=1;i<=4;i++){
		
			for(int j=1;j<=i;j++) {
			
				System.out.print(i*j +" ");
			}
			System.out.println();
		}
	}
}
