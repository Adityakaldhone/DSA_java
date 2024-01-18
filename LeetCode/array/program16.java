/*
 Key Pair
 Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.

Example 1:

Input:
N = 6, X = 16
Arr[] = {1, 4, 45, 6, 10, 8}
Output: Yes
Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
Example 2:

Input:
N = 5, X = 10
Arr[] = {1, 2, 4, 3, 6}
Output: Yes
Explanation: Arr[2] + Arr[4] = 4 + 6 = 10
Your Task:
You don't need to read input or print anything. Your task is to complete the function hasArrayTwoCandidates() which takes the array of integers arr, n and x as parameters and returns a boolean denoting the answer.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 105
 */ 
class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {

            Arrays.sort(arr);

            int left = 0;
            int right = arr.length- 1;

            while(left < right) {
                if(arr[left] + arr[right] == x) {
                    return true;
                }else if(arr[left]+arr[right] < x) {
                    left++;
                }else {
                    right--;
                }
            }
            return false;
    }
}
