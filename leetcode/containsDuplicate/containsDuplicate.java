class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        HashSet<Integer> mySet = new HashSet<>();
        
        for ( int i : nums )
        {
            if ( mySet.contains(i))         // base case
                return true;               // true if "at least twice";
            else
                mySet.add(i);       // add to our Set;
            
        } return false;
    }
}