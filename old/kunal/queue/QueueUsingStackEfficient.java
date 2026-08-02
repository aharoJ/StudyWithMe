package queue;

import java.util.Stack;

/**
 * QueueUsingStackEfficient
 */
public class QueueUsingStackEfficient {
  private Stack<Integer> first;
  private Stack<Integer> second;

  public QueueUsingStackEfficient() {
    this.first = new Stack<>();
    this.second = new Stack<>();
  }

  public void add(int item) {
    while (!first.isEmpty()) {
      second.push(first.pop());
    }
    first.push(item);

    while (!second.isEmpty()) {
      first.push(second.pop());
    }

    first.push(item);
  }

  public int remove() {
    return first.pop();
  }

  public boolean isEmpty() {
    return first.isEmpty();
  }

  public int peek() {
    return first.peek();
  }

}
