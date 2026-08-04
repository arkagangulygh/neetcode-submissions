class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer>f=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            f.put(nums[i],f.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list = new ArrayList<>(f.keySet());

        // Step 3: sort by frequency (descending)
        Collections.sort(list, (a, b) -> f.get(b) - f.get(a));

        // Step 4: take first k elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }
        return result;
        
    }
}
