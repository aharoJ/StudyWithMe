package HashTable;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumberOccurrences_1207 {

    public static void main(String[] args) {
        // Test the function with an example input
        int[] arr = {1, 2, 2, 1, 1, 3};
        UniqueNumberOccurrences_1207 solution = new UniqueNumberOccurrences_1207();
        boolean result = solution.uniqueOccurrences(arr);
        System.out.println("Does each number have a unique number of occurrences? " + result);
    }

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int freq = map.getOrDefault(arr[i], 0) + 1;
            map.put(arr[i], freq);
        }

        // Print the frequency of each key
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        HashSet<Integer> set = new HashSet<>();
        for (int val : map.values()) {
            if (!set.add(val)) {
                return false;
            }
        }
        return true;
    }
}
