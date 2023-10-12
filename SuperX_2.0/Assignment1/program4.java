/*
 A b C d E
e D c B
B c D
d C
C
 */ 
import java.util.Scanner;
class PatternDemo {
 
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int row = sc.nextInt();
		System.out.println("Enter columns");
		int col = sc.nextInt();
	
       		char ch1 = 'A';
		char ch2 = 'a';
			
		for (int i = 1; i <= row; i++) {
            		
			for (int j = 1; j <= col; j++) {
               			if(i%2==1) {

					if(j%2==1){
				
						System.out.print(ch1);
					}else if(j%2==0){
				
						System.out.print(ch2);
					}
					if(i%2==1){
				
						ch1++;
						ch2++;
					}else{
				
						ch1--;
						ch2--;
					}
				}else if(i%2==0){
				
					if(j%2==1){
					
						System.out.print(ch2);
					}else if(j%2==0){
					
						System.out.print(ch1);
					}
					if(i%2==0){
					
						ch1--;
						ch2--;
					}
				}	
        	}
		col--;
		if(i%2==1){
		
			ch1--;
			ch2--;
		}else {
		
			ch1++;
			ch2++;
		}
		
		System.out.println();
		
	}
	
	}
}
