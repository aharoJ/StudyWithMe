

public class MedianOfTwoSortedArrays_4 
{
    public static void main(String[] args) {
        MedianOfTwoSortedArrays_4 z = new MedianOfTwoSortedArrays_4();

        int[] nums1 = {1, 9};
        int[] nums2 = {3,7,2};

        //double median = z.findMedianSortedArrays(nums1, nums2);
        //System.out.println("The median is: " + median);
        //z.combineArray(nums1, nums2);
        z.findMedian(0, nums1, nums2);
    }

    public int[] combineArray(int nums1[], int nums2[])
    {
        int resize[]= new int [nums1.length+nums2.length];
        int index=0;
        for (int i=0; i< nums1.length; ++i)
        {
            resize[index]= nums1[i];
            index++;
        }

        for (int i=0; i< nums2.length; ++i)
        {
            resize[index]= nums2[i];
            index++;
        }

        printArray(resize);
        return new int[-1];
    }

    public int findMedian(int median, int nums1[], int nums2[])
    {
        int array[]= combineArray(nums1, nums2);
        int temp=array[0];
        for (int i=1; i< array.length; ++i)
        {
            array[i]= temp;
            if (array[i] < temp)
                temp= array[i];

            System.out.println(array[i]);
            
        }
        
        //System.out.println(combineArray(nums1, nums2));
        return -1;

    }

    /*
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int resize[]= new int [nums1.length + nums2.length];

        for(int i=1; i < resize.length; ++i )
        {
            if (resize[i] < order)
                order= resize[i];
                resize[i]= order;
        }
        printArray(resize);
        return 0.0;
    }
    */

    public void printArray(int printArray[])
    {
        for (int i=0; i < printArray.length; ++i)
        {
            System.out.print("[" + printArray[i] + "]");
        }
        System.out.println();
    }

}