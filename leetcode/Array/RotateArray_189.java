package Array;



public class RotateArray_189 {
    public void rotate(int[] nums, int k) {
        int[] array= new int[nums.length];
        for (int i=0; i<nums.length; ++i){
            array[(i + k) % nums.length]= nums[i];
        }

        for (int i=0; i<nums.length; ++i){
            nums[i]= array[i];
        }
    }
    
    public void display(int[] array){
        for (int i=0; i<array.length; ++i){
            System.out.print("[" + array[i] + "]");
        }
    }
    public static void main(String[] args) {
        RotateArray_189 solution= new RotateArray_189();
        int[] array={1,2,3,4,5,6,7}; // k = 3
        solution.rotate(array, 3);
        solution.display(array);

    }
}
