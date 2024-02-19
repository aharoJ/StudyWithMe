
import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 { // [2,2,1,1,1,2,2]
    public int majorityElement(int[] nums) {
        // Key: nums[i] Val: freq.
        // Key: 1 Val: 3
        // Key: 2 Val: 4
        // Output: 2
        HashMap<Integer,Integer> map= new HashMap<>();
        int counter=0;
        for (int i=0; i< nums.length;++i)
        {
            int freq= map.getOrDefault(nums[i], 0);
            map.put(nums[i], freq+ 1);
            // how to check which key has the most freq ?
            // then return the key with the most val:freq. ?
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            if(entry.getValue() > counter){
                counter= entry.getKey();
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        MajorityElement_169 solution = new MajorityElement_169();
        
        // Test case: the majority element should be 2
        int[] nums = {3,2,3};
        int result = solution.majorityElement(nums);
        System.out.println("The majority element is: " + result);  // Expected output: "The majority element is: 2"
    }
}