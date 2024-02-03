/*
 Find All Duplicates in an Array
Company: Amazon, Microsoft, OYO Rooms
Platform: Leetcode - 442
Fraz’s DSA sheet.
Description:
Given an integer array nums of length n where all the integers of nums are in the range
[1, n] and each integer appears once or twice, return an array of all the integers that appears
twice.
You must write an algorithm that runs in O(n) time and uses only constant extra space.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:
Input: nums = [1,1,2]
Output: [1]
Example 3:
Input: nums = [1]
Output: []

Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
 */ 
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> a :count.entrySet()){
            if(a.getValue() == 2) {
                 al.add(a.getKey());
            }
        }
        return al;
    }
}
