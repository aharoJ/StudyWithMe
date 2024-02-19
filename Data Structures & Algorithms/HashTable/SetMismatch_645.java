package HashTable;

import java.util.HashMap;
import java.util.Map;

public class SetMismatch_645 {
    public int[] findErrorNums(int[] nums) {
        Map < Integer, Integer > map = new HashMap<>();
        for (int i=0; i<nums.length; ++i) {
            int freq= map.getOrDefault(nums[i], 0);
            map.put(nums[i], freq+ 1);
        }

        int dup = -1, missing = -1;
        for (int i = 1; i <= nums.length; i++) 
        {
            if (!map.containsKey(i)) {
                missing = i; // i is missing
            } else if (map.get(i) == 2) {
                dup = i; // i is duplicated
            }
        }
        return new int[]{dup, missing};
    }
}