package Array.OneDimensional;

public class ResizeArray 
{
    public static void main(String[] args) {
        ResizeArray z = new ResizeArray();
        int array[]={ 1, 2, 3, 4};
        z.printArray(z.newArray(array));
    }

    public int[] newArray(int array[]){
        int resize[]= new int[array.length * 2];
        for (int i=0; i< array.length; ++i){
            //int dummy= array[i];
            resize[i]= array[i];
            //array[i]= dummy;
        }

        return resize;
    }

    public void printArray(int printArray[])
    {
        for (int i=0; i < printArray.length; ++i)
        {
            System.out.print("[" + printArray[i] + "]");
        }
        System.out.println();
    }
     
}
