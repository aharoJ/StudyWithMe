

import java.util.Map;

public class RunningSumOf1DArray_1480 {
    public static void main(String[] args) {
        // Replace the array below with your input data
        int[] nums = {1, 2, 2, 1};

        // Call your runningSum method here and store the result in an array
        int[] result = runningSum(nums);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    // public static int[] runningSum(int[] nums) {
    //     // Calculate the running sum and return the result as an array
    //     int list[]= new int[nums.length];
    //     int add=0;
    //     for(int i=0; i< nums.length; ++i)
    //     {
    //         add = add + nums[i];
    //         list[i]= add;
    //     } return list;
    // }




        
    // public static int[] runningSum(int[] nums) {
    //     // Calculate the running sum and return the result as an array
    //     int list[]= new int[nums.length];
    //     int add=0;
    //     for (int i=0; i < nums.length; ++i)
    //     {
    //         add= add + nums[i];
    //         list[i] = add;
            
    //     } return list;
    // }

    public static int[] runningSum(int[] nums) {
        // Calculate the running sum and return the result as an array
        int add=0;
        for (int i=0; i < nums.length; ++i)
        {
            add= add + nums[i];
            nums[i]= add;
            
        } return nums;
    }
}
