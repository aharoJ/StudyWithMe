package Queue;

public class Queue {
    public ListNode front;
    public ListNode rear;
    public int length;

    public Queue(){
        front= null;
        rear= null;
        length= 0;
    }
    
    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public void enqueue(int data){
        ListNode temp= new ListNode(data);
        if (isEmpty()){
            front= temp;
        } else {
            rear.next= temp;
        }
        rear= temp;
        length++;
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }
        ListNode current= front;
        while (current!=null){
            System.out.print(current.data + "-->");
            current= current.next;
        }
        System.out.print("NULL");
    }

    public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }

        int result= front.data;
        front= front.next;
        if (front==null){
            rear= null;
        }
        length--;
        return result;
    }

    public static void main(String[] args) {
        Queue queue= new Queue();
        queue.enqueue(3);
        queue.enqueue(9);
        queue.enqueue(15);
        queue.print();
        queue.dequeue();
        System.out.println();
        queue.print();
    }
}