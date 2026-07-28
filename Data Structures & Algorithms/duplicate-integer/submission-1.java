class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> mpp = new HashSet<>();
        for(int i:nums){
            if(mpp.contains(i)){
                return true;
            }
            mpp.add(i);
        }
        return false;
    }
}