public class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        if (strs == null || strs.length <=0)
            return "";
            
        Arrays.sort(strs);
        String left  = strs[0];
        String right = strs[strs.length -1];
        int c        = 0;
        while ( c < left.length() )
        {
            if ( left.charAt(c) == right.charAt(c))
                ++ c;
            else
                break;

        } return c <= 0 ? "" : left.substring(0, c);
    }
}