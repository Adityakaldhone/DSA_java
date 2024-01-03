/*4. Median of Two Sorted Arrays
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

            int size = nums1.length + nums2.length;
            int[] arr = new int[size];
            int itr = 0;
            for(int i=0;i<nums1.length+nums2.length;i++){
                if(i<nums1.length){
                    arr[i] = nums1[i];
                }else{
                    arr[i] = nums2[itr++];
                }
            }
            Arrays.sort(arr);

            if(size % 2 == 1){
                int p = size/2;
                double q = arr[p];
                return q;
            }else{

                int x = size/ 2;
                double  y = (double)(arr[x] + arr[x - 1]) / 2;
                return y;
            }
    }
}
