/*
 1. Reverse Integer (Leetcode:- 7)

Given a signed 32-bit integer x, return x with its digits reversed. If reversing
x causes the value to go outside the signed 32-bit integer range [-231, 231
- 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed
or unsigned).
Example 1:
Input: x = 123
Output: 321
Example 2:
Input: x = -123
Output: -321
Example 3:
Input: x = 120
Output: 21

Constraints:
-231 <= x <= 231 - 1
 */
import java.util.*;
class Solution {
    public static int reverse(int x) {
        int temp = x;
        long mul = 0;
        while(temp!=0){

            int rem = temp%10;
            mul = mul*10+rem;
            temp = temp/10;
            if (mul > Integer.MAX_VALUE || mul < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int)mul;
    }

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int x = sc.nextInt();

		int ret = reverse(x);
		System.out.println(ret);

	}
}
