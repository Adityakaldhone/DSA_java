/*
 0
 3  8
 15 24 35
 48 63 80 99
 */ 
class PatternTwo {

	public static void main(String[]args) {
		int x = 3;
		int y = 0;
		for(int i=1;i<=4;i++){
		
			for(int j=1;j<=i;j++) {
			
				System.out.print(y+" ");
				y = y + x;
				x = x + 2;
								
			}
			System.out.println();
		}
	}
}
