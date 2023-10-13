/*
 1 2 3 4
 4 5 6 7
 6 7 8 9
 7 8 9 10
 */
import java.util.*;
class PatternOne {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter rows");
		int row = sc.nextInt();
		System.out.println("Enter columns");
		int col = sc.nextInt();
		int x = 1;
		for(int i=1;i<=row;i++){
		
			for(int j=1;j<=col;j++){
			
				System.out.print(x++);

			}
			x = x-i;
			System.out.println();
		}
	}
}
