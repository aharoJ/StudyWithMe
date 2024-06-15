package string;

/**
 * Input: s = "Hello World"
 * Output: 5
 * 
 * Input: s = " fly me to the moon "
 * Output: 4
 * 
 * Input: s = "luffy is still joyboy"
 * Output: 6
 */
public class LengthLastWord_58 {
  public int lengthOfLastWord(String s) {
    int r = s.length() - 1;
    while (r >= 0 && s.charAt(r) == ' ') {
      r--;
    }

    int counter = 0;
    while (r >= 0 && s.charAt(r) != ' ') {
      counter++;
      r--;
    }

    return counter;
  }

  public static void main(String[] args) {
    LengthLastWord_58 obj = new LengthLastWord_58();
    System.out.println(obj.lengthOfLastWord(" fly me to the moon "));
    System.out.println(obj.lengthOfLastWord("luffy is still joyboy"));
  }
}
