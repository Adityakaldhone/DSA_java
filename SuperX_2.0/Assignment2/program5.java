/*
 Que 5 : WAP to count the size of given string
(without using inbuilt method)
 */ 
import java.util.Scanner;
class CountDemo {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;

		System.out.println("Enter String");
		String str = sc.nextLine();

		for(int i=0;i<str.length();i++){
		
			if(str.charAt(i)!='\n')
				count++;
		}
		System.out.println(count);
	}
}
