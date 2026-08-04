
class Solution {
    public int climbStairs(int n) 
    {
        int[] dp=new int[n];
        for(int j=0;j<n;j++)
        {
            dp[j]=-1;
        }
        return climbStairsactualfunction(0,n,dp);
        
    }
    public int climbStairsactualfunction(int i,int n,int[] dp)
    {
        if(i==n)
        {
            return 1;
        }
        if(i>n)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        int ans=climbStairsactualfunction(i+1,n,dp)+climbStairsactualfunction(i+2,n,dp);
        dp[i]=ans;
        return ans;

    }
}
