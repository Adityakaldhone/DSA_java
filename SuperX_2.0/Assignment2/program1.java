/*
 Que 1 : WAP to print the following pattern
Take input from user
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7
 */ 
import java.util.Scanner;
class Pattern1 {

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = sc.nextInt();
		System.out.println("Enter number of columns");
		int col = sc.nextInt();

		for(int i=0;i<row;i++){
		
			for(int j=1;j<=col;j++){
			
				System.out.print(i+j);
			}
			System.out.println();
		}
	}
}
