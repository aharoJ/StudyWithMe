public class Driver_LL 
{
    public static void main(String[] args) 
    {
        SingleLL<Integer> linkedList = new SingleLL<>();
        System.out.println(linkedList);

        linkedList.add(0,3);
        linkedList.add(0,10);
        linkedList.add(0,15);
        System.out.println(linkedList);

        linkedList.add(1, 99);
        linkedList.add(2, 55);
        System.out.println(linkedList);

        linkedList.remove(0);
        System.out.println(linkedList);


        System.out.println(linkedList.get(3));
        linkedList.set(1,88); 
        System.out.println(linkedList);

        
    }
    
}
