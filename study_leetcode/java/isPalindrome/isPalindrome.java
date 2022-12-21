class Solution {
    public boolean isPalindrome(String string) 
    {
        if ( string == null ) return false; //base case

        int left = 0,       right = string.length() -1;
        for (int i=0; i < string.length()-1; ++ i)
        {
            if ( !Character.isLetterOrDigit(string.charAt(left)) ){
            	++ left;    // skip over Non Lett || Digit
            
            }else if ( !Character.isLetterOrDigit(string.charAt(right)) ){
            	-- right;   // skip over Non Lett || Digit

            } else if ( Character.toLowerCase(string.charAt(left))  !=
            	 Character.toLowerCase(string.charAt(right)) ) {
            	return false;

            } else{            

            ++ left;
            -- right;
            }

        } return true;   
    }
}