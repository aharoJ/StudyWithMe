package String;


class ValidPalindrome_125 {
    public boolean ispalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s == null) {
                return true;
            }
            if (!Character.isLetterOrDigit(left)) {
                left++;
            }
            if (!Character.isLetterOrDigit(right)) {
                right--;
            }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
        }
        return false;
    }
}
