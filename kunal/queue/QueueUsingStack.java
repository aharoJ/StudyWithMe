package queue;

import java.util.Stack;

/**
 * QueueUsingStack
 */
public class QueueUsingStack {
  private Stack<Integer> first;
  private Stack<Integer> second;

  public QueueUsingStack() {
    this.first = new Stack<>();
    this.second = new Stack<>();
  }

  public void add(int item) {
    first.push(item);
  }

  public int remove() {
    while (!first.isEmpty()) {
      second.push(first.pop());
    }
    int removedItemFromSecondStack = second.pop();

    while (!second.isEmpty()) {
      first.push(second.pop());
    }
    return removedItemFromSecondStack;
  }

  public boolean isEmpty() {
    return first.isEmpty();
  }

  public int peek() {
    while (!first.isEmpty()) {
      second.push(first.pop());
    }
    int peekItemFromSecondStack = second.peek();

    while (!second.isEmpty()) {
      first.push(second.pop());
    }
    return peekItemFromSecondStack;
  }

}
