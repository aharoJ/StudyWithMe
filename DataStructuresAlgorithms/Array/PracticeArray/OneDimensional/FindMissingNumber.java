package Array.PracticeArray.OneDimensional;

public class FindMissingNumber 
{
    public static void main(String[] args) {
        FindMissingNumber z = new FindMissingNumber();

        int array[]={ 1, 2, 3, 5};  
        System.out.println(z.newArray(array));
    }

    // Expected {1, 2, 3, _}
    // Actual   {1, 2, 3}
    public int newArray(int array[])
    {
        int length= array.length +1;                 
        int formula= length * (length + 1) / 2;  // Expected              
        for (int i=0; i< array.length; ++i)
        {
            int sum=0;
            sum = sum + array[i];               // Actual
            formula= formula - sum;
        }
        return formula;
    }

    public void printArray(int printArray[])
    {
        for (int i=0; i< printArray.length; ++i)
        {
            System.out.print("[" + printArray[i] + "]");
        }
    }

}
