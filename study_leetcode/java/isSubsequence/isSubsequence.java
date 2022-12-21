class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        if (s.length() == 0) return true;
        
        int left = 0    ,   right = 0;
        for ( int i=0; i < t.length(); ++ i)
        {
            if ( s.charAt(left) == t.charAt(right) )
            {
                ++ left;

                if ( left == s.length() )
                    return true;
            
            } ++ right;
        
        } return false;

    }
}