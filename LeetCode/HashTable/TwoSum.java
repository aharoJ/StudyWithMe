package HashTable;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] TwoSum(int[] nums, int target){
        Map<Integer,Integer> map= new HashMap<>();
        for (int i=0; i<nums.length; ++i)
        {
            int summation= target-nums[i];
            if (!map.containsKey(summation)){
                map.put(nums[i], i);
            } else{
                return new int[]{map.get(summation), i};
            }
        }
        return null;
    }

    public void display(int[] array){
        for (int i=0; i<array.length; ++i){
            System.out.print("[" + array[i] + "]");
        }
    }
    
    public static void main(String[] args) {
        TwoSum solution= new TwoSum();
        int[] array= {1,2,3,4,5};
        int[] result = solution.TwoSum(array, 6); 
        if (result != null) { 
            solution.display(result); 
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }
    
}
