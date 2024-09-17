package queue;

public class QueueMain {
  public static void main(String[] args) throws Exception {
    // CustomQueue queue = new CustomQueue(5);
    // queue.insert(1);
    // queue.insert(2);
    // queue.insert(4);
    // queue.insert(8);
    // queue.display();
    // queue.remove();
    // queue.display();
    // -----------------------------------------
    // -----------------------------------------
    CircularQueue queue = new CircularQueue(5);
    queue.insert(1);
    queue.insert(2);
    queue.insert(4);
    queue.insert(8);
    queue.display();
    queue.remove();
    queue.display();
    queue.insert(69);
    queue.display();

  }
}
