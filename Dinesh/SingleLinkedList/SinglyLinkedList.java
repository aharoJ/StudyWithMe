package Dinesh.SingleLinkedList;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtStart(22);
        list.insertAtStart(5);
        list.insertAtStart(2);
        list.insertAtStart(9);

        list.printList();
        System.out.println("Length: " + list.printLength());

        list.insertAtStart(23);
        list.printList();
    }

    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int printLength() {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // public void insertAtStart(int value) {
    //     ListNode newNode = new ListNode(value);
    //     newNode.next = head;
    //     head = newNode;
    // }
    
    public void insertAtStart(int value) 
    {

    }
}
