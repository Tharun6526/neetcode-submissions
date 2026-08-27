class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> mpp = new HashSet<>();
        int i= 0;
        int j = 0;
        while(j<nums.length){
            if(j-i > k){
                mpp.remove(nums[i]);
                i++;
            }
            if(mpp.contains(nums[j])){
                return true;
            }
            mpp.add(nums[j]);
            j++;
        }
        return false;
    }
}