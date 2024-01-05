class Solution {
    public int singleNumber(int[] nums) {
           HashMap<Integer,Integer> count = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> a :count.entrySet()){
            
            if(a.getValue() == 1){
                
                return a.getKey();
            }
        }
        return 0;
    }
}
