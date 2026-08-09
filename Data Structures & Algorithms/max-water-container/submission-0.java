class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int max= Integer.MIN_VALUE;
        while(i<j){
            int min = Math.min(heights[i],heights[j]);
            // min * 
            int maxheight = min * (j-i);
            max = Math.max(max,maxheight);
            if(heights[i]>=heights[j]){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }
}
