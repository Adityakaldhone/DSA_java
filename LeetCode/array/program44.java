/*
 Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

1 <= numRows <= 30
 */ 
class Solution {
    public List<List<Integer>> generate(int numRows) {

         List<List<Integer>> l = new ArrayList<>();


        for (int i = 0; i < numRows; i++)
        {

            int[] dp = new int[i + 1];


            dp[0] = 1;
            dp[dp.length - 1] = 1;


            for (int j = 1; j < dp.length - 1; j++)
            {

                dp[j] = l.get(i - 1).get(j - 1) + l.get(i - 1).get(j);
            }

            List<Integer> rowList = new ArrayList<>();
            for (int num : dp) {
                rowList.add(num);
            }
            l.add(rowList);
        }


        return l;
    }
}
