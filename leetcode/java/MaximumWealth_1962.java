package leetcode.java;

public class MaximumWealth_1962 {
    public static void main(String[] args) {
        MaximumWealth_1962 solution = new MaximumWealth_1962();

        // Test Example 1
        int[][] accounts1 = {{1, 7, 3}, {3, 2, 1}};
        System.out.println("Maximum Wealth (Example 1): " + solution.maximumWealth(accounts1));

        // Test Example 2
        int[][] accounts2 = {{1, 1}, {7, 3}, {3, 5}};
        System.out.println("Maximum Wealth (Example 2): " + solution.maximumWealth(accounts2));

        // Test Example 3
        int[][] accounts3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println("Maximum Wealth (Example 3): " + solution.maximumWealth(accounts3));
    }

    public int maximumWealth(int[][] accounts) {
        int buchonPerson = Integer.MIN_VALUE;
        int brokePerson= Integer.MAX_VALUE;
        for (int i = 0; i < accounts.length; ++i) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; ++j) {
                sum += accounts[i][j];
            }
            
            if (sum > buchonPerson) {
                buchonPerson = sum;
            }
            
            if (sum < brokePerson){
                brokePerson = sum;
            }

        }
        return brokePerson;
    }
}
