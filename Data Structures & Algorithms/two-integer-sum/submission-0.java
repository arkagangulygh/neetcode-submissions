class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer>f=new HashMap<>();
        int[] answer=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int complement=target-nums[i];
            if(f.containsKey(complement))
            {
                answer[1]=i;
                answer[0]=f.get(complement);
                return answer;
            }
            else
            {
                f.put(nums[i],i);
            }

        }
        return new int[]{-1,-1};
        
    }
}
