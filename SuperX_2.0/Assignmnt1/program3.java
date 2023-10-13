/*
 5
 6 8 
 7 10 13
 8 12 16 20
 9 14 19 24 29
 */ 
class Pattern3 {

	public static void main(String[]args) {
		int x = 5;	
		for(int i=1;i<=5;i++){
		
			for(int j=1;j<=i;j++) {
			
				System.out.print(x+" ");
				x = x+i;
			}
			x = 5+i;
			System.out.println();
		}

	}
}
