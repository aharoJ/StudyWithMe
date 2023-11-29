package leetcode.java;

public class IsPalindrome_9 {
    public static void main(String[] args) {
        IsPalindrome_9 p = new IsPalindrome_9();
        boolean results = p.isPalindrome(121);
        System.out.println("It is: "+ results);
        
    }

    // return true if x is a palindrome, and false otherwise
    public boolean isPalindrome(int x) {

    String s = String.valueOf(x); // convert x to a string
        
        int left=0; // left pointer
        int right= s.length()-1; // right pointer
        while( right > left)
        {
            if (s.charAt(left) != s.charAt(right) ) {
                return false;
            } 
            
            System.out.println(s);
            left++;
            right--;

        } return true;

    }
}
