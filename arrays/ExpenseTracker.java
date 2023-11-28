package arrays;


public class ExpenseTracker {
    public static void main(String[] args) {
        // Define the expenses for each month
        int[] monthlyExpenses = {2200, 2350, 2600, 2130, 2190};

        // 1. How much more was spent in February compared to January
        int febExtra = monthlyExpenses[1] - monthlyExpenses[0];
        System.out.println("Extra spent in February compared to January: $" + febExtra);

        // 2. Calculate the total expense for the first quarter
        int firstQuarterTotal = monthlyExpenses[0] + monthlyExpenses[1] + monthlyExpenses[2];
        System.out.println("Total expense in the first quarter: $" + firstQuarterTotal);

        // 3. Check if $2000 was spent in any month
        for (int i = 0; i < monthlyExpenses.length; i++) {
            if (monthlyExpenses[i] == 2000) {
                System.out.println("Spent exactly $2000 in month: " + (i + 1));
            }
        }

        // 4. Add June's expense
        int[] updatedExpenses = new int[monthlyExpenses.length + 1];
        System.arraycopy(monthlyExpenses, 0, updatedExpenses, 0, monthlyExpenses.length);
        updatedExpenses[5] = 1980; // June's expense, corrected typo

        // 5. Correct April's expense by subtracting a refund
        updatedExpenses[3] -= 200; // April's correction, corrected typo

        // Print out the corrected expenses
        System.out.print("Corrected monthly expenses: ");
        for (int expense : updatedExpenses) {
            System.out.print("$" + expense + " ");
        }
    }
}
