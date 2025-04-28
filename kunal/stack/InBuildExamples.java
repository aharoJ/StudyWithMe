import java.util.Stack;

/**
 * InBuildExamples
 */
public class InBuildExamples {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(2);
    stack.push(8);
    stack.push(13);
    stack.push(24);
    stack.push(7);
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
}
