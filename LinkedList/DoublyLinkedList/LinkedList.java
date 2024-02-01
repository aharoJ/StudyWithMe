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

    public void insertAtEnd(int value)
    {
        ListNode node = new ListNode(value);
        if (head==null){
            head=node;
        } else{
            tail.next= node;
        }
        node.previous= tail;
        tail= node;
        length++;
    }

    public void displayForward()
    {
        if (head==null){
            return;
        }

        ListNode current= head;
        while (current!=null) 
        {
            System.out.print(current.data + "-->");
            current=current.next;
        }
        System.out.print("NULL");
    }

    public void displayBackwards()
    {
        if (tail==null){
            return;
        }
        ListNode current= tail;
        while (current!=null) 
        {
            System.out.print(current.data + "-->");
            current=current.previous;
        }
    }

    public static void main(String[] args) {
        LinkedList list= new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        // list.displayForward();
        list.displayBackwards();
    }

    
}
