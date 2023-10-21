/*
 Que 4: WAP to print the following pattern
Take input from the user
1 3 5 7
2 4 6 8
9 11 13 15
10 12 14 16
 */ 
class Pattern2 {

	public static void main(String[]args) {
		int num = 1;
		int num1 = 2;
		for(int i=1;i<=4;i++){
			
			for(int j=1;j<=4;j++){
			
				if(i%2==1){
				
					System.out.print(num+" ");
					num = num+2;
				}else{
					System.out.print(num1+" ");
					num1 = num1+2;
				}

			}
			System.out.println();
		}
	}
}
