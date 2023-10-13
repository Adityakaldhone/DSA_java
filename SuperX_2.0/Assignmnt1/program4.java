/*
 4
 5 7
 6 9 12
 7 11 15 19
 */ 
class Pattern3 {

	public static void main(String[]args) {
		int x = 4;	
		for(int i=1;i<=4;i++){
		
			for(int j=1;j<=i;j++) {
			
				System.out.print(x+" ");
				x = x+i;
			}
			x = 4+i;
			System.out.println();
		}

	}
}
