package arrays;
public class ArraysExercise {
    public static void main(String[] args) {
        String months[] = {"Jan", "Feb", "March", "Apr", "May"};
        int expense[]= {2200, 2350, 2600, 2130, 2190};

        

        for (int i=0; i< months.length; ++i)
        {
                System.out.println(months[i] + ": " + expense[i]);
        } 

        
    }
}
