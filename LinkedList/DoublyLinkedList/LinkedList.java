package LinkedList.DoublyLinkedList;

public class LinkedList 
{
    public ListNode head;
    public ListNode tail;
    public int length;

    public LinkedList(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public int length(){
        return length;
    }


    
}
