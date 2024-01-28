/*
 1: Intersection of Two Arrays
Company: Accolite, Amazon, Microsoft, PayPal, Rockstand
Platform: Leetcode - 349
Striver’s SDE sheet
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any
order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
 */ 
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<nums1.length;i++) {
            for(int j=0;j<nums2.length;j++) {
                if(nums1[i] == nums2[j]) {
                    if(!al.contains(nums1[i])){
                        al.add(nums1[i]);
                    }
                }
            }
        }
        int arr[] = new int[al.size()];
        if(al.isEmpty()){
            return new int[]{};
        }
        for(int i=0;i<arr.length;i++) {
            arr[i] = al.get(i);
        }
        return arr;
    }
}
