package Dinesh.Array;

public class MoveAllZerosToTheRight 
{
    public static void main(String[] args) {
        MoveAllZerosToTheRight z =new MoveAllZerosToTheRight();
        int array[] = {0,1,0,4,1,0,12};
        System.out.println(z.returnNewArray(array));
        z.printArray(z.returnNewArray(array));

    }

    public int[] returnNewArray(int array[])
    {
        // int current=array[0];
        // int next=array[0];
        // for (int i=1; i< array.length; ++i)
        // {
        //     if (current<0){
        //         return new int[-1];
        //     }     
        //     int dummy= 
        //     if (current > 0 ){
        //         current++;
        //     }
        //     else if (current == 0) {
        //         current= 
        //     }
        // } return array;
    
    
        int j = 0; // Pointer for the position to swap non-zero elements
        // Iterate through the array
        for (int i = 0; i < array.length; ++i) {
            // If the current element is not zero, bring it to the 'jth' position
            if (array[i] != 0) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                j++; // Increment 'j' to the next position for swapping
            }
        }
        return array;
    
    }



 
    public void printArray(int printArray[])
    {
        for (int i=0; i< printArray.length; ++i)
        {
            System.out.print("[" + printArray[i] + "]");
        }
    }   

}