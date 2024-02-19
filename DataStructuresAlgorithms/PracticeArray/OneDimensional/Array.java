package PracticeArray.OneDimensional;





public class Array 
{
    public static void main(String[] args) 
    {
        Array z = new Array();

        int array[] = new int[3];
        array[0]= 3;
        array[1]= 5;
        array[2]= 7;


        z.printArray(array);    // needed a helper method because we cant CONVERT String to Integers so we just printed via a printArray()
        System.out.println(array.length);
        System.out.println("\n" + array[array.length-1]);

    }
    
    public void printArray(int array[]){
        System.out.println();
        for (int i=0; i < array.length; ++i)
        {
            System.out.print("[" + array[i] + "]");
        }
        System.out.println("\n");
    }
}
