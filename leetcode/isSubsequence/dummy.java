package leetcode.isSubsequence;

public class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        if (s.length() == 0) return true;

        int left = 0    ,   right = 0;

        while ( right < t.charAt(left) )
        {
            if (t.charAt(right) == s.charAt(left) )
            {
                ++ left;

                if (left == s.length())
                    return true;
            
            } ++ right;
        
        } return false;

    }
}