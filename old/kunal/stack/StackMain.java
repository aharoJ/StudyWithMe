/**
 * StackMain
 */
public class StackMain {
  public static void main(String[] args) throws StackException {
    CustomStack stack = new CustomStack(5);
    stack.push(2);
    stack.push(8);
    stack.push(13);
    stack.push(24);
    stack.push(7);
    stack.push(733);
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());

    System.out.println("-----------------------------------");
    System.out.println("-----------------------------------");

    DynamicStack dStack = new DynamicStack(5);
    dStack.push(2);
    dStack.push(8);
    dStack.push(13);
    dStack.push(24);
    dStack.push(7);
    dStack.push(733);
    System.out.println(dStack.pop());
    System.out.println(dStack.pop());
    System.out.println(dStack.pop());
    System.out.println(dStack.pop());
    System.out.println(dStack.pop());
  }
}
