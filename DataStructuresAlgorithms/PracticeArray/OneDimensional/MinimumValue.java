package PracticeArray.OneDimensional;

public class MinimumValue 
{
    public static void main(String[] args) {
        MinimumValue z= new MinimumValue();
        int array[] = {7,5,9,6,2,4,4,1,2};

        z.printArray(array);
        System.out.println();
        System.out.println(z.findLowestValue(array));


    }
    
    // {7,5,9,6,2,4,4,1};
    // public int findLowestValue(int find[])
    // {
    //     int current=find[0]; // tracks the current LOWEST seen. 
    //     for (int i=1; i<find.length; ++i)
    //     {
    //         if ( find[i] < current)
    //             current = find[i];
    //     }
    //     return current;
    // }
    
    public int findLowestValue(int find[])
    {
        int currentValue= find[0];
        for (int i=1; i<find.length; ++i)
        {
            if (find[i] < currentValue){
                currentValue = find[i];
            }
        }
        return currentValue;
    }


    public void printArray(int printArray[])
    {
        for (int i=0; i< printArray.length; ++i)
        {
            System.out.print("[" + printArray[i] + "]");
        }
    }
}
