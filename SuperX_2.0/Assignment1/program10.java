/*
 Take String from user and convert all odd indexes of String to UpperCase and all even indexes of String to lowrCase
 I/P:dfTbnSrOvryt
 O/p:DfTbNsRoVrYt
 */ 
import java.util.Scanner;
class Demo {

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		int length = str.length();
		int ch = 32;
		for(int i=0;i<length;i++){
		
			if(i%2==0){
			
				if(str.charAt(i) >= (char)97) {
				
					System.out.print(str.charAt(i));
				}else{
					int ret = (int)(str.charAt(i));
					int x = ret+ch;
					System.out.print(x);
					
				
				}
			}else{
			
				if(str.charAt(i)<=91){
				
					System.out.print(str.charAt(i));
				}else{	
					int ret = (int)(str.charAt(i));
					int x = ret-ch;
					System.out.print(x);
				}
			}
		}
	}
}


