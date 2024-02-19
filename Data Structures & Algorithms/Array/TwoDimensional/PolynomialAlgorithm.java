package Array.TwoDimensional;


public class PolynomialAlgorithm 
{

    public void print(int n){
        for (int i=1; i<=n; ++i){

            for(int j=1; j<=n;++j){
                System.out.println("i: " + i + "   j: " + j);


                // inner loop
            } System.out.println("End of inner Loop");

            // outer loop
        } System.out.println("End of outer Loop");
    }

    public void printLetter(int n) 
    {
        // Print column labels
        System.out.print("    ");
        for (char character = 'A'; character < 'A' + n; ++character) {
            System.out.print(" " + character + "   ");
        }
        System.out.println();
    
        for (int i = 1; i <= n; ++i) { // ROW: 1,2,3 
            // Print row label
            System.out.print(i + " [ ");
    
            for (int j = 1; j <= n; ++j) { // COLUMN: A,B,C
                // Print cell value as a combination of row number (i) and column letter (A, B, C, ...)
                System.out.print(i + "" + (char)('A' + j - 1));
    
                if (j < n) {
                    System.out.print(", ");
                }
            }
    
            // End of row
            System.out.println(" ]");
        }
    }
    
    public void printTacos(){
        // Define a 2D array of Strings. Each element (a taco) is an array of ingredients.
        String[][] tacos = new String[3][]; // Assuming 3 types of tacos for this example

        // Initialize each taco with its ingredients
        tacos[0] = new String[] {"beef", "cilantro", "onions", "salsa"}; // Carne Asada
        tacos[1] = new String[] {"chorizo", "potatoes", "onions", "salsa"}; // Chorizo
        tacos[2] = new String[] {"pork", "cilantro", "onions", "salsa"}; // Carnitas

        // Iterate through the tacos
        for (int i = 0; i < tacos.length; i++) {
            System.out.println("Taco #" + (i + 1) + ":");
            // Iterate through the ingredients of each taco
            for (int j = 0; j < tacos[i].length; j++) {
                System.out.println(" - " + tacos[i][j]);
            }
            System.out.println(); // Just for a clear output
        }
    }

    // This the one that works 
    public void customerWithMostMoney()
    {
        int[][] myNumbers = { 
            {1, 2, 3, 4, 5},
            {5, 6, 7},
            {2, 2}
        };

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int customerWithMaxMoney = -1;
        int customerWithLeastMoney = -1;

        for (int i = 0; i < myNumbers.length; i++) {
            int sum = 0;
            System.out.println("Calculating for Customer #" + (i + 1) );

            for (int j = 0; j < myNumbers[i].length; j++) {
                sum += myNumbers[i][j];
                System.out.println(" - Adding bank account #" + (j + 1) + " with amount: " + myNumbers[i][j]);
            }

            System.out.println(" -> Total for Customer #" + (i + 1) + ": " + sum);
            System.out.println();

            if (sum > maxSum) {
                maxSum = sum;
                customerWithMaxMoney = i;
            }

            if (sum < minSum) {
                minSum = sum;
                customerWithLeastMoney = i;
            }
        }

        System.out.println("Customer with the most money: Customer #" + (customerWithMaxMoney + 1) + " (Amount: " + maxSum + ")");
        System.out.println("Customer with the least money: Customer #" + (customerWithLeastMoney + 1) + " (Amount: " + minSum + ")");
    }



    public void customerWithMostCASH(){
        int[][] data = 
        { 
            {1, 2, 3, 4, 5},
            {5, 6, 7},
            {2, 2}
        };
        // int sum=0; WRONG 
        int richCustomer=Integer.MIN_VALUE;
        int brokeCustomer=Integer.MAX_VALUE;
        for (int i=0; i< data.length; ++i)
        {
            int sum=0;
            for ( int j=0; j < data[i].length; ++j )
            {
                sum+= data[i][j];
                // more descriptive
                // System.out.println("Customer #" + (i+1) + " has $" + sum);
            }
            
            if (sum < brokeCustomer){
                brokeCustomer = sum;
            }

            if (sum > richCustomer){
                richCustomer = sum;
            }
            // System.out.println(sum);

            // more descriptive
            // System.out.println("Rich Customer :)" + richCustomer);
            // System.out.println("Broke Customer :(" + brokeCustomer);
        }
    
        System.out.println(":) Rich Customer -- > " + richCustomer);
        System.out.println(":( Broke Customer --> " + brokeCustomer);
    }


    public void mostCASH()
    {
        int[][] data = 
        { 
            {1, 2, 3, 4, 5},
            {5, 6, 7},
            {2, 2}
        };

        int customerWithMostBread=0;
        for (int i=0; i< data.length; ++i)
        {
            int curr=0;
            for( int j=0; j <data[i].length; ++j) 
            {
                curr+= data[i][j];
            }

            System.out.println("Customer #" + (i+1) + " has $" + curr);


            if (customerWithMostBread < curr){
                customerWithMostBread= curr;
            }

        }
        System.out.println(customerWithMostBread);
    }


    public void BankProblem() {
        int[][] myNumbers = { 
            {1, 3, 9, 2, 8}, // Customer 0
            {5, 6, 7},       // Customer 1
            {5, 1}           // Customer 2
        };
        int rich_customer = Integer.MIN_VALUE;
        int broke_customer = Integer.MAX_VALUE;
        
        for (int i = 0; i < myNumbers.length; ++i) {
            int sum = 0; // Reset sum for each customer
            for (int j = 0; j < myNumbers[i].length; ++j) {
                sum += myNumbers[i][j]; // Add each amount to sum
                // Print the current sum for this customer after adding each amount
                System.out.println("Customer [" + i + "] Adding: " + myNumbers[i][j] + ", Current Sum: " + sum);
            }
            // After calculating the total sum for a customer, compare to find the richest and broke customer
            if (sum > rich_customer) {
                rich_customer = sum;
                System.out.println("New Richest Customer is Customer [" + i + "] with: " + rich_customer);
            }
            if (sum < broke_customer) {
                broke_customer = sum;
                System.out.println("New Broke Customer is Customer [" + i + "] with: " + broke_customer);
            }
            // Print a separator for clarity between customers
            System.out.println("---");
        }
        // Final print out of the richest and broke customer totals
        System.out.println("Richest Customer Total: [" + rich_customer + "]");
        System.out.println("Broke Customer Total: [" + broke_customer + "]");
    // Customer --> i
    // Bank --> J
    }
    


    public static void main(String[] args) 
    {
        PolynomialAlgorithm polynomialAlgorithm = new PolynomialAlgorithm();
        // polynomialAlgorithm.print(3);
        // polynomialAlgorithm.printLetter(3);
        // polynomialAlgorithm.printTacos();
        // polynomialAlgorithm.customerWithMostMoney();
        polynomialAlgorithm.BankProblem();

    }
}

