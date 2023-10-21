/*
 Que 2: WAP to print the following pattern
Take row input from the user
a
A B
a b c
A B C D
 */ 
class Pattern1 {

	public static void main(String[]args) {
	
		for(int i=1;i<=4;i++){
			char ch = 'a';
			char ch2 = 'A';
			for(int j=1;j<=i;j++){
			
				if(i%2==0)
					System.out.print(ch2++ +" ");
				else
					System.out.print(ch++ +" ");
			}
			System.out.println();
		}	
	}
}
