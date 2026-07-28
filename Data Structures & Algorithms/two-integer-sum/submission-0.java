class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(mpp.containsKey(target-nums[i])){
                int n = mpp.get(target-nums[i]);
                if(i<n){
                    return new int[]{i,n};
                }else{
                    return new int[]{n,i};
                }
            }
            mpp.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
