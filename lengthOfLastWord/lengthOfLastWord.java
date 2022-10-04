class Solution {
    public int lengthOfLastWord(String s) 
    {
        int counter = 0; // counter <--> length of a string :?: if found
        for (int i=s.length()-1; i >=0; -- i)
        {
            if (s.charAt(i) != ' ') {
                ++ counter;
            
            } else if (counter > 0 ) {
                return counter;
            } 

        } return counter;
    }
}