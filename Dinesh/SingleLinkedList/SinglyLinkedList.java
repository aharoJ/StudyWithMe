package Dinesh.SingleLinkedList;

public class SinglyLinkedList 
{
    public ListNode head;


    public static void main(String[] args) {
        SinglyLinkedList list= new SinglyLinkedList();
        list.head = new ListNode(9);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(22);

        // now we connct them together to form a chain
        list.head.next= second; // 9 --> 2
        second.next= third; // 9 --> 2 --> 5
        third.next= fourth; // 9 --> 2 --> 5 --> 22 --> null


        list.head.printListNode();
        System.out.println();
        System.out.println(list.head.lengthListNode());

    }
}
