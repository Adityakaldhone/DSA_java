/*
 Que 1 : WAP to print the following pattern
Take input from user
A B C D
D C B A
A B C D
D C B A
 */ 
class Pattern {

	public static void main(String[]args) {
		char ch = 'A';
		for(int i=1;i<=4;i++){
		
			for(int j=1;j<=4;j++){
				if(i%2==1)
				System.out.print(ch++ +" ");
				else
					System.out.print(--ch + " ");
			}
			System.out.println();
		}
	}
}
