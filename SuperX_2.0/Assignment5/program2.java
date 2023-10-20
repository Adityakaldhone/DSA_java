/*
 Que 2: WAP to print the following pattern
Take row input from the user
A
B A
C B A
D C B A
 */ 
class Pattern1 {

	public static void main(String[]args) {
	
		for(int i=1;i<=4;i++){
			int ch = 64 + i;
			for(int j=1;j<=i;j++){

					System.out.print((char)ch-- +" ");
			}
			System.out.println();
		}
	}
}
