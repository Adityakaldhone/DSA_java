/*
 3. Search Insert Position (LeetCode-35)

Given a sorted array of distinct integers and a target value, return the index
if the target is found. If not, return the index where it would be if it were
inserted in order.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4

Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
 */
import java.io.*;
class Solution {
    public static int searchInsert(int[] nums, int target) {
 
                if(target<nums[0]){
                    return 0;
                }
                if(nums.length==1 && target > nums[0]){
                    return nums.length;
                }
            	for(int i=1;i<nums.length;i++){
            
                 	if(nums[i]==target){
                   		 return i;
                	}else if( target < nums[i] && target>nums[i-1]){
                    		return i;
                	}else if(target > nums[nums.length-1]){
                    		return nums.length;
                	}
            	}
            	return 0;
    }
        public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size;
        int target;
        size = Integer.parseInt(br.readLine());
        target = Integer.parseInt(br.readLine());
        int arr1[] = new int[size];

        for(int i=0;i<arr1.length;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }
          int ret = searchInsert(arr1 , target);
          System.out.println(ret);
    }
}
