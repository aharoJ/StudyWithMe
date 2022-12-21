import java.util.HashMap;

public class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        if ( s == null || s.length() <=1 ) return true;

        HashMap<Character,Character> myMap = new HashMap<>();
        for ( int i=0; i < s.length(); ++ i )
        {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if ( map.containsKey(a) )
            {
                if (map.get(a) == map.get(b)) continue;
                else
                return false;
            
            } else {
                if (!map.containsValue(b) )
                map.pur(a,b);
                else return false;
            }
        } return true;
    }
}