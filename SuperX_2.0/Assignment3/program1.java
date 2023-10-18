/*
 Que 1 : WAP to print the following pattern
Take input from user
A B C D
B C D E
C D E F
D E F G
 */ 
class Solution {

	public static void main(String[]args) {
		
		int ch = 64;
		for(int i=1;i<=4;i++){
			ch = (char)(64 + i);
			for(int j=1;j<=4;j++){
			
				System.out.print((char)ch++ +" ");
			}
			
			System.out.println();
		}
	}
}
