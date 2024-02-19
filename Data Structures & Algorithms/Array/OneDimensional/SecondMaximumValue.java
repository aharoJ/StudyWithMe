package Array.OneDimensional;

public class SecondMaximumValue 
{
    public static void main(String[] args) {
        SecondMaximumValue z = new SecondMaximumValue();
        int array[] = {22,11,33,15,28,31};
        System.out.println(z.find(array));
    }

    public int find(int array[])
    {
        int highestFound= array[0];
        int secondHighest= array[0];
        for (int i=0; i< array.length; ++i)
        {
            if (array[i] > highestFound)
                highestFound= array[i];
            else if (array[i] > secondHighest && secondHighest != highestFound)
                secondHighest = array[i];
        }
        return secondHighest;
    }

    public void printArray(int printArray[])
    {
        for (int i=0; i< printArray.length; ++i)
        {
            System.out.print("[" + printArray[i] + "]");
        }
    }
    
}
