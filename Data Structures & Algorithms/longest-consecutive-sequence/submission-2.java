class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> mpp = new HashSet<>();
        for(int i: nums){
            mpp.add(i);
        }
        int max = 0;
        for(int i =0;i<nums.length;i++){
            if(!mpp.contains(nums[i]-1)){
        int length = 1;

            while(mpp.contains(nums[i]+length)){
                length++;
            }
            max=  Math.max(max,length);
            }
        }
        return max;
    }
}
