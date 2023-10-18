/*
 
   Program 5 : WAP to check whether the string contains vowels and return the count of vowels

*/

import java.util.*;

class Solution {
	
	static int countVowels(String str) {

		int countVowel = 0;

		for(int i=0; i<str.length(); i++) {

			if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
				countVowel++;
			
			if(str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u')
				countVowel++;
		}
		return countVowel;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string : ");
		String str = sc.nextLine();

		int count = countVowels(str);

		System.out.println("Vowels count : "+count);
	}
}
