package linkedlist;

public class Main {
  public static void main(String[] args) {
    LL list = new LL();
    list.insertFirst(10);
    list.insertFirst(20);
    list.insertLast(22);
    list.insert(69, 3);
    list.display();
    list.insertRecursively(9, 2);
    list.display();
    // ------------------------------------------
    // ------------------------------------------
    // DLL list = new DLL();
    // list.insertFirst(3);
    // list.insertFirst(2);
    // list.insertFirst(8);
    // list.insertFirst(17);
    // list.insertLast(99);
    // list.insert(69, 2);
    // list.insertAfter(69, 33);
    // list.display();
    // ------------------------------------------
    // ------------------------------------------
    // CLL list = new CLL();
    // list.inset(23);
    // list.inset(3);
    // list.inset(19);
    // list.inset(75);
    // list.delete(19);
    // list.display();

  }
}
