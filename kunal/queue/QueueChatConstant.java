package queue;

import java.util.Stack;

public class QueueChatConstant {
  private Stack<Integer> first;
  private Stack<Integer> second;

  public QueueChatConstant() {
    this.first = new Stack<>();
    this.second = new Stack<>();
  }

  // Push operation is now O(1)
  public void push(int item) {
    first.push(item);
  }

  // Remove operation will only transfer elements when needed
  public int remove() {
    if (second.isEmpty()) {
      while (!first.isEmpty()) {
        second.push(first.pop());
      }
    }
    return second.pop();
  }

  // Peek operation will only transfer elements when needed
  public int peek() {
    if (second.isEmpty()) {
      while (!first.isEmpty()) {
        second.push(first.pop());
      }
    }
    return second.peek();
  }

  public boolean isEmpty() {
    return first.isEmpty() && second.isEmpty();
  }
}
