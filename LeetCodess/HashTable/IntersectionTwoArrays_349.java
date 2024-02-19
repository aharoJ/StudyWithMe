package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionTwoArrays_349 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set<Integer> set= new HashSet<>();
        for (int val: nums1){
            set.add(val);
        }
        List<Integer> list= new ArrayList<>();
        for (int val: nums2){
            if (set.contains(val)){
                System.out.print("Val: " + val);
                set.remove(val);
                list.add(val);
            }
        }
        
        int array[]= new int[list.size()];
        for(int i=0; i< list.size(); ++i)
        {
            array[i]= list.get(i);
        }
        return array;
    }



    public static void main(String[] args) {
        // Example test case
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        
        IntersectionTwoArrays_349 solution = new IntersectionTwoArrays_349();
        int[] result = solution.intersection(nums1, nums2);
        
        // Print the result
        System.out.println(Arrays.toString(result));
    }
    
}
