/*
        1
      2 4
    3 6 9 
 4 8 12 16
 */ 
class PatternFive {

	public static void main(String[]args) {
		int x = 1;
		for(int i=1;i<=4;i++){
		
			for(int j=1;j<=4;j++) {
			
				if(j<=4-i){
				
					System.out.print("  ");
				}else{
				
					System.out.print(x +" ");
					x = x+i;
				}
			}
			x = i+1;
			System.out.println();
		}
	}
}
