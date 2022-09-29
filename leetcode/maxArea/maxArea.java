class Solution {
    public int maxArea(int[] H) 
    {
        int left = 0,   right = H.length -1;
        int currSum = 0, memo = 0; 
        
        while ( left < right )
        {
            int w = (right - left);

            if ( H[left] <= H[right] ) 
            {
                currSum = H[left] * w;
                ++ left;
            
            } else {
                currSum = H[right] * w;
                -- righ;
            }

            if ( memo < currSum ) memo = currSum;

        } return memo;
        
    }
}