class Solution {
    public boolean isPalindrome(String s) 
    {
        String result = s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            char c=result.charAt(i);
            char d=result.charAt(j);
            if (!Character.isLetterOrDigit(c)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(d)) {
                j--;
                continue;
            }
            if(c==d)
            {
                i++;
                j--;
            }
            else 
            {
                return false;
            }
            
        }
        return true;
    }
}
