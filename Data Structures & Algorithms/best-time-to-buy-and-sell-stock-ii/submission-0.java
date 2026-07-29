class Solution {
    public int maxProfit(int[] prices) {
       int sum =0;
        int i =0;
        int j  =0;
        while(j<prices.length-1){
            if(prices[j+1]<prices[j]){
                sum  =  sum+(prices[j] - prices[i]);
                i= j+1;
                j=  i;
            }else{
                j++;
            }
        }

        if(i < prices.length - 1){
    sum += prices[prices.length-1] - prices[i];
}
        return sum;
    }
}