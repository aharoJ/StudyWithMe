package arrays;

public class Main {
    public static void main(String[] args) {
        StaticArray myArray = new StaticArray(10); // Create an array of size 10
        myArray.fillWithRandomValues();
        myArray.update(0, 5); // Update the first element to be 5
        myArray.display();
        myArray.searchByValue(5);


        // Search for the value 5 and print its index
        int index = myArray.searchByValue(5);
        if (index != -1) {
            System.out.println("Value 5 found at index: " + index);
        } else {
            System.out.println("Value 5 not found.");
        }
    }
}
