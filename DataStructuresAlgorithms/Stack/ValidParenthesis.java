package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis 
{
    
    public boolean isValid(String string) {
        Stack<Character> stack= new Stack<>();
        for (char val : string.toCharArray()) {
            if (val == '(')
                stack.push(')');
            else if (val == '{')
                stack.push('}');
            else if (val == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != val)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
    ValidParenthesis sol= new ValidParenthesis();

    System.out.println(sol.isValid("()"));
    System.out.println(sol.isValid("()[]{}"));
    System.out.println(sol.isValid("(]"));
    // Add more test cases if needed
    }
    
}



