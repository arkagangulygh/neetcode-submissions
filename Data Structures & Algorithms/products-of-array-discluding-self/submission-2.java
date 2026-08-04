class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int product=1;
        int[] output=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            product=product*nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                output[i]=product/nums[i]; 
            }
            else 
            {
                int emergencyproduct=1;
                int left=i-1;
                int right=i+1;
                for(int j=left;j>=0;j--)
                {
                    emergencyproduct=emergencyproduct*nums[j];
                }
                for(int k=right;k<nums.length;k++)
                {
                    emergencyproduct=emergencyproduct*nums[k];
                }
                output[i]=emergencyproduct;
            }
            
        }
        return output;
        
    }
}  
