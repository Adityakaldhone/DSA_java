/*
D C B A 
e f g h 
F E D C 
g h i j 
*/ 
import java.util.Scanner;
class Pattern {

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int row = sc.nextInt();
		System.out.println("Enter Columns");
		int col = sc.nextInt();

		int ch1 = 65;
		int ch2 = 97;

		for(int i=1;i<=row;i++){
		
			for(int j=1;j<=col;j++){
			
				if(i%2==1){
				
					System.out.print((char)(ch1+row-1));
					ch1--;
					
				}else{
				
					System.out.print((char)(ch2+row+1));
					ch2++;
				}
		
			}
			ch1 = ch1+row-1;
			ch2--;	
			
			System.out.println();
		}
	}
}
