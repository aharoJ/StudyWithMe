package Dinesh.SingleLinkedList;

public class SinglyLinkedList 
{
    ListNode head; // head --> NULL

    public void display(){
        ListNode current = head;
        while (current !=null){
            System.out.print(current.data + "-->");
            current= current.next;
        }
        System.out.print("NULL\n");
    }


    public int length(){
        ListNode current= head;
        if (current == null){
            return 0;
        }

        int counter=0;
        while ( current != null)
        {
            counter++;
            current = current.next;
        }
        return counter;
    }

    public void insert_at_start(int value)
    {
        ListNode start_node= new ListNode(value);
        if (head==null)
        {
            head= start_node;
        }
        start_node.next= head;
        head= start_node;

        
    }

    public void insert_at_end(int value)
    {
        ListNode end_node = new ListNode(value);
        if (head==null){
            head= end_node;
        }

        ListNode current = head; // traversal pattern 
        while (current.next!=null)
        {
            current = current.next; //until we have our base case
        }
        current.next = end_node;
    }

    
    public static void main(String[] args) 
    {
        SinglyLinkedList list = new SinglyLinkedList();
        ListNode first_node = new ListNode(23);
        ListNode second_node= new ListNode(7);
        ListNode third_node= new ListNode(69);
        ListNode fourth_node= new ListNode(42);

        list.head= first_node;            // -->#
        first_node.next = second_node;    // -->#-->#
        second_node.next = third_node;   // -->#-->#-->#-->NULL   
        third_node.next= fourth_node;   // -->#-->#-->#-->#-->NULL   

        list.insert_at_start(1);
        list.insert_at_start(33);
        list.insert_at_end(999);

        list.display();

        System.out.println("Length:"+list.length());
    }
    
}
