/*
 Majority Element
Company: Flipkart, Accolite, Amazon, Microsoft, D-E-Shaw, Google, Nagarro, Atlassian
Platform : Leetcode - 169, GFG
Fraz’s & striver’s SDE sheet.
Description

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than [n / 2⌋ times. You
may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
Constraints:
n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 */ 
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        int max = Integer.MIN_VALUE;
        int ele = 0;
        for(Map.Entry<Integer, Integer> a :count.entrySet()){
            if(max < a.getValue() ){
            max = a.getValue();
            ele = a.getKey();
            }

        }
        if(max >= (nums.length/2))
        return ele;

        return -1;
    }
}
