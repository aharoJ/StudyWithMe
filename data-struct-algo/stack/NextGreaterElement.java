package Stack;

import java.util.Stack;

public class NextGreaterElement 
{
    public int[] nextGreaterElement(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        
        // Initialize the result array with -1's for each element.
        for (int i = 0; i < nums.length; i++) {
            result[i] = -1;
        }
        
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int index = stack.pop();
                result[index] = nums[i];
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        NextGreaterElement sol= new NextGreaterElement();
        int[] array={4,7,3,4,8,1};
        // correct output: 7,8,4,8,-1,-1
        int[] output = sol.nextGreaterElement(array);
        
        // Print the output array
        for (int j : output) {
            System.out.print(j + " ");
        }

    }
    
}
