package linkedlist;

public class Main {
  public static void main(String[] args) {
    LL list = new LL();

    // Insert some elements and display the list
    list.insertFirst(10);
    list.insertFirst(20);
    list.insertFirst(30);
    list.insertLast(9);
    list.insert(69, 3);

    list.display(); // Output: 30 -> 20 -> 10 -> NULL
  }
}
