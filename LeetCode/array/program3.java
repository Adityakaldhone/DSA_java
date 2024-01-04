class Solution {
    public int maxArea(int[] height) {
        SortedSet<Integer> ss = new TreeSet<>();
        int start = 0;
        int end = height.length-1;
        int min = 1;
        int prevEnd = height.length;
        int area = Integer.MIN_VALUE;
        while(start < end) {

            if(height[start] < height[end]){
                min = height[start];
                start ++;
            }else{
                prevEnd = end;
                min = height[end--];
            }
            if(prevEnd >= height[start]){
                area = min*(prevEnd-start);
            }else{
                    area = min*(prevEnd-start);
            }
            ss.add(area);
        }
        return ss.last();
    }
}
