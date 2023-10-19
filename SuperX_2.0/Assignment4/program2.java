/*
Que 2 : WAP to print the following pattern
Take row input from user
1
2 1
3 2 1
4 3 2 1
*/ 
class Pattern2 {

	public static void main(String[]args) {
	
		for(int i=1;i<=4;i++){
		
			for(int j=i;j>0;j--){
			
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}


}
