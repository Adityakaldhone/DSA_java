/*
 WAP to fing the occurance of vowels in a given String
 I/P:adgtioseobi
 O/P:a=1,e=1,i=2,o=2,u=2
 */ 
import java.util.Scanner;
class VowelsOccurance {

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		int length = str.length();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		for(int i=0;i<str.length();i++){
		
			if(str.charAt(i)=='a' || str.charAt(i)=='A') {
			
				count1++;
			}
			if(str.charAt(i)=='e' || str.charAt(i)=='E') {
			
				count2++;
			}
			if(str.charAt(i)=='i' || str.charAt(i)=='I') {
			
				count3++;
			}
			if(str.charAt(i)=='o' || str.charAt(i)=='O') {
			
				count4++;
			}
			if(str.charAt(i)=='u' || str.charAt(i)=='U') {
			
				count5++;
			}
		}
		System.out.println("a = "+ count1);
		System.out.println("e = "+ count2);
		System.out.println("i = "+ count3);
		System.out.println("o = "+ count4);
		System.out.println("u = "+ count5);
	}
}
