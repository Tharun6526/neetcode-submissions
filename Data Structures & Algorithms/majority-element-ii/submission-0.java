class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        List<Integer> res=  new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:mpp.entrySet()){
            if(entry.getValue()>(nums.length/3)){
                    res.add(entry.getKey());
            }
        }
        return res;
    }
}