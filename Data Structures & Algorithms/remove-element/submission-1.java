class Solution {
    public int removeElement(int[] nums, int val) {
        int n = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[n] = nums[i];
                n++;
            }
        }
        return n;


        // int i = 0;
        // int n = nums.length;
        // while(i<n){
        //     if(nums[i]==val){
        //         nums[i] = nums[n-1];
        //         n--;
        //     }else{
        //         i++;
        //     }
        // }
        // return n;
    }
}