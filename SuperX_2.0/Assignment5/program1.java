/*
 Que 1: WAP to print the following pattern
Take input from the user
A B C D
# # # #
A B C D
# # # #
A B C D
 */ 
class Pattern1 {

	public static void main(String[]args) {
	
		for(int i=1;i<=4;i++){
			char ch = 'A';
			for(int j=1;j<=4;j++){
				if(i%2==1)
					System.out.print(ch++ +" ");
				else
					System.out.print("# ");
			}
			System.out.println();
		}
	}
}
