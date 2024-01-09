package LinkedList.SingleLinkedList;

public class AddTwoNumbers 
{
    public static ListNode addTwoNumbers(ListNode list_A, ListNode list_B)
    {
        ListNode dummy= new ListNode(0);
        ListNode tail= dummy;

        int carry=0;
        while(list_A!=null || list_B!=null)
        {
            int first_list= (list_A !=null) ? list_A.data : 0;
            int second_list= (list_B !=null) ? list_B.data : 0;
            int sum= carry + first_list + second_list;
            carry= sum / 10;
            tail.next= new ListNode(sum % 10);
            tail= tail.next;
            if (list_A!=null){ 
                list_A= list_A.next;
            }
            if (list_B!=null){
                list_B= list_B.next;
            }
        }
        if (carry>0){
            tail.next=new ListNode(carry);
        }
        return dummy.next;

    }
    

    


    public static void main(String[] args) {
        LinkedList list_A = new LinkedList();
        list_A.insertAtEnd(1);
        list_A.insertAtEnd(3);
        list_A.insertAtEnd(5);
        
        LinkedList list_B = new LinkedList();
        list_B.insertAtEnd(2);
        list_B.insertAtEnd(6);
    
        ListNode temp = AddTwoNumbers.addTwoNumbers(list_A.head, list_B.head);
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
}
