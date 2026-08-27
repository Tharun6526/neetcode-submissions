class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int cost = prices[0];
        for(int i =0;i<prices.length;i++){
            cost = Math.min(cost,prices[i]);
            ans = Math.max(ans,prices[i] - cost);
        }
        return ans;
    }
}
