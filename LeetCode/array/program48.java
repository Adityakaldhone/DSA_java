/*
Binary Search
Company: Infosys,Oracle,Wipro,Linkedin,Qualcomm,TCS,Cognizant, Accenture
Platform: GFG
Description:
Given a sorted array of size N and an integer K, find the position(0-based
indexing) at which K is present in the array using binary search.
Example 1:
Input:
N = 5
arr[] = {1 2 3 4 5}
K = 4
Output: 3
Explanation: 4 appears at index 3.
Example 2:
Input:
N = 5
arr[] = {11 22 33 44 55}
K = 445
Output: -1
Explanation: 445 is not present.
Expected Time Complexity: O(LogN)
Expected Auxiliary Space: O(LogN) if solving recursively and O(1) otherwise.

Constraints:
1 <= N <= 105
1 <= arr[i] <= 106
1 <= K <= 106
*/ 
class Solution {
    int binarysearch(int arr[], int n, int k) {
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        
        while(start <= end){
            
            mid = (start+end)/2;
            
            if( k == arr[mid]){
                return mid;
            }else if(arr[mid] > k){
                end = mid-1;
            }else if (arr[mid] < k){
                start = mid+1;
            }
        }
        return -1;
    }
}
