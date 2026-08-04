class Solution {
    public boolean hasDuplicate(int[] nums) 
    {
        HashMap<Integer,Integer>f=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int s=nums[i];
            if(f.containsKey(s))
            {
                return true;
            }
            else
            {
                f.put(s,1);
            }
        }
        return false;

        
    }
}