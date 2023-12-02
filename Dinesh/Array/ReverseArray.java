package Dinesh.Array;

public class ReverseArray {
    public static void main(String[] args) 
    {
        ReverseArray z = new ReverseArray();
        int array[] = {1,2,3,4,5,6,7,8,9};

        z.printArray(z.reverse(array) );
    }

    public void printArray(int printArray[])
    {
        for (int i=0; i < printArray.length; ++i)
        {
            System.out.print("[" + printArray[i] + "]");
        }
        System.out.println();
    }
    


    //int array[] = {1,2,3,4,5,6,7,8,9};
    public int[] reverse(int reverseArray[])
    {

        int zero = 0; // Track the first zero
        for (int nonZero = 0; nonZero < reverseArray.length; nonZero++) {
            if (reverseArray[nonZero] != 0) {
                // Swap the zero with the non-zero element
                int temp = reverseArray[zero];
                reverseArray[zero] = reverseArray[nonZero];
                reverseArray[nonZero] = temp;
                zero++;
            }
        }
        return reverseArray;

    }


    // public int[] reverse(int reverseArray[])
    // {
    //     int left=0;
    //     int right= reverseArray.length -1;
    //     while (left < right)
    //     {
    //         int temp= reverseArray[left];
    //         reverseArray[left]= reverseArray[right];
    //         reverseArray[right]= temp;
    //         left++;
    //         right--;
    //     } return reverseArray;
    // }




}
