class Solution {
    public int maxProfit(int[] prices) {
         int n=prices.length;
         if(n==0) return 0;
         int buyprice=prices[0];
         int maxprice=0;
         for(int i=0;i<prices.length;i++){
            int curr=prices[i];
            if(curr>buyprice){
                maxprice=Math.max(maxprice,(curr-buyprice));
            }
            else{
                buyprice=curr;
            }
         }

         return maxprice;
    }
}