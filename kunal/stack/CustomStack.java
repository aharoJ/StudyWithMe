/**
 * CustomStack
 */
public class CustomStack {
  protected int[] data;
  private static final int DEFAULT_SIZE = 10;
  protected int pointer = -1;

  public CustomStack() {
    // this(DEFAULT_SIZE);
    this.data = new int[DEFAULT_SIZE];
  }

  public CustomStack(int size) {
    this.data = new int[size]; // Initialize with the custom size
  }

  public boolean push(int item) {
    if (isFull()) {
      System.out.println("Stack is full!");
      return false;
    }
    pointer++;
    data[pointer] = item;
    return true;
  }

  public int pop() throws StackException {
    if (isEmpty()) {
      throw new StackException("Cannot pop from an empty stack!");
    }
    int item = data[pointer];
    pointer--;
    return item;
    // return data[pointer--]; // concise way to retrive
  }

  public int peek() throws StackException {
    if (isEmpty()) {
      throw new StackException("Cannot peek from an empty stack!");
    }
    int item = data[pointer];
    return item;
  }

  public boolean isFull() {
    if (pointer == data.length - 1) {
      return true;
    }
    return false;
  }

  public boolean isEmpty() {
    if (pointer == -1) {
      return true;
    }
    return false;
  }
}
