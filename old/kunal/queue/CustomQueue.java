package queue;

/**
 * CustomQueue
 */
public class CustomQueue {
  private int[] data;
  static private int DEFAULT_SIZE = 10;
  int end = 0;

  public CustomQueue() {
    this.data = new int[DEFAULT_SIZE];
  }

  public CustomQueue(int size) {
    this.data = new int[size];
  }

  public boolean insert(int item) {
    if (isFull()) {
      return false;
    }

    data[end] = item;
    end++;
    return true;
  }

  public int remove() throws Exception {
    if (isEmpty()) {
      throw new Exception("Queue is empty!!!");
    }
    int removedItem = data[0];
    for (int i = 0; i < end - 1; ++i) {
      data[i] = data[i + 1];
      // data[i - 1] = data[i];
    }
    end--;
    return removedItem;
  }

  public int front(int item) throws Exception {
    if (isEmpty()) {
      throw new Exception("Queue is empty!!!");
    }

    return data[0];
  }

  public void display() {
    for (int i = 0; i < end; ++i) {
      System.out.print(data[i] + "  <- ");
    }
    System.out.println("\n");
  }

  public boolean isFull() {
    if (end == data.length) {
      return true;
    }
    return false;
  }

  public boolean isEmpty() {
    if (end == 0) {
      return true;
    }
    return false;
  }
}
