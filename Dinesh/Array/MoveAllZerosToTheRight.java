package Dinesh.Array;

public class MoveAllZerosToTheRight 
{
    public static void main(String[] args) {
        MoveAllZerosToTheRight z =new MoveAllZerosToTheRight();
        int array[] = {0,1,0,2,0,3};
        //             0,1,2,3,4,5,6,7,8
        // System.out.println(z.newArray(array));
        // z.printArray(z.newArray(array));
        //z.printArray(z.shiftZerosToRight(array));
        z.printArray(z.shiftZeros(array));
    }

    // public int[] newArray(int array[])
    // {
    //     int trackedZeros=0;
    //     for (int i=0; i < array.length; ++i)
    //     {
    //         if ( array[trackedZeros] != 0 ){
    //             trackedZeros++;
    //         } else {
    //             int temp=array[i]; 
    //             array[i]= array[trackedZeros];
    //             array[trackedZeros]= temp;
    //         } 
    //     }
    //     return array;
    // }


    // int array[] = {0,1,0,2,0,3};
    public int[] shiftZerosToRight(int array[])
    {
        int nonZeroIndex=0;
        for (int currentIndex=0; currentIndex < array.length; ++currentIndex)
        {
            if (array[currentIndex] != 0) {
                int temp= array[nonZeroIndex];
                array[nonZeroIndex]= array[currentIndex];
                array[currentIndex]= temp;
                
                nonZeroIndex++;
            }
        }
        return array;
    }



    public int[] shiftZeros(int[] array) {
        int zeroIndex = 0;
        for (int nonZeroIndex = 0; zeroIndex < array.length; zeroIndex++) {
            // If the zeroIndex is indeed 0, we are okay
            if (array[nonZeroIndex] == 0) {
                continue;
            }
            swap(array, nonZeroIndex, zeroIndex);
            zeroIndex++;
        }
        return array;
    }


    private void swap(int[] array, int nonZeroIndex, int zeroIndex) 
    {
        int temp = array[nonZeroIndex];
        array[nonZeroIndex] = array[zeroIndex];
        array[zeroIndex] = temp;
    }

    public void printArray(int printArray[])
    {
        for (int i=0; i< printArray.length; ++i)
        {
            System.out.print("[" + printArray[i] + "]");
        }
    }   

}