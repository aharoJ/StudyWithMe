package Array.PracticeArray.OneDimensional;

public class PrintOddArray {
    
    public static void main(String[] args) 
    {
        PrintOddArray processor = new PrintOddArray();
        int[] inputArray = {3, 2, 4, 7, 10, 6, 5};
        int[] outputArray = processor.removeEvenIntegers(inputArray);
        processor.printArray(outputArray);
    }
    
    public int[] removeEvenIntegers(int[] array)
    {
        int trackOdd=0;
        for (int i=0; i<array.length; i++)
        {
            if (array[i] % 2 != 0) {
             trackOdd++;   
            }

        } 
        int newArray[]= new int[trackOdd];   // Create a new array to hold the odd numbers

        
        int currentIndex= 0;
        for (int i=0; i < array.length; ++i)
        {
            if (array[i] % 2 != 0) 
            {
                newArray[currentIndex] = array[i];
                currentIndex++;
            }
        } return newArray;
    }

    
    public void printArray(int[] array)
    {
        for (int i=0; i < array.length; ++i)
        {
            System.out.print("[" + array[i] + "]");
        }
        System.out.println();
    }

}