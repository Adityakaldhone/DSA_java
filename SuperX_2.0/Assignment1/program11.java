//Check wheather the given String is pallindrome or not
import java.util.*;
class PallindromeCheck {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		StringBuffer sb = new StringBuffer(str);
		String str1 = sb.reverse().toString();
		if(str.equals(str1)){
			System.out.println("String is Pallindromic String");
		}else{
		
			System.out.println("Not an Pallindromic String");
		}
		

	}
}
