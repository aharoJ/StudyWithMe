package Array.OneDimensional;

public class MoveAllZerosToTheRight 
{
    public static void main(String[] args) 
    {
        MoveAllZerosToTheRight solution =new MoveAllZerosToTheRight();
        int array[] = {0,1,0,2,0,3};
        //             0,1,2,3,4,5,6,7,8
        // System.out.println(solution.newArray(array));
        // solution.printArray(solution.newArray(array));
        //solution.printArray(solution.shiftZerosToRight(array));
        // solution.printArray(solution.shiftZeros(array));
        // solution.zeroToTheBack(array);
        solution.zeroToTheFront(array);
        solution.printArray(array);
    }

    public int[] zeroToTheBack(int[] array)
    {
        int nonZero=0;
        for (int i=0; i< array.length; ++i)
        {
            if (array[i] !=0){
                array[nonZero]= array[i];
                nonZero++;
            }
        }
        for (int i= nonZero; i < array.length; ++i) {
            array[i]=0;
        }
        return array;
    }

    // public int[] zeroToTheFront(int[] array)
    // {
    //     int nonZero=array.length-1;
    //     for (int i= array.length-1; i>=0; --i)
    //     {
    //         if (array[i] !=0){
    //             array[nonZero]= array[i];
    //             nonZero--;
    //         }
    //     }
    //     for (int i=nonZero; i>=0; --i){
    //         array[i]= 0;
    //     }
    //     return array;
    // }

    public int[] zeroToTheFront(int[] array)
    {
        int nonZero= array.length-1;
        for (int i= array.length-1; i>= 0; --i){
            if (array[i] !=0){
                array[nonZero]= array[i];
                nonZero--;
            }
        }
        for (int i=nonZero; i>= 0; --i){
            array[i]= 0;
        }
        return array;

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



