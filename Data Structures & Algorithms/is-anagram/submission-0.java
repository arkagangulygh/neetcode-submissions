class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer>f=new HashMap<>();
        //HashMap<Character,Integer>g=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(f.containsKey(c))
            {
                f.put(c,f.get(c)+1);
            }
            else
            {
                f.put(c,1);
            }
        }
        for(int j=0;j<t.length();j++)
        {
            char d=t.charAt(j);
            if(f.containsKey(d))
            {
                f.put(d,f.get(d)-1);
            }
            else
            {
                return false;
            }
        }
        for (int val : f.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
        
    }
}
