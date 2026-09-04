class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int longest = Integer.MAX_VALUE;
        int i= 0;
        int j=0;
        int sum = 0;
        while(j<nums.length){
            sum += nums[j];
            while(sum >= target){
                longest =  Math.min(j-i+1,longest);
                sum -= nums[i];
                i++;
            }
            if(sum >= target){
                longest =Math.min(j-i+1,longest);
            }
            j++;
        }
        return longest==Integer.MAX_VALUE ? 0 : longest;
    }
}