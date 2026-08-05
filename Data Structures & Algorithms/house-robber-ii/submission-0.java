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
        int[][] dptwo=new int[n+1][2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                dptwo[i][j]=-1;
            }
        }
        if(n==1)
        {
            return nums[0];
        }
        return Math.max(robfunction(0,n-1,nums,dp,free),robfunctiontwo(1,n,nums,dptwo,free));
    }
    public int robfunction(int i,int n,int[] nums,int[][] dp,int free)
    {
        if(i==n)
        {
            return 0;
        }
        if(i<n && free==1)
        {
            return dp[i][free]=robfunction(i+1,n,nums,dp,0);
        }
        if(dp[i][free]!=-1)
        {
            return dp[i][free];
        }
        int rob=nums[i]+robfunction(i+1,n,nums,dp,1);
        int skip=robfunction(i+1,n,nums,dp,0);
        return dp[i][free]=Math.max(rob,skip);
    }
    public int robfunctiontwo(int i,int n,int[] nums,int[][] dptwo,int free)
    {
        if(i==n)
        {
            return 0;
        }
        if(i<n && free==1)
        {
            return dptwo[i][free]=robfunctiontwo(i+1,n,nums,dptwo,0);
        }
        if(dptwo[i][free]!=-1)
        {
            return dptwo[i][free];
        }
        int rob=nums[i]+robfunctiontwo(i+1,n,nums,dptwo,1);
        int skip=robfunctiontwo(i+1,n,nums,dptwo,0);
        return dptwo[i][free]=Math.max(rob,skip);
    }
}
