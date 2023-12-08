package Dinesh.SingleLinkedList;

public class ListNode 
{
    public int data; // Generic Type in GENERAL 
    public ListNode next;
    
    public ListNode(){}
    public ListNode(int data){
        this.data= data;
        this.next= null;
    }

    public void printListNode()
    {
        ListNode current= this;
        while ( current != null)
        {
            System.out.print(current.data + "--> ");
            current= current.next;    
        }
        System.out.print("Null");
    }

    public int lengthListNode()
    {
        ListNode current= this;
        int count=0;
        while (current != null)
        {
            current= current.next;
            count++;
        } 
        return count;
    }

    public void insertAtStart(int value){
        ListNode newNode= new ListNode(value);
        newNode.next= current;
        current = current.next;


    }

}