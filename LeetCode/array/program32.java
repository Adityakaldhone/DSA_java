/*
 Array Subset of another array
	Company: Accolite, Qualcomm, GE
	Platform: GFG
	Description:
	Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check
	whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted.
	There can be duplicate elements.
	Example 1:
	Input:
	a1[] = {11, 7, 1, 13, 21, 3, 7, 3}
	a2[] = {11, 3, 7, 1, 7}
	Output:
	Yes
	Explanation:
	a2[] is a subset of a1[]
	Example 2:
	Input:
	a1[] = {1, 2, 3, 4, 4, 5, 6}
	a2[] = {1, 2, 4}
	Output:
	Yes
	Explanation:
	a2[] is a subset of a1[]
	Example 3:
	Input:
	a1[] = {10, 5, 2, 23, 19}
	a2[] = {19, 5, 3}
	Output:
	No
	Explanation:
	a2[] is not a subset of a1[]
	Your Task:
	You don't need to read input or print anything. Your task is to complete the
	function isSubset() which takes the array a1[], a2[], its size n and m as inputs and
	return "Yes" if arr2 is subset of arr1 else return "No" if arr2 is not subset of arr1.
	Expected Time Complexity: O(max(n,m))
	Expected Auxiliary Space: O(n)
	
	Constraints:
	1 <= n,m <= 105
	1 <= a1[i], a2[j] <= 106
*/

class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {

        HashMap<Long, Long> hm1 = new HashMap<>();
        HashMap<Long, Long> hm2 = new HashMap<>();

        for (long data1 : a1) {
            hm1.put(data1, (long)hm1.getOrDefault(data1, 0L) + 1);
        }
        for (long data2 : a2) {
            hm2.put(data2, (long)hm2.getOrDefault(data2, 0L) + 1);
        }

        int count = 0;

        for (Map.Entry<Long, Long> entry1 : hm2.entrySet()) {
            long key1 = entry1.getKey();
            long valueInHm2 = entry1.getValue();

            if(hm1.containsKey(key1) && valueInHm2 <= hm1.get(key1)) {

                    count++;
            }
        }

        if (count == hm2.size())
            return "Yes";
        else
            return "No";
    }
}
