import java.util.*;

class Solution {
	
	int leaderInDigit(int digit) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		while(digit != 0) {
			
			al.add(digit % 10);
			digit /= 10;
		}
		int num = al.get(0);
		for(int i = 1; i < al.size(); i++) {

			if(num <= al.get(i)) {
				
				num = al.get(i);
			}
		}
		return num;
	}
	public static void main(String[] args) {
		
		System.out.println(new Solution().leaderInDigit(456759));
	}
}
