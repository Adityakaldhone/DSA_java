/*
 34. Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 10
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int count = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                count++;
        }
        int arr[] = new int[count];
        int itr = 0;
        for(int i=0;i<nums.length;i++){
            if(target == nums[i]){
                arr[itr++] = i;
            }
        }
        int ar2[] = new int[2];
        if(count>2){
            ar2[0] = arr[0];
            ar2[1] = arr[arr.length-1];
            return ar2;
        }
        if(count == 1){
            ar2[0] = arr[0];
            ar2[1] = arr[0];
            return ar2;
        }
        if(itr==0){
            int ar1[] = new int[2];
            ar1[0] = -1;
            ar1[1] = -1;
            return ar1;
        }

        return arr;
    }
}
