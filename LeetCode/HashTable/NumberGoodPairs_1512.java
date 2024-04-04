package HashTable;

import java.util.HashMap;
import java.util.Map;

public class NumberGoodPairs_1512 {
    public int numIdenticalPairs(int[] nums) {
        // [1,2,3,1,1,3]
        // Key: nums[]  Val: freq.
        // Key: 1  Val: 3
        // Key: 2  Val: 1 // issue here? how do I code that since its 1 we skipp it 
        // Key: 3  Val: 2
        // return 4 good pairs (0,3), (0,4), (3,4), (2,5)

        Map<Integer,Integer> map= new HashMap<>();
        int counter=0; 
        for (int i=0; i<nums.length; ++i)
        {
            int freq= map.getOrDefault(nums[i], 0);
            map.put(nums[i], freq+1);
            counter+= freq; 
            ka
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
        return counter;
    }
    
    public static void main(String[] args) {
        NumberGoodPairs_1512 solution= new NumberGoodPairs_1512();
        int[] array={1,2,3,1,1,3};
        System.out.println(solution.numIdenticalPairs(array));

    }
}
