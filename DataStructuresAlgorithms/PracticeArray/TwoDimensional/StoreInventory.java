package PracticeArray.TwoDimensional;

/*
 * The category with the most items in total (sum of all products within a category)
 * The category with the least items in total.
 * The total inventory count across all categories.
 */

public class StoreInventory {

    public static void analyzeInventory(int[][] inventory) 
    {
        int max_inventory= Integer.MIN_VALUE;
        int min_inventory= Integer.MAX_VALUE;
        int total_inventory=0;
        for (int i=0; i < inventory.length;++i)
        {
            int sum=0;
            for (int j=0; j< inventory[i].length;++j)
            {
                sum+= inventory[i][j];
            }

            if (sum < min_inventory){
                min_inventory= sum;
            }

            if (sum > max_inventory){
                max_inventory= sum;
            }
            total_inventory+= sum;
        }
        System.out.println("max found: " + max_inventory);
        System.out.println("min found: " + min_inventory);
        System.out.println("total_inventory found: " + total_inventory);

    }

    public static void main(String[] args) {
        int[][] inventory = {
            {10, 5, 15},
            {3, 6, 2, 5},
            {4, 2},
            {12, 18, 7}
        };
        
        analyzeInventory(inventory);
    }
}




