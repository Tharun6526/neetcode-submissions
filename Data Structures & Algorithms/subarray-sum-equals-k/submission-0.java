class Solution {
    public int subarraySum(int[] nums, int k) {
      HashMap<Integer,Integer> mpp = new HashMap<>();
      mpp.put(0,1);
      int sum =0;
      int res = 0;
      for(int i =0;i<nums.length;i++){
        sum += nums[i];
        res += mpp.getOrDefault(sum-k,0);
        mpp.put(sum,mpp.getOrDefault(sum,0)+1);
      }
      return res;
    }
}