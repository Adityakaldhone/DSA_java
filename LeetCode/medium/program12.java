/*
 Code2: Pairs of Songs With Total Durations Divisible by 60
Companies : Microsoft, Apple, Facebook, Amazon, Skype,Blackrock,
Cisco,Infosys, Paypal, VMware, Walmart, Goldman Sachs,Visa,Oracle,
Audible,De Shaw.
Platform: Leetcode- 1010
Fraz’s DSA sheet
Description
You are given a list of songs where the ith song has a duration of time[i]
seconds.

Return the number of pairs of songs for which their total duration in seconds
is divisible by 60. Formally, we want the number of indices i, j such that i < j
with (time[i] + time[j]) % 60 == 0.

Example 1:
Input: time = [30,20,150,100,40]
Output: 3
Explanation: Three pairs have a total duration divisible by 60:
(time[0] = 30, time[2] = 150): total duration 180
(time[1] = 20, time[3] = 100): total duration 120
(time[1] = 20, time[4] = 40): total duration 60
Example 2:
Input: time = [60,60,60]
Output: 3
Explanation: All three pairs have a total duration of 120, which is divisible
by 60.

Constraints:
1 <= time.length <= 6 * 104
1 <= time[i] <= 500
 */ 
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count =0;
        for(int i=0;i<time.length;i++){
            if(time[i]>=60) time[i]%=60;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<time.length;i++){
            if(time[i]==0 && map.containsKey(time[i])){
                count+=map.get(time[i]);
            }
            if(map.containsKey(60-time[i])){
                count+=map.get(60-time[i]);
            }
            map.put(time[i],map.getOrDefault(time[i],0)+1);
        }
        return count;
    }
}
