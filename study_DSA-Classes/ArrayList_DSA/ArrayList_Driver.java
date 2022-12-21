public class ArrayList_Driver{
    public static void main(String[] args) 

    {
        ArrayList<Integer> list_DVC = new ArrayList<>();  // DVC 
        
        list_DVC.add(23);
        System.out.println(list_DVC);
        
        list_DVC.add(5);
        System.out.println(list_DVC);
        
        list_DVC.add(25);
        System.out.println(list_DVC);

        
        System.out.println(list_DVC);
        System.out.println("----------------------------------- \n\n");




        ArrayList<Integer> list_EVC = new ArrayList<>(1);
        list_EVC.add(6);
        list_EVC.add(12);
        System.out.println(list_EVC);
        System.out.println("-----------------------------------\n\n");



        ArrayList<Integer> list_idx = new ArrayList<>(10);

        list_idx.add(8);
        list_idx.add(12);
        list_idx.add(15);
        list_idx.add(19);

        System.out.println("Deleted ");
        list_idx.remove(0);
        System.out.println(list_idx);

        Integer value = list_idx.get(0);
        System.out.println("Index 0: " + value);
        System.out.println("-----------------------------------\n\n");

        list_idx.set(100, 0);
        System.out.println(list_idx);
        System.out.println("-----------------------------------\n\n");



        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");

        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(2);
        list.add(6);
        list.add(12);
        list.add(15);
        list.add(20);
        list.add(100);

        System.out.println("20 is index: " + list.indexOf(20));



    }
}