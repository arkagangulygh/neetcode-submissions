class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int low=0;
        int result=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int high=0;high<s.length();high++)
        {
            char ch=s.charAt(high);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
            int k=high-low+1;
            while(map.size()<k)
            {
                char chh=s.charAt(low);
                map.put(chh,map.get(chh)-1);
                if(map.get(chh)==0)
                {
                    map.remove(chh);
                }
                low++;
                k=high-low+1;
            }
            int len=high-low+1;
            result=Math.max(result,len);
        }
        return result;
    }
}