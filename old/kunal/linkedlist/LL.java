package linkedlist;

public class LL {
  private Node head;
  private Node tail;
  private int size;

  public LL() {
    this.size = 0;
  }

  public void insertFirst(int val) {
    Node node = new Node(val);
    node.next = head;
    head = node;

    if (tail == null) {
      tail = head;
    }
    size++;
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.println("NULL");
  }

  public void insertLast(int val) {
    if (tail == null) {
      insertFirst(val);
      return;
    }
    Node node = new Node(val);
    tail.next = node;
    tail = node; // Set the tail to the newly added node
    size++;
  }

  public void insert(int val, int index) {
    if (index == 0) {
      insertFirst(val);
      return;
    }
    if (index == size) {
      insertLast(val);
      return;
    }

    Node temp = head;
    for (int i = 0; i < index - 1; ++i) {
      temp = temp.next; // Traverse to the node just before the insertion point
    }
    Node node = new Node(val, temp.next); // Insert new node
    temp.next = node; // Link the new node
    size++;
  }

  // recursively is good when you dont have to traverse the list to find the index
  public void insertRecursively(int val, int index) {
    head = helper(val, index, head); // Start the recursive call and handle head update
  }

  private Node helper(int val, int index, Node node) {
    if (index == 0) {
      Node temp = new Node(val, node);
      size++;
      return temp;
    }
    node.next = helper(val, index - 1, node.next);
    return node;
  }

  public int deleteFirst() {
    int val = head.value;
    head = head.next;
    if (head == null) {
      tail = null;
    }
    size--;
    return val;
  }

  public Node get(int index) {
    if (head == null) {
      return null;
    }
    Node node = head;
    for (int i = 0; i < index; ++i) {
      node = node.next;
    }
    return node;
  }

  public int deleteLast() {
    if (size <= 1) {
      return deleteFirst();
    }
    Node secondLast = get(size - 2);
    int val = tail.value; // Get the value of the tail before deletion
    tail = secondLast; // Update tail to second last
    tail.next = null; // Remove the last node by setting next to null
    size--;

    return val;
  }

  public int delete(int index) {
    if (index == 0) {
      return deleteFirst();
    }
    if (index == size - 1) {
      return deleteLast();
    }

    Node prev = get(index - 1); // Get the node before the one to be deleted
    int val = prev.next.value; // Get the value of the node to be deleted

    prev.next = prev.next.next; // Skip the node being deleted

    size--;
    return val;
  }

  public Node findVal(int val) {
    if (head == null) {
      return null;
    }
    Node node = head;
    while (node != null) {
      if (node.value == val) {
        return node;
      }
      node = node.next;
    }
    return null;
  }

  // ------------------------------------------------------------------------------------------------------
  // ------------------------------------------------------------------------------------------------------
  // ------------------------------------------------------------------------------------------------------
  // QUESTIONS:
  public void duplicates() {
    if (head == null) {
      return;
    }
    Node node = head;
    while (node.next != null) {
      if (node.value == node.next.value) {
        node.next = node.next.next;
        size--;
      } else {
        node = node.next;
      }
    }
    tail = node;
    tail.next = null;
  }

  public static LL merge(LL first, LL second) {
    Node f = first.head;
    Node s = second.head;
    LL ans = new LL();
    while (f != null && s != null) {
      if (f.value < s.value) {
        ans.insertLast(f.value);
        f = f.next;
      } else {
        ans.insertLast(s.value);
        s = s.next;
      }
    }

    while (f != null) {
      ans.insertLast(f.value);
      f = f.next;
    }

    while (s != null) {
      ans.insertLast(s.value);
      s = s.next;
    }
    return ans;
  }

  // check if the linked list has a cycle
  public boolean hasCycle(Node head) {
    if (head == null) {
      return false;
    }
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) {
        return true;
      }
    }
    return false;
  }

  // find length of cycle
  public int hasCycleLength(Node head) {
    if (head == null) {
      return 0;
    }
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) {
        // calculate the length of the cycle
        Node temp = slow;
        int counter = 0;
        do {
          temp = temp.next;
          counter++;
        } while (temp != slow);
        return counter;
      }
    }
    return 0;
  }

  // find index of the start of the cycle
  public Node hasCycleIndex(Node head) {
    if (head == null) {
      return head;
    }
    int lenght = 0;
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) {
        lenght = hasCycleLength(slow);
        break;
      }
    }
    // find the start of the cycle
    Node f = head;
    Node s = head;
    while (lenght > 0) {
      s = s.next;
      lenght--;
    }
    // keep moving the two pointers until they meet
    while (f != s) {
      s = s.next;
      f = f.next;
    }
    return s;
  }

  // https://leetcode.com/problems/happy-number
  public boolean isHappy(int n) {
    int slow = n;
    int fast = n;
    do {
      slow = findSquare(n);
      fast = findSquare(findSquare(n));
    } while (slow != fast);

    if (slow == 1) {
      return true;
    }
    return false;
  }

  private int findSquare(int number) {
    int sum = 0;
    while (number > 0) {
      int remainder = number % 10;
      sum += remainder * remainder; // Add the square of the last digit
      number = number / 10; // Remove the last digit
    }
    return sum;
  }

  // ------------------------------------------------------------------------------------------------------
  // Private Node class
  private class Node {
    private int value;
    private Node next;

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }

    public Node(int value) {
      this.value = value;
    }
  }
}
