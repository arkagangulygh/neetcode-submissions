class Solution {
    public int maxProfit(int[] prices) 
    {
        int profit=0;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                profit=prices[j]-prices[i];
                maxprofit=Math.max(profit,maxprofit);
            }
        }
        return maxprofit;
        /*int boughtprice=1000;
        int i=0;
        for(i=0;i<prices.length;i++)
        {
            if(prices[i]<boughtprice)
            {
                boughtprice=i;
            }
        }
        int len=0;
        int maxlen=0;
        for(int j=i+1;j<prices.length;j++)
        {
            len=prices[j]-prices[boughtprice];
            maxlen=Math.max(maxlen,len);
        }
        return maxlen;*/
        
    }
}
