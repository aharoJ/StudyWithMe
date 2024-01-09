package Dinesh.Array;

public class ReverseArray {
    public static void main(String[] args) 
    {
        ReverseArray z = new ReverseArray();
        int array[] = {1,2,3,4,5,6,7,8,9};

        z.printArray(z.reverse(array) );
        z.printArray(z.reverseArray(array));
    }

    public void printArray(int printArray[])
    {
        for (int i=0; i < printArray.length; ++i)
        {
            System.out.print("[" + printArray[i] + "]");
        }
        System.out.println();
    }
    




    public int[] reverse(int reverseArray[])
    {
        int left=0;
        int right= reverseArray.length -1;
        while (left < right)
        {
            int temp= reverseArray[left];
            reverseArray[left]= reverseArray[right];
            reverseArray[right]= temp;
            left++;
            right--;
        } return reverseArray;
    }


    public int[] reverseArray(int array[])
    {
        int left=0;
        int right= array.length-1;
        for (int i=0;i<array.length;++i)
        {
            int temp= array[left];
            array[left]= array[right];
            array[right]= temp;
            left++;
            right--;
        }
        return array;
    }

}
