/*
 Que 5: WAP to print the occurrence of a letter in given String.
Input String: “Know the code till the core”
Alphabet : o
Output: 3
 */
import java.util.*;
class StringDemo {

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		System.out.println("Enter Alphabet");
		char alphabet = sc.next().charAt(0);
		int count = 0;
		for(int i=0;i<str.length();i++){
		
			if(str.charAt(i) == alphabet)
				count++;
		}
		System.out.println(count);
	}
}
