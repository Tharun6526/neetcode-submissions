class Solution {
    public int trap(int[] height) {
        int lmax = height[0];
        int rmax = height[height.length-1];
        int i =0;
        int j = height.length-1;
        int cnt=  0;
        while(i<j){
            if(height[i]<height[j]){
                lmax = Math.max(lmax,height[i]);
                cnt += lmax - height[i];
                i++;
            }else{
                rmax = Math.max(rmax,height[j]);
                cnt += rmax - height[j];
                j--;
            }
        }
        return cnt;
    }
}
