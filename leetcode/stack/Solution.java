package stack;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            System.out.println("Read: " + ch + "    | Stack before: " + stack);

            // 1) opener → push
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                System.out.println("  → Pushed opener '" + ch + "'. Stack now: " + stack +"\n");

                // 2) closer → peek, pop, then check match
            } else {
                if (stack.empty()) {
                    System.out.println("  → Stack empty on closer '" + ch + "'. → false \n");
                    return false;
                }

                // look at the top
                char top = stack.peek();
                System.out.println("  → Top of stack: '" + top + "'");

                // for each possible opener, pop then compare to ch
                if (top == '(') {
                    stack.pop();
                    System.out.println("    • Popped '('. Stack now: " + stack +"\n");
                    if (ch != ')') {
                        System.out.println("    • Expected ')', saw '" + ch + "'. → false \n");
                        return false;
                    }
                } else if (top == '{') {
                    stack.pop();
                    System.out.println("    • Popped '{'. Stack now: " + stack +"\n");
                    if (ch != '}') {
                        System.out.println("    • Expected '}', saw '" + ch + "'. → false \n");
                        return false;
                    }
                } else if (top == '[') {
                    stack.pop();
                    System.out.println("    • Popped '['. Stack now: " + stack +"\n");
                    if (ch != ']') {
                        System.out.println("    • Expected ']', saw '" + ch + "'. → false \n");
                        return false;
                    }
                } else {
                    System.out.println("    • Unexpected '" + top + "' on stack. → false \n");
                    return false;
                }

                System.out.println("  → Matched closer '" + ch + "'. Stack now: " + stack +"\n");
            }
        }

        System.out.println("End of input. Final stack: " + stack);
        boolean valid = stack.isEmpty();
        System.out.println("Returning " + valid);
        return valid;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] tests = {
                "()",
                "()[]{}",
                "(]",
                "([)]",
                "{[]}"
        };
        for (String t : tests) {
            System.out.println("\n=== Test: \"" + t + "\" ===");
            sol.isValid(t);
        }
    }
}
