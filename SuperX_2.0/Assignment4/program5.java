/*
 Que 5 : WAP to check whether the string contains characters other than
letters.
 */ 
import java.util.Scanner;
class Check {

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		int count = 0;
		for(int i=0;i<str.length();i++){
		
			if(str.charAt(i) >= 65 && str.charAt(i)<= 91 || str.charAt(i)>= 97 && str.charAt(i)<=123){
			
				count++;
				
			}
		}
		if(count==str.length()) {
		
			System.out.println("the given String contains only characters");
		}else{
		
			System.out.println("the given String not contains only characters");
		}
	}
}
