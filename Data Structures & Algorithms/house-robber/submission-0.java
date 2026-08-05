class Solution {
    public int rob(int[] nums) 
    {
        int free=0;
        int n=nums.length;
        int[][] dp=new int[n+1][2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                dp[i][j]=-1;
            }
        }
        return robfunction(0,n,nums,dp,free);
        
    }
    public int robfunction(int i,int n,int[] nums,int[][] dp,int free)
    {
        if(i==n)
        {
            return 0;
        }
        if(i<n && free==1)
        {
            return robfunction(i+1,n,nums,dp,0);
        }
        if(dp[i][free]!=-1)
        {
            return dp[i][free];
        }
        int rob=nums[i]+robfunction(i+1,n,nums,dp,1);
        int skip=robfunction(i+1,n,nums,dp,0);
        return dp[i][free]=Math.max(rob,skip);
    }
}
