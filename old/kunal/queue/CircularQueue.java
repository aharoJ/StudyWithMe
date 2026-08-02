package queue;

/**
 * CircularQueue
 */
public class CircularQueue {
  protected int[] data;
  static private int DEFAULT_SIZE = 10;
  protected int end = 0;
  protected int front = 0;
  private int size = 0;

  public CircularQueue() {
    this.data = new int[DEFAULT_SIZE];
  }

  public CircularQueue(int size) {
    this.data = new int[size];
  }

  public boolean isFull() {
    if (size == data.length) {
      return true;
    }
    return false;
  }

  public boolean isEmpty() {
    if (size == 0) {
      return true;
    }
    return false;
  }

  public boolean insert(int item) {
    if (isFull()) {
      return false;
    }

    data[end++] = item;
    end = end % data.length;
    size++;
    return true;
  }

  public int remove() throws Exception {
    if (isEmpty()) {
      throw new Exception("Queue is empty!!!");
    }
    int removedItem = data[front++];
    front = front % data.length;
    size--;
    return removedItem;
  }

  public void display() throws Exception {
    if (isEmpty()) {
      throw new Exception("Queue is empty!!!");
    }
    int i = front;
    do {
      System.out.print(data[i] + " -> ");
      i++;
      i = i % data.length;
    } while (i != end);
    System.out.println("\n");
  }

  public int front(int item) throws Exception {
    if (isEmpty()) {
      throw new Exception("Queue is empty!!!");
    }
    return data[front];
  }
}
