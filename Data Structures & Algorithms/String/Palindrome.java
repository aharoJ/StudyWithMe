package String;

public class Palindrome 
{
    public static void main(String[] args) {
        Palindrome z = new Palindrome();
        System.out.println(z.isPalindrome("madam"));
        System.out.println(z.isPalindrome("racecar"));
        System.out.println(z.isPalindrome("lahmz"));
    }

    public boolean isPalindrome(String word)
    {
        char array[]= word.toCharArray();
        int left= 0; 
        int right = word.length() -1;
        for(int i=0; i< array.length; ++i)
        {
            if (array[left] !=array[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
    
}
