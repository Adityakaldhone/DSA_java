/*
 1:Single Number
Company : Amazon, wipro, Capgemini, DXC technology, Schlumberger,
Avizva, epam, cadence, paytm, atlassian,cultfit+7
Striver’s SDE Sheet
Platform: LeetCode - 136
Description:
Given a non-empty array of integers nums, every element appears
twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use
only constant extra space.
Example 1:
Input: nums = [2,2,1]
Output: 1
Example 2:
Input: nums = [4,1,2,1,2]
Output: 4
Example 3:
Input: nums = [1]
Output: 1
Constraints:
1 <= nums.length <= 3 * 10^4

Java
-3 * 104 <= nums[i] <= 3 * 10^4
Each element in the array appears twice except for one element
which appears only once.
 */ 
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> a :count.entrySet()){
            if(a.getValue() == 1) {
                return a.getKey();
            }
        }
        return 0;
    }
}
