package queue;

/**
 * DynamicQueue
 */
public class DynamicQueue extends CircularQueue {
  public DynamicQueue() {
    super(); // it will call DVC of CustomStack
  }

  public DynamicQueue(int size) {
    super(size); // it will call EVC of CustomStack
  }

  public boolean insert(int item) {
    if (this.isFull()) {
      // Double the array size
      int[] temp = new int[data.length * 2];

      // Copy all previous items in the new data array
      for (int i = 0; i < data.length; i++) {
        temp[i] = data[(front + i) % data.length];
      }

      front = 0;
      end = data.length;
      data = temp;
    }
    return super.insert(item);
  }

}
